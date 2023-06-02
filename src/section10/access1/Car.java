package section10.access1;

public class Car {
	public String model;
	protected int year;
	String color; // default : 아무것도 작성하지 않는 것
	private String brand;
	
	public void getInfo() {
		System.out.println("model : " + model);
		System.out.println("year : " + year);
		System.out.println("color : " + color);
		System.out.println("brand : " + brand);
	}
}
