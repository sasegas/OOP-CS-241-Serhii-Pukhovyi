import java.util.Scanner;

public class Ex9 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		double a = scanner.nextDouble();
		double b = scanner.nextDouble();
		double c = scanner.nextDouble();

		double d = (b * b) - (4 * a * c);

		if (d > 0) {
			double x1 = (-b - Math.sqrt(d)) / (2 * a);
			double x2 = (-b + Math.sqrt(d)) / (2 * a);

			double minRoot = Math.min(x1, x2);
			double maxRoot = Math.max(x1, x2);

			System.out.println(
					(minRoot % 1 == 0 ? (int) minRoot : minRoot) + " " +
							(maxRoot % 1 == 0 ? (int) maxRoot : maxRoot));
		} else if (d == 0) {
			double x = -b / (2 * a);
			System.out.println(x % 1 == 0 ? (int) x : x);
		} else {
			System.out.println("no roots");
		}
		scanner.close();
	}
}