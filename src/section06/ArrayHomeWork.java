package section06;
/*

다음주까지 숙제!!
 1  2  3  4  5  6  7  i=0, j=0 | i=0, j=1 and i=1, j=0 | i=2, j=0 and i=1, j=1 and i=0, j=2
 8  9  10 11 12 13 14 i=0, j=3 and i=1, j=2 and i=2, j=1 and i=3, j=0
 15 16 17 18 19 20 21 i=4, j=0 and i=3, j=1 and i=2, j=2 and i=1, j=3 and i=4, j=0
 22 23 24 25 26 27 28 i=0, j=5 ... i=5, j=0 | i=6, j=0 ... i=0, j=6
 29 30 31 32 33 34 35 i=1, j=6 ... i=6, j=1 | i=6, j=2 ... i=2, j=6
 36 37 38 39 40 41 42 i=3, j=6 ... i=6, j=3 | i=6, j=4 ... i=4, j=6
 43 44 45 46 47 48 49 i=5, j=6 ... i=6, j=5 | i=6, j=6
 
 1. 2중배열선언하고
 2. for 문으로 값을 1~49까지 위모양으로 넣으세요
 3. 아래 모양으로 출력하게 해줘
 
1
2 8
15 9 3
4 10 16 22
29 23 17 11 5
6 12 18 24 30 36
43 37 31 25 19 13 7
14 20 26 32 38 44
45 39 33 27 21
28 34 40 46
47 41 35
42 48
49

*/
public class ArrayHomeWork {
	public static void main(String[] args) {
		
		int arr[][] = new int[7][7];
		
		for(int i=0; i<7; i++) {
			for(int j=0; j<7; j++) {
				arr[i][j] = (i*7)+j+1;
				if(arr[i][j] < 10) {
					System.out.print(arr[i][j] + "  ");
				} else {
				System.out.print(arr[i][j] + " ");
				}
			}
			System.out.println();
		}
//		System.out.println(nums[0][0]);
//		System.out.println(nums[0][1] + " " + nums[1][0]);
//		System.out.println(nums[2][0] + " " + nums[1][1] + " " + nums[0][2]);
//		System.out.println(nums[0][3] + " " + nums[1][2] + " " + nums[2][1] + " " + nums[3][0]);
//		System.out.println(nums[4][0] + " " + nums[3][1] + " " + nums[2][2] + " " + nums[1][3] + " " + nums[0][4]);
//		System.out.println(nums[0][5] + " " + nums[1][4] + " " + nums[2][3] + " " + nums[3][2] + " " + nums[4][1] + " " + nums[5][0]);
//		System.out.println(nums[6][0] + " " + nums[5][1] + " " + nums[2][4] + " " + nums[3][3] + " " + nums[4][2] + " " + nums[5][1] + " " + nums[6][0]);
//		System.out.println(nums[1][6] + " " + nums[2][5] + " " + nums[3][4] + " " + nums[4][3] + " " + nums[5][2] + " " + nums[6][1]);
//		System.out.println(nums[6][2] + " " + nums[5][3] + " " + nums[4][4] + " " + nums[3][5] + " " + nums[2][6]);
//		System.out.println(nums[3][6] + " " + nums[4][5] + " " + nums[5][4] + " " + nums[6][3]);
//		System.out.println(nums[6][4] + " " + nums[5][5] + " " + nums[4][6]);
//		System.out.println(nums[5][6] + " " + nums[6][5]);
//		System.out.println(nums[6][6]);
		for (int i = 0; i < 13; i++) {
			if(i < 7) {
				for (int j = 0; j < i+1; j++) {
					if(i % 2 == 0) {
						System.out.print(arr[i-j][j]+" ");
					} else {
						System.out.print(arr[j][i-j]+" ");
					}
				}
			} else {
				for (int j = 0; j < 13-i; j++) {
					if(i % 2 == 0) {
						System.out.print(arr[6-j][i-6+j]+" ");
					} else {
						System.out.print(arr[i-6+j][6-j]+" ");
					}
				}
			}
			System.out.println();
		}
	}
}
