
public class Sum {

	public static void main(String[] args) {
		int[] array = { 1, 2, 3, 4, 5 };
		int[] array2 = { 10, 5 };

		int sum1 = 0;

		for (int i : array) {
			sum1 += i;
		}

		int sum2 = 0;
		for (int j : array2) {
			sum2 += j;
		}
			if (sum1 == sum2) {
				System.out.println("true");
			} else {
				System.out.println("false");
			}

		}
	}





