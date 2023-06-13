package section12.access2;

public interface Cat {
	public final int PAW = 4; // 인터페이스 안에서 변수 선언하면 상수가 된다. final 예약어를 써도 되고 안써도 된다. 보통 쓴다.
	
	public void eat(); // abstract 예약어를 써도 되고 안써도 된다. 보통 인터페이스 안에서는 안쓴다.
	
	public void sleep();
	
	public void hunt();
	
}
