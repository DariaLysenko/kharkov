/**
 * 
 */
package procedural.programming;

import java.util.Arrays;

/**
 * @author Mamaliga Ion
 */

public class KharkovWhile {

	public static void main(String[] args) {
		metoda2();
		// metoda1();
	}

	private static void metoda2() {
		int[] a = { 2, 3, 6, 8, 9 };
		int[] b = { 1, 4, 5, 7 };
		System.out.println(Arrays.toString(merge(a, b)));
	}

	private static int[] merge(int[] a, int[] b) {
		int[] result = new int[a.length + b.length];
		int aIndex = 0;
		int bIndex = 0;
		while (aIndex + bIndex != result.length) {
			if (aIndex < a.length && bIndex < b.length) {
				if (a[aIndex] < b[bIndex]) {
					result[aIndex + bIndex] = a[aIndex++];
				} else {
					result[aIndex + bIndex] = b[bIndex++];
				}
			} else if (aIndex < a.length) {
				result[aIndex + bIndex] = a[aIndex++];
			} else if (bIndex < b.length) {
				result[aIndex + bIndex] = b[bIndex++];
			}
		}
		return result;
	}

	private static void metoda1() {
		int[] arr = { 9, 7, 6, 10, 20, 1 };
		for (int i = 1; i < arr.length; i++) {
			int newElement = arr[i];
			int location = i - 1;
			while (location >= 0 && arr[location] > newElement) {
				arr[location + 1] = arr[location];
				location--;
			}
			arr[location + 1] = newElement;
		}
		System.out.println(Arrays.toString(arr));
	}

}
