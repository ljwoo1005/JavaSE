package section09;
/*
 * 생성자(Constructor)
 * 	객체가 생성되기 직전 실행되는 반환값이 없는 메소드(비유적인 표현이고 실제 메소드는 아님)
 * 	객체 초기화 목적에 주로 사용된다.
 * 	클래스명과 동일하다.
 */
public class Constructor01 {
	public static void main(String[] args) {
		Book book1 = new Book();
		book1.title = "이방인";
		book1.price = 9000;
		book1.totalPage = 280;
		book1.author = "알베르 카뮈";
		
		book1.getInfo();
		
		System.out.println("==============================");
		
		Book book2 = new Book();
		
		book2.getInfo();
	}
}
