import java.util.Scanner;

class primefactors {

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
public static int PrimeFactors (int n) {
   
				int x = n;
		for (int i = 2; i<n; i++) {
				
				
			if (((i % 2 == 0 && i != 2) || (i % 3 == 0 && i != 3))) {

			} else {

				if (isPrime(i)) {

					while (x > 0) {
						if (x % i == 0) {
							System.out.println("prime factors are " + i);

							x = x / i;
						} else
							break;

					}
				}
			}
		}
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
