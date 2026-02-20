import java.util.Scanner;

public class Ex7 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int max = scanner.nextInt();
		while (true) {
			int current = scanner.nextInt();
			if (current == 0) {
				break;
			}
			if (current > max) {
				max = current;
			}
		}
		System.out.println("Max: " + max);
	}
}
