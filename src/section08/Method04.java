package section08;
/*
 * 오버로딩(Overloading)
 * 	클래스 내에서 같은 이름을 가진 메소드를 여러 개 정의하는 것을 말한다.
 * 	매개변수의 개수 또는 타입이 다르면 가능하다.
 */
public class Method04 {
	public static void main(String[] args) {

		printMember("025", "피카츄", 28);
		
		printNumber("10");
		printNumber(10);
		

	}

	// 3. 인자 o 여러타입 여러개 리턴x -> 여러 인자값을 받아 실행하고 끝나는 메소드
	public static void printMember(String id, String name, int age) {
		System.out.println("ID : " + id);
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
	}
	// 4. ★★★★★오버로딩(Overloading) 메소드
	public static void printMember(String id, String name, int age, String mobile) {
		System.out.println("ID : " + id);
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
		System.out.println("연락처 : " + mobile);
	}
	
	public static void printNumber(String num) {
		System.out.println("num : " + num);
	}
	
	public static void printNumber(int num) {
		System.out.println("num : " + num);
	}
}