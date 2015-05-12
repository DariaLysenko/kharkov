/**
 * 
 */
package procedural.programming;

import java.util.Arrays;

/**
 * @author Mamaliga Ion
 */

public class KharkovFor {

	public static void main(String[] args) {
		metoda16();
//		metoda15();
//		metoda14();
//		metoda13();
//		metoda12();
//		metoda11();
//		metoda10();
//		metoda9();
//		metoda8();
//		metoda7();
//		metoda6();
//		metoda5();
//		metoda4();
//		metoda3();
//		metoda2();
//		metoda1();
	}

	private static void metoda16() {
		int[] arr = { 9, '!', 7, 6, 5, 4, 3, 2, 1 };
		System.out.println(Arrays.toString(arr) + " ->");
		for (int barier = arr.length - 1; barier >= 0; barier--) {
			for (int index = 0; index < barier; index++) {
				if (arr[index] > arr[index + 1]) {
					int temp = arr[index];
					arr[index] = arr[index + 1];
					arr[index + 1] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
	}

	private static void metoda15() {
		int[] arr = { 3, 1, 4, 2, 5, 8, 6, 9, 7 };
		System.out.println(Arrays.toString(arr) + " ->");
		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] > arr[i + 1]) {
				int temp = arr[i];
				arr[i] = arr[i + 1];
				arr[i + 1] = temp;
			}
		}
		System.out.println(Arrays.toString(arr));
	}

	private static void metoda14() {
		int[] arr = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		System.out.println(Arrays.toString(arr) + " ->");
		for (int i = 0; i < arr.length - 1; i++) {
			int temp = arr[i];
			arr[i] = arr[i + 1];
			arr[i + 1] = temp;
		}
		System.out.println(Arrays.toString(arr));
	}

	private static void metoda13() {
		int[] arr = { 0, 10, 20, 30, 40 };
		for (int i = arr.length - 1; i >= 0; i--) {
			for (int j = 0; j <= i; j++) {
				System.out.print(arr[j] + " ");
			}
			System.out.println();
		}
	}

	private static void metoda12() {
		int[] arr = { 0, 10, 20, 30, 40 };
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print(arr[j] + " ");
			}
			System.out.println();
		}
	}

	private static void metoda11() {
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print("(" + i + "," + j + ") ");
			}
			System.out.println();
		}
	}

	private static void metoda10() {
		for (int k = 0; k < 10; k++) {
			System.out.println(k + " ");
			k -= 2;
		}
	}

	private static void metoda9() {
		for (int k = 0; k < 10; k++) {
			System.out.print(k + " ");// 000000000
			k--;
		}
	}

	private static void metoda8() {
		int[] arr = { 0, 10, 20, 30, 40, 50, 60, 70, 80, 90 };
		for (int k = arr.length - 1; k >= 0; k -= 2) {
			System.out.print(arr[k] + " ");
		}
	}

	private static void metoda7() {
		int[] arr = { 0, 10, 20, 30, 40, 50, 60, 70, 80, 90 };
		for (int k = arr.length - 1; k >= 0; k--) {
			System.out.print(arr[k] + " ");
		}
	}

	private static void metoda6() {
		int[] arr = { 0, 10, 20, 30, 40, 50, 60, 70, 80, 90 };
		for (int k = 0; k < arr.length; k += 2) {
			System.out.print(arr[k] + " ");
		}
	}

	private static void metoda5() {
		int[] arr = { 0, 10, 20, 30, 40, 50, 60, 70, 80, 90 };
		for (int k = 0; k < arr.length; k++) {
			System.out.print(arr[k] + " ");
		}
	}

	private static void metoda4() {
		for (int i = 9; i >= 0; i -= 2) {
			System.out.print(i + " ");
		}
	}

	private static void metoda3() {
		for (int i = 9; i >= 0; i--) {
			System.out.print(i + " ");
		}
	}

	private static void metoda2() {
		for (int i = 0; i < 10; i += 2) {
			System.out.print(i + " ");
		}
	}

	private static void metoda1() {
		for (int i = 0; i < 10; i++) {
			System.out.print(i + " ");
		}
	}

}
