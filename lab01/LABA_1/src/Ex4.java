import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Input:");
		int count = scanner.nextInt();
		if (count < 0) {
			System.out.println("Seriously? Why so negative?");
		} else if (count == 0) {
			System.out.println("Oh, it looks like there is no one here");
		} else {
			scanner.nextLine();

			for (int i = 0; i < count; i++) {
				String name = scanner.nextLine();
				System.out.println("Hello, " + name);
			}
		}
	}
}
