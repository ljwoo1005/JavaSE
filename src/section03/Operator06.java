package section03;
/*
 * 6. 비트 연산자
 * 	2진수로 표현된 두 비트 연산자
 * 
 * 	& 	: 대응되는 비트가 모두 1이면 1을 반환(비트 AND 연산자)
 *  |	: 대응되는 비트 중에서 하나라도 1이면 1을 반환(비트 OR 연산자)
 *  ^	: 대응되는 비트가 서로 다르면 1을 반환(비트 XOR(==exclusive or) 연산자)
 *  ~	: 비트가 1이면 0으로, 0이면 1로 반전(비트 NOT 연산자)
 *  
 * 7. 쉬프트 연산자
 * 	<<	: 지정한 수만큼 비트를 전부 왼쪽으로 이동시킴(left shift 연산자)
 *  >>	: 부호를 유지하면서 지정한 수만큼 비트를 전부 오른쪽으로 이동시킴(right shift 연산자)
 */
public class Operator06 {
	public static void main(String[] args) {
		int num1 = 3; // 0 0011
		int num2 = 5; // 0 0101
		
		System.out.println("num1 & num2 : " + (num1 & num2));
		System.out.println("num1 | num2 : " + (num1 | num2));
		System.out.println("num1 ^ num2 : " + (num1 ^ num2));
		// 3	-> 0 0011
		// ~3	-> 1 1100
		// 4의 2의 보수값
		// 4	-> 0 0100
		// 4의 1의 보수값 -> 1 1011
		// 4의 2의 보수값 -> 1 1100		-> -4
		
		System.out.println("~num1 : " + ~num1);
		
		int x;
		x = 3;
		System.out.printf("%d\n", (x << 2)); // 0011 << 2 -> 1100
		System.out.printf("%d\n", (x >> 2)); // 0011 >> 2 -> 0000
	}

}
