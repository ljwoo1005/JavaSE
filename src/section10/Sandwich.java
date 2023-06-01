package section10;

public class Sandwich extends LoafBread {
	// 속성
	public String vegetable;
	public String ham;
	public String sauce;
	
	@Override
	public void getInfo() {
		// TODO Auto-generated method stub
		super.getInfo();
		System.out.println("vegetable : " + vegetable);
		System.out.println("ham : " + ham);
		System.out.println("sauce : " + sauce);
	}	
}
