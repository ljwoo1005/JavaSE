package section10;

public class LoafBread extends Bread { // 식빵
	public boolean isSlice;
	
	@Override
	public void getInfo() {
		// TODO Auto-generated method stub
		super.getInfo();
		System.out.println("isSlice : " + isSlice);
	}
}
