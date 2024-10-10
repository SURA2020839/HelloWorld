import java.util.ArrayList;

public class EfficientNumberdivisors {
	
	public static void main (String[] args)
	{
        ArrayList<Integer> Div = new ArrayList<>();
		int n = 64;
		for (int i =1; i * i<=n; i++ )
		{
			if ( n % i == 0)
			{
				System.out.print(" ");
				System.out.print(i + " ");

				if (i != n/i)
				Div.add(n/i);
			}
		}
				int x = Div.size();

		
		for (int j = x-1; j>= 0;j--)
		{
			 System.out.print(Div.get(j));
			 System.out.print(" ");
		}
	}

}
