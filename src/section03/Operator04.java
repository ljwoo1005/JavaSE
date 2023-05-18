package section03;
/*
 * 4. 논리 연산자
 * 	&&	: And 조건, 교집합 개념, 양쪽 모두 true일때만 true
 *  ||	: Or 조건, 합집합 개념, 어느 한 쪽이 true이면 true
 *  !	: Not 조건, 여집합 개념, 논리값을 반전시킨다.
 */
public class Operator04 {
	public static void main(String[] args) {
		boolean result = true && false;
		System.out.println("&& : " + result);
		
		boolean result2 = true || false;
		System.out.println("|| : " + result2);
		
		boolean result3 = !true;
		System.out.println("! : " + result3);
		
		String order = "휴대폰";
		
		int price = 1000000;
		
		if(order == "컴퓨터" || order == "휴대폰" || order == "가전") {
			System.out.println("가정의달 할인 행사!!");
			System.out.println("원가 : " + price);
			System.out.println("할인가격 : " + price * 0.2);
			System.out.println("결제(할인적용)가격 : " + price * 0.8);
		} else {
			System.out.println("가정의달 할인 미적용 상품");
			System.out.println("원가 : " + price);
			System.out.println("할인가격 : " + price * 0);
			System.out.println("결제(할인적용)가격 : " + price * 1);
		}
		
		result = !(true && true && true) || false;
		System.out.println(result);
	}

}
