package section08;

public class Method03 {
	public static void main(String[] args) {
		
		printMember("025", "피카츄", 28);
		
	}
	// 3. 인자 o 여러타입 여러개 리턴x -> 여러 인자값을 받아 실행하고 끝나는 메소드
	public static void printMember(String id, String name, int age) {
		System.out.println("ID : " + id);
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
	}
}