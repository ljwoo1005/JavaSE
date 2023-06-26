package section19;

import section19.access1.CountThread;

public class Thread02 {
	public static void main(String[] args) {
		System.out.println("메인스레드 시작");
		
		CountThread cThread = new CountThread();
		cThread.start(); // 시간같은 경우는 프로그램 실행과 종료와 상관없이 흘러가야한다.
		
		System.out.println("메인스레드 종료");
	}
}
