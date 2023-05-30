package section08;

public class Method08 {
	public static void main(String[] args) {
		int[] values = {2, 4, 6, 22, 55};
		
		int[] result = sumAndAvg(values);
		
		System.out.println("합계 : " + result[0]);
		System.out.println("평균 : " + result[1]);
	}
	
	// 8. 인자 o 리턴 o 배열리턴
	public static int[] sumAndAvg(int[] values) {
		int[] result = new int[2];
		
		int sum = 0;
		for(int value : values) {
			sum += value;
		}
		
		int avg = sum / values.length;
		
		result[0] = sum;
		result[1] = avg;
		
		return result;
	}
}
