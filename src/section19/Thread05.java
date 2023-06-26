package section19;
/* 병렬 Thread를 사용하기 위해 Thread 클래스를 상속받아 사용했다.
 * 하지만 이미 다른 클래스를 상속받은 클래스에서 병렬 Thread를 사용하기 위해선 어떻게 해야 할까?
 */
import section19.access3.InterThread;

/*
 * Runnable 인터페이스
 * 	Thread 상속 대신 Runnable 인터페이스를 상속받아 Thread 객체 구현
 */
public class Thread05 {
	public static void main(String[] args) {
		System.out.println("메인스레드 시작");
		
		Runnable iThread = new InterThread(); // 다른 스레드 객체 생성
		
		Thread thread = new Thread(iThread); // 위의 객체에선 .run() 메소드가 없기에 Thread 객체를 생성하고 iThread를 매개변수로 넣어 iThread를 감쌌다.
		
		thread.start();
		
		System.out.println("메인스레드 종료");
	}
}
