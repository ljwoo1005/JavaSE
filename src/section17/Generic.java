package section17;
/*
 * 제네릭(Generic)
 * 	컴파일 시간에 타입 안정성을 보장하면서 유연성과 재사용성을 높이기 위한 기능
 * 	클래스나 메소드를 선언할 때 일반적인 타입 대신 타입 매개변수를 사용하여 유연성을 제공할 수 있다.
 * 	1. 잘못된 타입의 값이 들어오는 것을 방지할 수 있다.
 * 	2. 강제 형변환(cast)이 필요없다.
 */
public class Generic {
	public static void main(String[] args) {
		MyClass<String> mc1 = new MyClass<String>();
		mc1.setData("Hello, Generic");
		
		String data = mc1.getData();
		System.out.println(data);
		
		MyClass mc2 = new MyClass<>(); // 제네릭 생략 시 Object 타입으로 변한다.
		mc2.setData("Nice to meet you");
		String data2 = (String) mc2.getData(); // 현재 Object 타입이기 때문에 강제 형변환을 해줘야 한다.
		System.out.println(data2);
	}
}
