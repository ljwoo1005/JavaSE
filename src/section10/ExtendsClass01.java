package section10;
/*
 * 상속(extends)
 * 	부모 클래스(상위 클래스)와 자식 클래스(하위 클래스)가 있으며,
 * 	자식 클래스는 부모 클래스를 상속받아 그 부모의 멤버(변수, 메소드)를 그대로 사용이 가능하다.
 * 	클래스 하나당 상속 한 개 가능
 * 
 * 상속 방법
 * 	class 하위 클래스명 extends 상위 클래스명
 * 
 * super 키워드
 * 	부모객체를 참조하는 키워드
 * 
 * ★★★★★오버라이딩(Overriding)
 * 	상속받은 메소드를 하위클래스에서 재정의하여 사용하는 것을 말한다.
 */
public class ExtendsClass01 {
	public static void main(String[] args) {
		
		Bread bread = new Bread();
		bread.breadName = "튀김소보로";
		bread.breadSize = 20;
		bread.breadType = "소보로";
		bread.breadPrice = 3000;
		bread.brand = "성심당";
		
		bread.getInfo();
		
		System.out.println("===============================");
		
		LoafBread loafBread = new LoafBread();
		loafBread.breadName = "우유식빵";
		loafBread.breadSize = 30;
		loafBread.breadType = "식빵";
		loafBread.breadPrice = 4500;
		loafBread.brand = "파리바게트";
		loafBread.isSlice = true;
		
		loafBread.getInfo();
		
	}
}
