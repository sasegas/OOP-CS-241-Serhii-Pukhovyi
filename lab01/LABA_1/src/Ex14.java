import java.util.Arrays;

public class Ex14 {

	public static void main(String[] args) {
		int[] arr1 = { 1, 3, 2, 7, 4 };
		cycleSwap(arr1);
		System.out.println(Arrays.toString(arr1));

		int[] arr2 = { 1, 3, 2, 7, 4 };
		cycleSwap(arr2, 3);
		System.out.println(Arrays.toString(arr2));
	}

	public static void cycleSwap(int[] array) {
		if (array == null || array.length <= 1) {
			return;
		}

		int lastElement = array[array.length - 1];

		for (int i = array.length - 1; i > 0; i--) {
			array[i] = array[i - 1];
		}
		array[0] = lastElement;
	}

	public static void cycleSwap(int[] array, int shift) {
		if (array == null || array.length <= 1 || shift <= 0 || shift == array.length) {
			return;
		}

		int[] temp = new int[shift];

		for (int i = 0; i < shift; i++) {
			temp[i] = array[array.length - shift + i];
		}

		for (int i = array.length - 1; i >= shift; i--) {
			array[i] = array[i - shift];
		}

		for (int i = 0; i < shift; i++) {
			array[0 + i] = temp[i];
		}
	}
}