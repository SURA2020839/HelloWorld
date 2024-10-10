import java.util.Scanner;

public class SeiveofEratosthenes2 {
	
	public static void main (String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the Number: ");
		int N = scanner.nextInt();
		boolean[] Arr = new boolean[N];
		
		for (int i=0; i<N; i++)
		{
			Arr[i] = true;
		}
		
		for (int j =2; j<N;j++)
		{
			if (j % 2 == 0 && j!=2 && Arr[j] == true)
				Arr[j] = false;
		}
		
		for (int k =3; k<N;k++)
		{
			if (k % 3 == 0 && k!=3 && Arr[k] == true)
				Arr[k] = false;
		}
		
		for (int l =5; l<N; l++)
		{
			if (l % 5 == 0 && l!=5 && Arr[l] == true)
				Arr[l] = false;
		}
		
		for (int m=2; m<N; m++)
		{
			System.out.print("m--> " + m +"->"+ Arr[m]);
			System.out.println(" ");	
		}
		
	}

}
