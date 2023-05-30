package section07;

public class OOP03 {
	// 참조형|전역변수|동적
	Car car3 = new Car();
	
	public static void main(String[] args) {
		// 참조형|지역변수|동적
		Car car1 = new Car();
		Car car2 = new Car();
		
		car1.drive();
		car2.parking();
		
		System.out.println(System.identityHashCode(car1)); // System.identityHashCode(); -> 객체나 참조형변수의 주소값을 나타내는 메소드
		System.out.println(System.identityHashCode(car2)); // 참조형 변수 car1과 car2는 Car 클래스 객체의 주소값을 가지고 있다.
		// 기본형|지역변수
		int num = 10;
		double PI = 3.14;
		
	}
}

/*
 * JVM Runtime Data Area
 * Stack 영역 : 각 스레드마다 별도로 존재하며, 메서드 호출과 관련된 정보를 저장한다. 메서드 호출 시 지역 변수, 매개변수, 임시 데이터 등이 스택에 쌓인다. 먼저 실행되는 코드 순서로 맨 아래에서부터 차곡차곡 쌓이며, 메소드가 끝나면 마지막에 들어왔던 코드가 가장 먼저 사라지고, 맨 처음에 들어왔던 코드가 가장 마지막에 사라진다.
 * Heap 영역 : 객체와 Array가 쌓인다. 객체와 Array는 주소값을 가진다. 사라지는 순서는 없으며, 잘 사용되지 않는 객체는 Garbage Collector가 알아서 처리한다.
 * Heap 영역(Chat GPT) : 객체 인스턴스와 배열이 할당되는 공유 메모리 영역입니다. 동적으로 생성된 객체들은 힙 영역에 할당되며, Garbage Collector가 사용하지 않는 객체들을 정리합니다.
 * Method 영역 : 프로그램이 실행되기 직전 Constant Pool 영역에 상수 데이터가 올라가고, static 영역에 static을 선언한 데이터(변수, 메소드)가 올라간다. 프로그램 실행 코드 영역에 literal(기본형 변수) 데이터가 올라가고 프로그램 실행 코드를 바이트 단위로 읽어서 실행한다.
 * Method 영역(Chat GPT) : 모든 클래스에 대한 메타데이터를 저장하는 영역입니다. 클래스 이름, 상수 풀(Constant Pool), 필드 및 메서드의 이름, 데이터 타입, 접근 제어자 정보 등이 저장됩니다.
 */ 
