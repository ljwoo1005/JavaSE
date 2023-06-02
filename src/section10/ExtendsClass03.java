package section10;

import section10.access1.Car;

/*
 * 패키지(package)
 * 	관련된 클래스, 인터페이스 등 그룹화하는데 사용되는 디렉토리 구조
 * 
 * 	사용 이유
 * 		이름충돌 방지 : 같은 이름 패키지를 달리하여 충돌 방지
 * 		코드 구조화 : 관련된 클래스를 패키지 단위로 그룹화
 * 		접근 제어 : 클래스나 멤버에 접근제한자를 적용하여 해당 패키지를 외부에서 접근 제한 가능
 * 
 * 접근 제한자(Access Modifier)
 * 	자바에서 클래스, 멤버변수, 메소드 등 접근 범위를 제어하는데 사용되는 키워드
 * 		public		- 모든 클래스에서 접근 가능
 * 		protected	- 같은 패키지 또는 상속 관계에서 접근 가능
 * 		default		- 같은 패키지에서 접근 가능
 * 		private		- 본인 클래스 내에서 접근 가능
 * 
 * import
 * 	다른 패키지에 속한 클래스를 사용하기 위해 선언하는 키워드
 */
public class ExtendsClass03 {
	public static void main(String[] args) {
		Car car = new Car();
		car.model = "제네시스 GV80";
//		car.year = 2023; 		// protected 다른 패키지 접근 불가
//		car.color = "black";	// default 다른 패키지 접근 불가
//		car.brand = "Hyundai";	// private 다른 클래스 접근 불가
		
		car.getInfo();
	}
}
