package section11.access2;

public class IonicDrink extends Drink {
	
	public String brand;
	
	public IonicDrink() {
		name = "게토레이";
		volume = "600ml";
		type = "이온음료";
		price = 2000;
		discountRate = 0.5;
		brand = "롯데";
	}
	
	@Override
	public void getInfo() {
		super.getInfo();
		System.out.println("brand : " + brand);
	}
	
	public void taste() {
		System.out.println("구정물맛");
	}
}