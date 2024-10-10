import java.util.Scanner;

public class SieveofEratosthenes {
		
	public static boolean isPrime(int N) {
		
		
		if (N <= 1 )
		{
			return false;
		}
		
		if (N==2|| N==3)
		{
			return true;
		}
		
		if (N % 2 == 0 || N % 3 == 0)
		{
			return false;
		}
		
		for (int i=5; i*i<=N;i= i+6)
		{
			if ((N % i ==0) ||N % (i+2) ==0)
				return false;
		}
			return true;
		}
	
	
	
	
	public static void main (String[] args)
		{
			Scanner scanner = new Scanner(System.in);
			System.out.print("Enter the Number: ");
			int N = scanner.nextInt();

//			boolean X = isPrime(N);
//			System.out.println(X);
			
			for (int i=2;i<=N;i++)
			{
				

				if (isPrime(i))
				{
					System.out.print(" ");
					System.out.print(i);
				}
			}
			scanner.close();

		}
}
