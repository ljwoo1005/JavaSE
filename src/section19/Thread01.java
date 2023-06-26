package section19;
/*
 * 스레드(Thread)
 * 	스레드는 프로그램 내에서 실행되는 프로그램 제어 흐름(실행단위)을 말한다.
 * 	하나의 프로세스 내부에서 독립적으로 실행되는 하나의 작업단위
 * 	병렬 프로그래밍
 * 	비동기 프로그래밍
 * 
 * 스레드 실행방법
 * 	1. Thread 클래스 상속
 *  2. .run() 메소드 오버라이딩하여 구현
 *  3. 1번의 Thread 상속받은 클래스 생성
 *  4. 3번의 상속받은 객체에서 .start() 메소드 호출
 */
public class Thread01 {
	public static void main(String[] args) {
		System.out.println("메인 스레드 시작");
		
		MyThread thread1 = new MyThread();
		thread1.start(); // 메인 메소드와는 별개로 따로 실행된다.
		
		System.out.println("메인 스레드 종료");
	}
}
