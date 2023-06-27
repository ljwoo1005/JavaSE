package section20;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

/*
 * BufferedInputStream / BufferedOutputStream
 * 	자바에서 성능을 향상시켜주기 위한 I/O 보조 스트림
 */
public class IO05 {
	public static void main(String[] args) throws IOException {
		FileInputStream fis = null;
		BufferedInputStream bis = null;
		
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		
		PrintStream ps = null;
		
		try {
			fis = new FileInputStream("./upload/hello.txt");
			// 기존 스트림을 감싸서 버퍼에 저장
			bis = new BufferedInputStream(fis);
			
			fos = new FileOutputStream("./upload2/hello3.txt");
			// 기존 스트림을 감싸서 버퍼에 저장
			bos = new BufferedOutputStream(fos);
			
			ps = new PrintStream(bos, true); // bos를 PrintStream으로 감쌌다. autoFlush를 true로 했다.
			
			int readByteCnt = 0;
			byte[] b = new byte[1024];
			
			while((readByteCnt = bis.read(b)) != -1 ) {
				bos.write(b, 0, readByteCnt);
			}
			
			bos.flush(); // 버퍼에 남은 데이터를 파일에 쓰고 버퍼를 비움
			
			// bos가 참조하고 있는 파일에 데이터를 작성한다.
			ps.println();
			ps.println("==================================");
			ps.println("PrintStream 테스트 중...");
			ps.println("프린트스트림으로 작성했어요");
			ps.println("==================================");
			
			System.out.println("파일복사 완료");
			
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			// close 순서는 맨 아래에서부터 위로, stack메모리처럼 역순으로 한다.
			if(bos != null) bos.close();
			if(fos != null) fos.close();
			if(bis != null) bis.close();
			if(fis != null) fis.close();
			
		}
	}
}
