package section19;

import section19.access1.CountThread;

public class Thread03 {
	public static void main(String[] args) {
		System.out.println("메인스레드 시작");
		
		CountThread cThread = new CountThread();
		cThread.setName("CountThread"); // 스레드 이름을 설정
		cThread.start();
		
		for(int i = 0; i < 10; i++) {
			System.out.print(Thread.currentThread().getName() + "-"); // 현재 실행되고 있는 스레드의 이름을 출력한다.
			System.out.println(i*100);
			
			try {
				Thread.sleep(500); // 0.5초 일시정지
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		System.out.println("메인스레드 종료");
		
	}
}
