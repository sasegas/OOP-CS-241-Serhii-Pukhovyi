import java.util.Scanner;

public class Ex8 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int sum = 0;
		int count = 0;
		while (true) {
			int current = scanner.nextInt();

			if (current == 0) {
				break;
			} else if (current != 0) {
				count++;
				sum += current;
			}
		}
		System.out.println("Average: " + sum / count);
	}
}
