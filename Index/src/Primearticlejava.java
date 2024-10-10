
public class Primearticlejava {

	public static void primeFactors(int n)
	{
		while (n % 2 == 0)
		{
			System.out.print(2 + " ");
			n /= 2;
		}
		
		for (int i=3; i<=Math.sqrt(n); i+=2)
		{
//			System.out.println(i);
			while (n % i ==0) {
					System.out.print(i+ " ");
					n /= i;
				}
		}
		
		if (n >2)
			System.out.print(n);
	}
	/* Second Method */
	static void printprimeFactors (int n)
	{
		if (n <= 1)
			return;
		while(n %2 == 0)
		{
			System.out.print(2+" ");
			
			n = n / 2;
		}
		
		while (n %3 == 0)
		{
			System.out.print(3+" ");
			
			n = n / 3;
		}
		
		for (int i = 5; i*i <= n; i = i+6)
		{
				while(n % i == 0)
				{
					System.out.print(i + " ");
					n = n/i;
				}
				
				while (n % (i+2) == 0)
				{
					System.out.print((i+2)+" ");
					
					n = n / (i+2);
				}
		}
		
		if (n > 3)
		{
			System.out.print(n + " ");
			
			System.out.println();
		}
			
	}
	
	
	
	public static void main (String[] args) 
	{
		int n = 4594590;
//		primeFactors(n);
	
		printprimeFactors(n);
	}
	
}
