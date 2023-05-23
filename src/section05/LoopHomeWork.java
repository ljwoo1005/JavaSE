package section05;

import java.util.Scanner;

/*
1번 분석하고 연습해보기

*
**
***
****
*****
******
*******

	public static void main(String[] args) {
		for(int i = 1; i < 10; i++) {
			for(int j = 1; j < i + 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

반복문 조건문 연습
 주말숙제 2중for문 코드 분석하기 
 
2번

   *
  **
 ***
****

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int num01 = scanner.nextInt();
		
			for(int a=0; a<num01; a++) {
				for(int i=num01-a-1; i>0; i--) {
					System.out.print(' ');
				}
				for(int j=1; j<=a+1; j++) {
					System.out.print('*');
				}
				System.out.println();
			}
	}

3번

   *
  ***
 *****
******* 

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int num01 = scanner.nextInt();
		
			for(int a=0; a<num01; a++) {
				for(int i=num01-a-1; i>0; i--) {
					System.out.print(' ');
				}
				for(int j=1; j<=a+1; j++) {
					System.out.print('*');
				}
				for(int k=2; k<=a+1; k++) {
					System.out.print('*');
				}
				System.out.println();
			}
		}
  
4번
			
   *				
  ***				  
 *****				
*******		
 *****			 
  ***			 
   *			

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int num01 = scanner.nextInt();
		int count02 = num01/2;
		
			for(int count01=0; count01<num01; count01++) {
				if(count01<=num01/2) {
					for(int i=num01/2-count01; i>0; i--) {
						System.out.print(' ');
					}
					for(int j=1; j<=count01+1; j++) {
						System.out.print('*');
					}
					for(int k=2; k<=count01+1; k++) {
						System.out.print('*');
					}
				}
				else {
					for(int l=0; l<=num01/2-count02; l++) {
						System.out.print(' ');
					}
					for(int m=1; m<=count02; m++) {
						System.out.print('*');
					}
					for(int n=2; n<=count02; n++) {
						System.out.print('*');
					}
					count02--;
				}
				System.out.println();
			}
	}

5번

   ☆
   *
  ***
 *****
******* 
  | | Merry Christmas~*
  
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int num01 = scanner.nextInt();
		
			for(int a1=0; a1<num01-1; a1++) {
				System.out.print(' ');
			}
			System.out.println('☆');
			
			for(int a=0; a<num01; a++) {
				for(int i=num01-a-1; i>0; i--) {
					System.out.print(' ');
				}
				for(int j=1; j<=a+1; j++) {
					System.out.print('*');
				}
				for(int k=2; k<=a+1; k++) {
					System.out.print('*');
				}
				System.out.println();
			}
			for(int a2=0; a2<num01-2; a2++) {
				System.out.print(' ');
			}
			System.out.println("| | Merry Christmas~*");
		}
  
 
 구구단
  2 x 1 = 2		3 x 1 = 3	 4 x 1 = 4
  2 x 2 = 4
  ...
  2 x 9 = 18
  
  5 x 1 = 5 	6 x 1 = 6	 7 x 1 = 7
  ...
  5 x 9 = 45 	6 x ...
  
  8 x 1 = 1		9 x 1 = 9
  
  ....			9 x 9 = 81
  

 
 */

public class LoopHomeWork {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int num01 = scanner.nextInt();
		
			for(int a1=0; a1<num01-1; a1++) {
				System.out.print(' ');
			}
			System.out.println('☆');
			
			for(int a=0; a<num01; a++) {
				for(int i=num01-a-1; i>0; i--) {
					System.out.print(' ');
				}
				for(int j=1; j<=a+1; j++) {
					System.out.print('*');
				}
				for(int k=2; k<=a+1; k++) {
					System.out.print('*');
				}
				System.out.println();
			}
			for(int a2=0; a2<num01-2; a2++) {
				System.out.print(' ');
			}
			System.out.println("| | Merry Christmas~*");
		}
}
/*
   ☆
   *
  ***
 *****
******* 
  | | Merry Christmas~*
*/