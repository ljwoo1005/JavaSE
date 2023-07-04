package section21;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JDBC04 {
	public static void main(String[] args) throws SQLException {
			Connection conn = null;
			// Statement 사용하지 않기!! PrepareStatement 사용하기!!
			PreparedStatement pstmt = null;
			boolean isSuccess = false;
			
			try {
				// 1. 드라이버 클래스 정보 로딩
				Class.forName("oracle.jdbc.driver.OracleDriver");
										
				// 2. 데이터베이스 연결
				String url = "jdbc:oracle:thin:@localhost:21521:xe";
				conn = DriverManager.getConnection(url, "hr", "hr"); // sqlDevloper에서 "접속" 누른것과 동일
				
				// 트랜젝션 시작
				conn.setAutoCommit(false);
				
				// 3. 쿼리 작성
				pstmt = conn.prepareStatement(
						"INSERT INTO sales_reps VALUES (2, '라이츄', 200, 0.2)"
						);
				pstmt.executeUpdate();
				
				pstmt = conn.prepareStatement(
						"INSERT INTO sales_reps VALUES (3, '야도란', 300, 0.3)"
						);
				pstmt.executeUpdate();
				
				pstmt = conn.prepareStatement(
						"INSERT INTO sales_reps VALUES (4, '파이리', 400, 0.4)"
						);
				pstmt.executeUpdate();
				
				pstmt = conn.prepareStatement(
						"INSERT INTO sales_reps VALUES (5, '잠만보', 900, 0.9)"
						);
				pstmt.executeUpdate();
				
				isSuccess = true;
				
			} catch(Exception e) {
				e.printStackTrace();
			} finally {
				if(isSuccess) {
					conn.commit();
					System.out.println("트랜젝션 처리 성공");
				} else {
					conn.rollback();
					System.out.println("트랜젝션 처리 실패");
				}
				if(pstmt != null) pstmt.close();
				if(conn != null) conn.close();
			}	
	}
}
