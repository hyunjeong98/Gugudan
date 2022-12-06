import java.util.Scanner;

public class Gugudan {
	public static void main(String[] args) {
		System.out.println("출력할 단: ");
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		if (num < 2 || num > 9) {
			System.out.println("2이상, 9이하의 값만 입력 가능함");
		} else {
			System.out.println(num + "단");
			for (int i = 1; i <= 9; i++) {
				int result = num * i;
				System.out.println(num + "*" + i + "=" + result);
			}
		}
	}
}
