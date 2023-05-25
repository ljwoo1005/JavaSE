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
 * 	같은 타입의 모든 객체가 공유하는 변수
 * 	클래스명으로 접근 가능
 * 	객체 생성 없이 불러올 수 있다.
 */
public class Var {
	int globalNum = 100;
	static int globalNum2; // 변수선언하고 초기화 하지 않음
	
	public static void main(String[] args) {
		int areaNum2; // 변수선언하고 초기화 하지 않음
		
		System.out.println("globalNum2 : " + globalNum2);
//		System.out.println("areaNum2 : " + areaNum2);
		
		
	}
	
	public static void getAreaNum() {
		int areaNum = 30;
	}
	
	public void printNum() {
		System.out.println("globalNum : " + globalNum);
//		System.out.println("areaNum : " + areaNum);
	}
}
