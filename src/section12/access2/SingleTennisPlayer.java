package section12.access2;

public class SingleTennisPlayer implements Tennis {
	
	@Override
	public void getPlayer() {
		System.out.println("조코비치");
	}

	@Override
	public void getSkill() {
		System.out.println("강도 높은 스트로크");
	}

	@Override
	public void getCountry() {
		System.out.println("세르비아");
	}
	
}
