public class Ex11 {
	public static void main(String[] args) {
		int[] testArray = { 1, 2, 3, 4, 5, 6 };
		System.out.println(sum(testArray));
		System.out.println(sum(new int[0]));
		System.out.println(sum(null));
	}

	public static int sum(int[] numbers) {
		if (numbers == null || numbers.length == 0) {
			return 0;
		}
		int totalSum = 0;
		for (int num : numbers) {
			if (num % 2 == 0) {
				totalSum += num;
			}
		}
		return totalSum;
	}
}