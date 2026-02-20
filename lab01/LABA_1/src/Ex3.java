import java.util.Scanner;

public class Ex3 {
	final static int password = 12345;

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Input:");
		int inputPass = scanner.nextInt();
		if (inputPass == password) {
			System.out.print("Hello, Agent");
		} else {
			System.out.print("Access denied");
		}
	}
}
