package section02;
/*
 * 4. 실수형
 * 	소수부나 지수부가 있는 수를 가르킨다.
 * 	실수를 저장할 수 있는 자료형
 * 
 * 	float	(4byte) : 소수점 7자리 표현
 *  double	(8byte) : 소수점 15자리 표현
 */
public class Variable04 {
	public static void main(String[] args) {
		float iFloat = 10.1f;
		double iDouble = 10.1d;
		double iDouble2 = 10.2;
		
		System.out.println("float형 : " + iFloat);
		System.out.println("double형 : " + iDouble);
		System.out.println("double형 2번 : " + iDouble2);
	}

}
