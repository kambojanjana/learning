import java.util.HashSet;

public class ArrayQue {
	public static void main(String[] args) {
		int[] arr1 = { 3, 5, 8, 6 };
		int[] arr2 = { 4, 9, 6 };
		System.out.println(isCommonElementPresent(arr1, arr2));
	}

	public static boolean isCommonElementPresent(int[] arr1, int[] arr2) {
		HashSet<Integer> set = new HashSet();
		// create set to store all element of arr1
		for (int num : arr1) {
			set.add(num);
			//System.out.println(num);
		}

		// loop over arr2
		for (int num : arr2) {
			//System.out.println(num);
			// if arr1 and arr2 have common value
			if (set.contains(num)) {
				return true;
				
			}
		}

		// if not common
		return false;
	}
}
