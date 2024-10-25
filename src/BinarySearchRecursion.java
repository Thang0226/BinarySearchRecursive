import java.util.Scanner;

public class BinarySearchRecursion {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter size of the array: ");
		int size = input.nextInt();
		int[] array = new int[size];
		System.out.println("Enter elements of the array: ");
		for (int i = 0; i < size; i++) {
			System.out.print("\tEnter " + (i + 1) + "th element: ");
			array[i] = input.nextInt();
		}

		System.out.print("Enter a number to find in the array: ");
		int number = input.nextInt();
		int index = binarySearch(array, 0, array.length - 1, number);
		if (index > -1) {
			System.out.println("Element found at index " + index);
		} else {
			System.out.println("Element not found.");
		}
	}

	private static int binarySearch(int[] array, int start, int end, int value) {
		if (start > end) {
			return -1;
		}

		int mid = (start + end) / 2;
		if (value == array[mid]) {
			return mid;
		} else if (value > array[mid]) {
			return binarySearch(array, mid + 1, end, value);
		} else {
			return binarySearch(array, start, mid - 1, value);
		}
	}
}
