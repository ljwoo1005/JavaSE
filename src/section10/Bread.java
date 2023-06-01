package section10;

public class Bread {
	/* 빵 속성
	 * 
	 * 1. 빵 이름
	 * 2. 빵 크기
	 * 3. 빵 종류
	 * 4. 빵 가격
	 * 5. 빵 브랜드
	 */
	
	public String breadName;
	public int breadSize;
	public String breadType;
	public int breadPrice;
	public String brand;
	
	public void getInfo() {
		System.out.println("breadName : " + breadName);
		System.out.println("breadSize : " + breadSize);
		System.out.println("breadType : " + breadType);
		System.out.println("breadPrice : " + breadPrice);
		System.out.println("brand : " + brand);
	}
}
