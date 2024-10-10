
public class GFGDivisorofNumber {

	public static void main (String[] args) {
		int n = 64;
		int i;
	for ( i = 1; i * i < n; i++)
	{
		if(n % i == 0)
		{
		System.out.print(" ");
		System.out.print(i);
		}	
		
	}
	
	for (; i>=1;i--)
	{
		if ( n % i == 0)
		{
		System.out.print(" ");	
		System.out.print(n/i);	
		}
	}
}
}