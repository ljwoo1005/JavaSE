package section10.access2;

import section10.access1.Car;

public class SportsCar extends Car {
	public boolean isOpen;
	
	@Override
	public void getInfo() {
		System.out.println("model : " + model);
		System.out.println("year : " + year); // protected 상속관계 접근 가능
//		System.out.println("color : " + color); // default 다른 패키지 접근 불가
//		System.out.println("brand : " + brand); // private 다른 클래스 접근 불가
		System.out.println("isOpen : " + isOpen);
	}
}
