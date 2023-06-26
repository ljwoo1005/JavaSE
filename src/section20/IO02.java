package section20;

import java.io.File;
import java.io.IOException;

/*
 * 경로(path) - 파일이나 디렉토리 위치를 나타내는 문자열
 * 
 * 1. 절대경로
 * 	파일 시스템의 루트 디렉토리부터 출발하여 파일이나 디렉토리를 찾는 경로
 * 	ex) C:\Users\이진찬\git\JavaSE\src\section20\IO02.java
 * 
 * 2. 상대경로
 * 	현재 작업 디렉토리를 기준으로 파일이나 디렉토리를 찾는 경로
 * 	ex) . -> 현재 위치
 * 		.. -> 상위폴더 위치
 */
public class IO02 {
	public static void main(String[] args) throws IOException {
		
		File f1 = new File("./", "java.txt");
		
		// .creatNewFile() - 파일 생성하면 true, 못하면 false 
		if(f1.createNewFile()) {
			System.out.println("java.txt 파일이 생성되었습니다.");
		}
		
		// .delete()
		if(f1.delete()) {
			System.out.println("java.txt 파일이 삭제되었습니다.");
		}
	}
}
