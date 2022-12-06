public class Gugudan {
	public static int[] cal(int num) {
		int[] result = new int[9];
		for (int i = 0; i < result.length; i++) {
			result[i] = num * (i + 1);
		}
		return result;
	}
	
	public static void print(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
	
	public static void main(String[] args) {
		for (int j = 2; j < 10; j++) {
			print(cal(j));
		}
	}
}
