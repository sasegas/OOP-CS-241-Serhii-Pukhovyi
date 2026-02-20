import java.util.Arrays;

public class Ex13 {

	public static void main(String[] args) {
		int[] testArray = { 18, 1, 3, 6, 7, -5 };
		int[] result = removeLocalMaxima(testArray);
		System.out.println(Arrays.toString(result));
	}

	public static int[] removeLocalMaxima(int[] array) {
		int[] tempArray = new int[array.length];
		int count = 0;

		for (int i = 0; i < array.length; i++) {
			boolean isLocalMax = false;

			if (i == 0) {
				isLocalMax = array[i] > array[i + 1];
			} else if (i == array.length - 1) {
				isLocalMax = array[i] > array[i - 1];
			} else {
				isLocalMax = array[i] > array[i - 1] && array[i] > array[i + 1];
			}
			if (!isLocalMax) {
				tempArray[count] = array[i];
				count++;
			}
		}
		return Arrays.copyOf(tempArray, count);
	}
}