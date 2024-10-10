public class MaxBinaryNumConcat {

	public static void main(String[] args) {
		String y = "";
		int x;

		int[] arr = { 1, 2, 3 };
		for (int i = 0; i < arr.length; i++) {
			while (arr[i] > 0) {
				x = arr[i] % 2;
				y = y + Integer.toString(x);
				arr[i] = arr[i] / 2;
			}

		}

		StringBuilder reversed = new StringBuilder(y);

		reversed.reverse();

		int k = reversed.length();
		int a = k - 1;

		x = 0;

		char firstChar;
		for (int j = 0; j < k; j++) {
			firstChar = reversed.charAt(j);

			if (firstChar != '0') {
				x = x + (int) (Math.pow(2, a));
			}

			a--;

		}

		System.out.println(x);

	}

}
