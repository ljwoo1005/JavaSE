package section07;
/*
 * Car 클래스 만들기
 */
public class Car {
	// 맴버필드 선언 및 초기화
	static int wheel = 4; 	// 바퀴 4개

	String color;
	
	// 메소드 - 객체에서 기능 역할
	public void drive() {
		System.out.println("운전을 해요");
	}
	
	public void parking() {
		System.out.println("주차를 해요");
	}
}
