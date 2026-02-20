import java.util.Scanner;

public class Ex6 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Input:");
		int bill = scanner.nextInt();
		int friends = scanner.nextInt();
		if (friends == 0) {
			System.out.println("You don't have any friends");
		} else if (bill < 0) {
			System.out.println("Negative bill");
		} else {
			int result = ((bill / 10) + bill) / friends;
			System.out.println("Result: " + result);
		}
	}
}
