package core_java_day14;

public class IterativeBinarySerach {

	int binarySearch(int array[], int x, int low, int high) {

		// Repeat until the pointers low and high meet each other
		while (low <= high) {
			int mid = low + (high - low) / 2;

			if (x == array[mid])
				return mid;

			if (x > array[mid])
				low = mid + 1;

			else
				high = mid - 1;
		}

		return -1;
	}

	public static void main(String args[]) {
		BinarySearch ob = new BinarySearch();
		int array[] = { 3, 4, 5, 6, 7, 8, 9 };
		int n = array.length;
		int x = 6;
		int result = ob.binarySearch(array, x, 0, n - 1);
		if (result == -1)
			System.out.println("Not found");
		else
			System.out.println("Element found at index " + result);
	}

}
