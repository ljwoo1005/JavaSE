package section22.client;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class EchoClient {
	public static void main(String[] args) throws IOException {
		Socket socket = null;
		OutputStream out = null;
		InputStream in = null;
		
		try {
			socket = new Socket("localhost", 3000); // 첫번째 매개변수에 IP정보, 두번째 매개변수에 포트. ip의 몇번 포트로 접속하겠다.
			
			// OutputStream을 통해 서버에 데이터 전송(요청)
			out = socket.getOutputStream();
			out.write("Hello, Socket".getBytes()); // .getBytes() : 문자열을 바이트 배열로 변환
			
			// 서버에서 보내온 데이터 읽어오기
			in = socket.getInputStream();
			byte[] b = new byte[1024];
			
			int readByteCnt = in.read(b);
			
			System.out.println(new String(b, 0 , readByteCnt));
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if(in != null) in.close();
			if(out != null) out.close();
			if(socket != null) socket.close();
		}
	}
}
