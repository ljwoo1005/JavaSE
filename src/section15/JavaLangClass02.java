package section15;
/*
 * 1. 얕은복사(Shallow Copy)
 * 	- 참조형 변수에 주소값만 복사,
 *  - 동일한 객체를 참조하게 된다.
 *  
 *  2. 깊은복사(Deep Copy)
 * 	- 객체의 멤버 변수 값과 객체가 참조하는 객체까지 모두 복사하는 방식.
 * 	- 새로운(다른) 객체를 참조하게 된다.
 * 	- clone() 메소드를 사용하여 만드는 방법이 있다.
 */
import section15.access1.Sports;

public class JavaLangClass02 {
	public static void main(String[] args) throws CloneNotSupportedException {
		Sports sports1 = new Sports("축구", true);
		Sports sports2 = sports1;
		
		Sports sports3 = (Sports) sports1.callClone();
		
		if(sports1.equals(sports2)) {
			System.out.println("sports1과 sports2는 같습니다.");
		} else {
			System.out.println("sports1과 sports2는 다릅니다.");
		}
		
		if(sports1.equals(sports3)) {
			System.out.println("sports1과 sports3은 같습니다.");
		} else {
			System.out.println("sports1과 sports3은 다릅니다.");
		}
		
		System.out.println(sports3);
	}
}
