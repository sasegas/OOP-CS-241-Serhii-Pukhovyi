import java.util.Scanner;

public class Ex5 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Input:");
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int h = scanner.nextInt();
		if (a >= h) {
			System.out.println("Result: 1");
		} else if (a <= b) {
			System.out.println("Impossible");
		} else {
			int suma = 0;
			int result = 0;
			while (true) {
				result++;
				suma += a;
				if (suma >= h) {
					break;
				}
				suma -= b;
			}
			System.out.println("Result: " + result);
		}
	}
}
