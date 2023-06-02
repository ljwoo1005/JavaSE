package section11;
/*
 * instanceof 연산자
 * 	객체가 특정 클래스 또는 인터페이스의 인스턴스인지 여부를 확인
 */
import section11.access2.Ade;
import section11.access2.Drink;
import section11.access2.IonicDrink;

public class Polymorphism03 {
	public static void main(String[] args) {
		int selectNum = Integer.parseInt(args[0]);
		System.out.println("selectNum : " + selectNum);
		
		Drink drink = selectDrink(selectNum);
		
		if(drink instanceof Ade) {
			Ade ade = (Ade) drink;
			ade.getInfo();
			ade.getDiscountRate();
			ade.zero();
		} else if(drink instanceof IonicDrink) {
			IonicDrink ionicDrink = (IonicDrink) drink;
			ionicDrink.getInfo();
			ionicDrink.getDiscountRate();
		}
	}
	
	/**
	 * 음료선택 메소드
	 * 1. Ade
	 * 2. IonicDrink
	 */
	
	public static Drink selectDrink(int selectNum) {
		Drink drink;
		if(selectNum == 1) {
			drink = new Ade();
		} else {
			drink = new IonicDrink();
		}
		
		return drink;
	}
}
