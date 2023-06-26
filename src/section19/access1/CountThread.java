package section19.access1;

public class CountThread extends Thread {
	@Override
	public void run() {
		System.out.println("CountThread 시작");
		
		for(int i = 0; i < 10; i ++) {
			System.out.print(Thread.currentThread().getName() + "-"); // 현재 실행되고 있는 스레드의 이름을 출력한다.
			System.out.println(i);
			
			try {
				Thread.sleep(1000); // 1초 일시정지
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		System.out.println("CountThread 종료");
	}
}
