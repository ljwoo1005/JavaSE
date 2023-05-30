package section08;

public class Method06 {
	public static void main(String[] args) {
		String name = getName();
		System.out.println("name : " + name);
		System.out.println("name : " + getName());
	}
	
	// 6. 인자 x 리턴 o -> 메소드를 실행하여 값을 반환한다.
	public static String getName() {
		String name = "피카츄";
		
		return name;
	}
}
