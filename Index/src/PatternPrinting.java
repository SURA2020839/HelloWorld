
public class PatternPrinting {
	public static void main(String[] args) {
//	for (int i = 0 ; i <= 5; i++)
//		
//	{
////		System.out.print("*");
//		
//		for (int j = 0 ; j <= i; j++)
//		{
//			System.out.print("*");
//		}
//		System.out.println("");
//	}
//		int i;
//		int n = 10;
//		for (i = 0;  i<n; i++)
//		{
//			System.out.println(" ");
//			for (int j =0; j<n; j++) {
//			if (i == 0 || i == n-1 || j == 0 || j== n-1) {
//			
//				System.out.print("*");
//			}
//			else {
//				System.out.print(" ");
//			}
//		}
//		}

//		int i;
//		int n = 5;
//		for (i = 0;  i<n; i++)
//		{
//			System.out.println(" ");
//			for (int j =0; j<n; j++) {
//			if (j == 0 || j== n-1 || i == (n-1)/2) {
//			
//				System.out.print("*");
//			}
//			else {
//				System.out.print(" ");
//			}
//		}
//		}

//		int i;
//		int n = 5;
//		for (i = 0;  i<n; i++)
//		{
//			System.out.println(" ");
//			for (int j =0; j<n; j++) {
//			if (i == 0 || j == 0|| j == n-1 || i== (n-1)/2) {
//			
//				System.out.print("*");
//			}
//			else {
//				System.out.print(" ");
//			}
//		}
//		}

//		int i;
//		int n = 10;
//		for (i = 0;  i<n; i++)
//		{
//			System.out.println(" ");
//			for (int j =0; j<n; j++) {
////				System.out.println("i-->" + i + "j-->" + i);
////				break;
//			if (i == (n-1)/2 || (i != 0 && j == 0) ||(i != 0 && j == n-1) || (i == 0 && j != n-1 && j !=0)) {
//			
//				System.out.print("*");
//			}
//			else {
//				System.out.print(" ");
//			}
//		}
//		}

//		int i;
//		int n = 10;
//		for (i = 0;  i<n; i++)
//		{
//			System.out.println(" ");
//			for (int j = 0; j<n; j++) {
//
//			if (i == (n-1)/2 || (i != 0 && j == 0) ||(i != 0 && j == n-1) || (i == 0 && j != n-1 && j !=0)) {
//			
//				System.out.print("*");
//			}
//			else {
//				System.out.print(" ");
//			}
//		}
//		}

//		int n = 10;
//
//		for (int i = 0; i < n; i++) {
//
//			System.out.println(" ");
//
//			for (int j = 0; j < n; j++) {
//				if (j>=n-i)
//				{
//					System.out.print("*");
//				}
//				else
//				{
//					System.out.print(" ");
//				}
//			}
//		}

//		for (int i = 0; i < 9; i++) {
//			System.out.println(" ");
//			for (int j = 0; j < 9; j++) {
//					if (i % 2 == 0 )
//					{
//						if ( i== 0 && j == 4)
//						{
//							System.out.print("*");
//						}
//						else if(i==2 && (j==3 ||j==4 || j==5)){
//							
//							System.out.print("*");
//						}
//						else if (i == 4 && (j ==2 || j ==3 || j==4 || j==5 || j==6))
//						{
//							System.out.print("*");
//						}
//						else if (i == 6 && (j != 0 && j <= 7)) {
//							System.out.print("*");
//						}
//						else if (i == 8) {
//							System.out.print("*");
//						}
//						else {
//							System.out.print(" ");
//						}
//					}
//			}
//		}
		
		for (int i = 0; i<6; i++)
		{
			System.out.println(" ");
			
			for (int j = 0; j<6; j++)
			{
				if ( ((i==0 || i == 5) && (j>0 && j<5)) || ((i > 0 || i<5)  && ( (j == 1 || j == 5))))
				{
					
					System.out.print("*");
				}
				else{
					
					System.out.print(" ");
					
				}
			}
		}

	}


}