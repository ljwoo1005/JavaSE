package section20;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Calendar;

/*
 * I/O (Input/Output)
 * 	데이터를 읽고 쓰는 작업을 의미한다.
 * 	자바에서 java.io 패키지를 통해 프로그래밍할 수 있다.
 * 
 * File Class
 * 	경로 정보를 받아 파일 또는 디렉토리 정보를 객체화
 */
public class IO01 {
	public static void main(String[] args) {
		// File 객체 생성
		File f = new File("C:\\");
		
		// C 드라이버 하위에 있는 모든 디렉토리 및 파일 반환
		String[] list = f.list();
		
		// Calendar 날짜관련 객체
		Calendar c = Calendar.getInstance();
		
		for(String temp : list) { // 파일 목록을 반복문으로 하나씩 가져오기
			// temp 명의 디렉토리 또는 파일을 객체화
			File f2 = new File(f, temp); // 첫번째 매개변수는 파일의 경로, 두번째 매개변수는 파일이나 디렉토리의 이름
			
			// 1970년 1월 1일부터 현재 수정된 날짜를 밀리세컨드로 반환한다.(timestamp)
			long lastMod = f2.lastModified();
			
			// 현재 파일 또는 디렉토리의 마지막 수정 날짜를 Calendar 객체로 변환 
			c.setTimeInMillis(lastMod); 
			
			// 마지막 수정한 날짜 포맷 변환
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd a hh:mm");
			String day1 = sdf.format(c.getTime());
			
			// isDirectory() - 디렉토리이면 true, 파일이면 false
			if(f2.isDirectory()) {
				System.out.print(f2.getName() + "(디렉토리) - ");
				System.out.println(day1);
			}
		}
		
		for(String temp : list) {
			File f2 = new File(f, temp);
			
			long lastMod = f2.lastModified();
			
			c.setTimeInMillis(lastMod);
			
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd a hh:mm");
			String day1 = sdf.format(c.getTime());
			
			// ifFile() - 파일이면 true
			if(f2.isFile()) {
				String size = String.format("%,d", f2.length());
				System.out.print(f2.getName() + "(파일) - ");
				System.out.print(size + "byte - ");
				System.out.println(day1);
			}
		}
	}
}
