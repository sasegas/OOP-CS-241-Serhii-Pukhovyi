public class Ex10 {
	public static void main(String[] args) {
		int[] testArray = { 2, -5, 14, 9, 0, 4, 5 };

		int result = max(testArray);
		System.out.println(result);
	}

	public static int max(int[] values) {
		int maximum = values[0];

		for (int i = 1; i < values.length; i++) {
			if (values[i] > maximum) {
				maximum = values[i];
			}
		}

		return maximum;
	}
}