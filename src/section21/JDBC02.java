package section21;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBC02 {
	public static void main(String[] args) throws SQLException {
		Connection conn = null;
		Statement stmt = null;
		
		try {
			// 1. 드라이버 클래스 정보 로딩
			Class.forName("oracle.jdbc.driver.OracleDriver");
						
			// 2. 데이터베이스 연결
			String url = "jdbc:oracle:thin:@localhost:21521:xe";
			conn = DriverManager.getConnection(url, "hr", "hr"); // sqlDevloper에서 "접속" 누른것과 동일
						
			// 3. 쿼리 수행을 위해 Statement 객체 생성
			stmt = conn.createStatement(); // sqlDevloper에서 워크시트 켜진것과 동일(쿼리를 받아들일 준비가 됨)
						
			// 4. SQL 쿼리 작성
			String sql = "INSERT INTO sales_reps "
					+"VALUES (1, '피카츄', 200, 0.2)"; // INSERT문으로 테이블에 데이터 추가
						
			// 5. 쿼리 수행
			int result = stmt.executeUpdate(sql); // 워크시트에서 ctrl + enter 누른것과 동일
			
			// 6. 실행결과 출력하기
			if(result > 0) { // 보통 result에 1이상 나오면 데이터 추가 성공한것
				System.out.println("데이터 추가 성공");
			} else {
				System.out.println("데이터 추가 실패");
			}
			
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			if(stmt != null) stmt.close();
			if(conn != null) conn.close();
		}
	}
}
