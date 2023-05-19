package section05;
/*
 * 2. do ~ while문
 * 	while문과 비슷하지만, 최소 한 번은 실행되는 반복문.
 * 
 * 	do {
 * 		반복 수행할 코드
 * 	} while(조건문);
 */
public class Loop02 {
	public static void main(String[] args) {
		int count = 101;
		do {
			System.out.println(count);
			count++;
		} while(count < 100);
	}

}
