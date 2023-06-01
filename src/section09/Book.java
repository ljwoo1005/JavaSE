package section09;

public class Book {
	// 속성
	public String title;
	public int price;
	public int totalPage;
	public String author;
	
	public Book() {
		// TODO Auto-generated constructor stub
		title = "멘토씨리즈 자바";
		price = 32000;
		totalPage = 603;
		author = "김영우";
	}
	
	public void getInfo() {
		System.out.println("title : " + title);
		System.out.println("price : " + price);
		System.out.println("totalPage : " + totalPage);
		System.out.println("author : " + author);
	}
}
