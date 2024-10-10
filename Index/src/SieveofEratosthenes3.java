import java.util.Scanner;

public class SieveofEratosthenes3 {
	
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
		boolean[] Arr = new boolean[N+1];
		
		for (int a = 0; a<N;a++)
		{
			Arr[a]=true;
		}
		
		for (int i=2; i*i<=N; i++)
		{
			if (isPrime(i))
			{
				for (int j = i*i; j<N; j= j+i)/*Replacing 2 * i with  i* i*/
				{
					Arr[j] = false;
				}
			}
			
		}
		
		
		for (int m=2; m<=N; m++)
		{
			if (Arr[m])
			{
				
				System.out.print(m);
				System.out.print(" ");
			}

			
		}
		
	}


}
