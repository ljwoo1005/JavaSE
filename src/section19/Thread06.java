package section19;

public class Thread06 {
	public static void main(String[] args) {
		System.out.println("메인스레드 시작");
		
		new Thread(new Runnable() { // Runnable 인터페이스를 이용해 익명클래스를 사용
			
			@Override
			public void run() {
				System.out.println("익명스레드 시작");
				
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				
				System.out.println("익명스레드 종료");
			}
		}).start();
		
		System.out.println("메인스레드 종료");
	}
}
