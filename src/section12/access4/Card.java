package section12.access4;

public class Card {
	public static int width = 62;
	public static int heigth = 88;
	
	public String type = "Spade";
	public String number = "A";
	
	public void getInfo() {
		System.out.println("width : " + width);
		System.out.println("heigth : " + heigth);
		System.out.println("type : " + type);
		System.out.println("number : " + number);
	}
}
