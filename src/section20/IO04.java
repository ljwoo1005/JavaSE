package section20;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * InputStream / OutputStream
 * 	바이트 기반 입력과 출력을 다루는 추상 클래스이다.
 * 
 * FileInputStream
 * 	파일을 바이트 단위로 순차적으로 읽는 객체
 * 
 * FileOutputStream
 * 	파일을 바이트 단위로 순차적으로 쓰는 객체
 */
public class IO04 {
	public static void main(String[] args) throws IOException {
		FileInputStream fis = null;
		FileOutputStream fos = null;
		
		try {
			// hello.txt 파일을 읽기 위한 객체
			fis = new FileInputStream("./upload/hello.txt");
			
			File f1 = new File("./upload2"); // /(뎁스)가 여러개 있을 경우 .mkdirs()로 해야한다.
			if(f1.mkdirs()) {
				System.out.println("upload2 디렉토리가 생성되었습니다.");
			}
			
//			File f2 = new File(f1, "hello2.txt");
//			if(f2.createNewFile()) {
//				System.out.println("hello2.txt 파일이 생성되었습니다.");  // f1객체 경로에 hello2.txt 파일 생성
//			}
			
			// hello2.txt 파일을 쓰기 위한 객체
			// 위에서 파일을 생성하여 객체 생성하는 방법
//			fos = new FileOutputStream(f2);
			
			// FileOutputStream 경로에 디렉토리는 존재해야하며, 없으면 에러
			// 파일은 경로에 존재하지 않을 시 자동으로 생성해준다.
			// 파일을 생성하지 않고 객체 생성하는 방법
			fos = new FileOutputStream("./upload2/hello2.txt");
			
			int readByteCnt = 0;
			byte[] b = new byte[100]; // 100바이트 공간 준비
			 // while문 한 번 돌 때 100바이트씩 읽어서 b에 저장, fis.read(b)에서 읽은 값을 readByteCnt에 저장, 읽을 것이 없으면 -1 반환
			while((readByteCnt = fis.read(b)) != -1) {
				fos.write(b, 0, readByteCnt); // b = 100바이트 단위로 읽는다, 0 = 어디에서부터 작성할지, readByteCnt = 위에서 받은 데이터 작성
			}
			
			System.out.println("파일복사 완료");
			
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			if(fos != null) fos.close(); // 객체가 null인 상태에서 .close() 메소드를 실행하면 오류가 발생한다.
			if(fis != null) fis.close();
		}
	}
}
