import java.io.Console;
import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Введіть ваше ім'я: ");
		String name = scanner.nextLine();

		System.out.print("Введіть ваш вік: ");
		int age = scanner.nextInt();

		System.out.print("Введіть ваш зріст (у метрах, наприклад 1,80): ");
		double height = scanner.nextDouble();

		System.out.println("\n--- Результат ---");
		System.out.println("Вас звати " + name + ", вам " + age + " років. Зріст: " + height + " м.");

		scanner.close();
	}
}
