package section10;

public class ExtendsClass02 {
	public static void main(String[] args) {
		Sandwich sandwich = new Sandwich();
		sandwich.breadName = "오트밀";
		sandwich.brand = "파리바게트";
		sandwich.ham = "슬라이스햄";
		sandwich.vegetable = "양상추";
		sandwich.sauce = "오리엔탈";
		
		sandwich.getInfo();
	}
}
