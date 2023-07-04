package section21;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/*
 * JDBC(JAVA DataBase Connectivity)
 * 	자바 어플리케이션에서 데이터베이스와 통신할 수 있는 API
 * 
 * JDBC 설정
 * 	해당 DBMS 관련 jdbc.jar 추가해야한다.
 * 	ex) 오라클 - ojdbc8.jar
 * 		[Build path] -> [Configure Build path ...] -> [Libraries] 탭 -> [Add External JARs ...] 로 ojdbc8.jar 파일 추가
 */
public class JDBC01 {
	public static void main(String[] args) throws SQLException {
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		try {
			// 1. 드라이버 클래스 정보 로딩
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			// 2. 데이터베이스 연결
			String url = "jdbc:oracle:thin:@localhost:21521:xe";
			conn = DriverManager.getConnection(url, "hr", "hr"); // sqlDevloper에서 "접속" 누른것과 동일
			
			// 3. 쿼리 수행을 위해 Statement 객체 생성
			stmt = conn.createStatement(); // sqlDevloper에서 워크시트 켜진것과 동일(쿼리를 받아들일 준비가 됨)
			
			// 4. SQL 쿼리 작성
			String param = "30";
			String sql = "SELECT * "
					+ "FROM employees "
					+ "WHERE department_id =" + param;
			
			// 5. 쿼리 수행
			rs = stmt.executeQuery(sql); // 워크시트에서 ctrl + enter 누른것과 동일
			
			while(rs.next()) { // rs 객체에서 실행된 데이터를 행단위로 하나씩 가져온다.
				String employeeID = rs.getString("employee_id"); // 매개변수로 컬럼명 작성하면 변수로 컬럼에 해당하는 데이터 전달
				String firstName = rs.getString("first_name");
				String lastName = rs.getString("last_name");
				
				System.out.println(employeeID + "/" + firstName + "/" + lastName);
			}
			
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			if(rs != null) rs.close();
			if(stmt != null) stmt.close();
			if(conn != null) conn.close();
		}
	}
}
