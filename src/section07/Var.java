package section07;
/*
 * 변수(Variable)
 * 	값을 저장하기 위한 메모리 공간
 * 	변수는 이름을 통해 해당 메모리 공간에 접근하고 값을 읽거나 수정할 수 있다.
 * 
 * 변수 선언 및 초기화
 * 	자료형(type) 변수명 = 값 or 객체;
 * 
 * 1. 타입에 따른 변수
 * 	기본형 -	예약어, 소문자로 시작, 직접 값을 가지고 있다.
 * 		8가지 - boolean, char, byte, short, int, long, float, double
 * 	참조형 -	기본형 외 나머지 전부, 참조(주소)값을 가지고 있다. 보통 대문자로 시작하지만 소문자도 가능하다.
 * 		예) String 
 * 
 * 2. 선언 위치에 따른 변수
 * 	전역변수 -	클래스 안에 선언된 변수(멤버변수 혹은 멤버필드)
 *			초기화하지 않으면 default값이 들어간다.
 *			boolean - false
 *			정수형 - 0
 *			실수형 - 0.0
 *			참조형 - null(참조할 주소값이 없다)
 *
 * 	지역변수 -	메소드 또는 생성자 안에 선언된 변수(매개변수도 지역변수이다.)
 * 			초기화하지 않으면 컴파일에러 발생(반드시 초기화하기)
 * 			메소드 종료시 같이 소멸된다.
 * 
 * 3. 정적(static) 변수
 * 	static이 붙은 멤버변수
 * 	같은 타입의 모든 객체가 공유하는 변수. 예) 카드의 길이, 높이
 * 	클래스명으로 접근 가능. (객체명으로도 접근은 가능하지만 클래스명으로 접근하는 것이 알아보기 쉽다.)
 * 	객체 생성 없이 불러올 수 있다. 프로그램 실행 직전 static 영역 메모리에 데이터가 올라와있기 때문.
 */
public class Var {
	int globalNum = 100;
	static int globalNum2; // 변수선언하고 초기화 하지 않음
	
	public static void main(String[] args) {
		int areaNum2; // 변수선언하고 초기화 하지 않음(지역변수 : 메소드가 끝날 때 같이 사라진다.)
		
//		System.out.println("globalNum : " + globalNum); -> static 영역 안에서 Var 클래스의 객체가 메모리에 존재하지 않아서 오류가 발생한다.

		Var var1 = new Var(); // Var 클래스의 객체 생성
		System.out.println("globalNum : " + var1.globalNum); // 이제 static 영역에 Var 클래스의 객체가 생성됐으니 정상적으로 코드가 실행된다.
		
		var1.printNum(); // Var 클래스의 메소드를 실행
		
		getAreaNum(); // static 영역에 올라온 메소드이기 때문에 객체명을 붙이지 않아도 실행 가능하다.
		
		System.out.println("globalNum2 : " + globalNum2); // -> static 변수를 불러왔기 때문에 객체 생성 없이도 변수를 불러올 수 있다. 그리고 전역변수이기 때문에 초기화하지 않아도 default값이 존재한다.
//		System.out.println("areaNum2 : " + areaNum2); -> 지역변수를 초기화하지 않아 오류가 발생한다.
		
		
	}
	
	public static void getAreaNum() {
		int areaNum = 30;
	}
	
	public void printNum() {
		System.out.println("globalNum : " + globalNum); // 전역변수 불러오기
//		System.out.println("areaNum : " + areaNum); //
	}
}
