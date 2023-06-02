package section11.access2;

public class Ade extends Drink {
	
	public String brand;
	public boolean isZero;
	public Ade() {
		name = "레몬에이드";
		volume = "350ml";
		type = "탄산";
		price = 1900;
		discountRate = 0.333;
		brand = "썬키스트";
		isZero = true;
	}
	
	@Override
	public void getInfo() {
		super.getInfo();
		System.out.println("brand : " + brand);
	}
	
	public void taste() {
		System.out.println("레몬맛");
	}
	
	public void zero() {
		if(isZero) {
			System.out.println("ZERO 입니다.");
		} else {
			System.out.println("일반탄산입니다.");
		}
	}
}