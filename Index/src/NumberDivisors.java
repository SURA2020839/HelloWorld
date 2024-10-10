import java.util.Scanner;

public class NumberDivisors {
		
	
public static void PrimeFactors (int n)	{
	for ( int i = 1; i<=n; i++)
	{
		if (n % i == 0)
			System.out.print(i + " ");
	}
}

public static void main(String[] args) {

	Scanner scanner = new Scanner(System.in);
	System.out.print("Enter the Number: ");
	int N = scanner.nextInt();
	PrimeFactors(N);

	scanner.close();
}


}