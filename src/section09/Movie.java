package section09;

public class Movie {
	public String title;
	public int price;
	public String director;
	
	static {
		System.out.println("Movie() static 초기화 블럭");
	}
	
	// 초기화 블럭
	{
		this.title = "매트릭스";
		this.price = 14000;
		this.director = "워쇼스키 자매";
		System.out.println("Movie() 초기화 블럭");
	}
	
	public Movie() {
		this.title = "기생충";
		this.price = 14000;
		this.director = "봉준호";
		System.out.println("Movie() 생성자");
	}
	
	@Override
	public String toString() {
		return title + " / " + price + " / " + director;
	}
}
