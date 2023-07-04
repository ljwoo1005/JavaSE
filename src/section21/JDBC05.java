package section21;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JDBC05 {
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

			// 3. 쿼리 작성
			pstmt = conn.prepareStatement(
					"UPDATE sales_reps SET "
					+ "name = ? "
					+ "WHERE id = ?"
					);
			
			pstmt.setString(1, "리자몽");
			pstmt.setString(2, "5");
			
			int result = pstmt.executeUpdate();
			if(result > 0) {
				System.out.println("데이터 UPDATE 성공");
			} else {
				System.out.println("데이터 UPDATE 실패");
			}
			
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
