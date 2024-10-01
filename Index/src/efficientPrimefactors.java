import java.util.Scanner;

class efficientPrimefactors {

	public static boolean isPrime(int n) {
		if (n <= 1) {
			return false;
		}
		for (int i = 2; i <= Math.sqrt(n); i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;

	}

	public static int PrimeFactors(int n) {

		for (int i = 2; i < Math.sqrt(n); i++) {

			if (isPrime(i)) {

				while (n % i == 0) {

					System.out.println(i);
//				System.out.println();
					n /= i;
				}

			}
		}
		if (n > 1)
			System.out.println(n);

		return 1;
	}

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the Number: ");
		int N = scanner.nextInt();
		N = PrimeFactors(N);

		scanner.close();
	}

}
