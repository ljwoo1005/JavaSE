package section12.access3;

public class NormalTv implements Tv{

	@Override
	public void channel() {
		System.out.println("공영방송만 나옵니다.");
	}
	
}
