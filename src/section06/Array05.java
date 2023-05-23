package section06;

public class Array05 {
	public static void main(String[] args) {
		// new 연산자를 사용하지 않고 2중 배열 선언 및 대입 생성
		int[][] nums = { 
				{1, 2, 3}, 
				{4, 5, 6}, 
				{7, 8, 9}, 
				{10, 11, 12} 
		};

		for (int i = 0; i < nums.length; i++) {
			// i : 0 | nums[0] : {1, 2, 3}		| nums[0].length : 3
			// i : 1 | nums[1] : {4, 5, 6}		| nums[1].length : 3
			// i : 2 | nums[2] : {7, 8, 9}		| nums[2].length : 3
			// i : 3 | nums[3] : {10, 11, 12}	| nums[3].length : 3
			for (int j = 0; j < nums[i].length; j++) {
				System.out.print(nums[i][j] + " ");
			}
			System.out.println();
		}
		
		// 2중 배열 요소 변경
		nums[1][1] = 15;
		
		System.out.println("=================================");
		
		for (int i = 0; i < nums.length; i++) {
			// i : 0 | nums[0] : {1, 2, 3}		| nums[0].length : 3
			// i : 1 | nums[1] : {4, 5, 6}		| nums[1].length : 3
			// i : 2 | nums[2] : {7, 8, 9}		| nums[2].length : 3
			// i : 3 | nums[3] : {10, 11, 12}	| nums[3].length : 3
			for (int j = 0; j < nums[i].length; j++) {
				System.out.print(nums[i][j] + " ");
			}
			System.out.println();
		}
	}
}
