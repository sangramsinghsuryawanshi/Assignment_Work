import java.util.*;
public class PatternTweentySevenHollowInWhile
{
	public static void main(String[]ar)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter n number: ");
		int n = sc.nextInt();
		System.out.println("\n_________________________");
		int i=1;	
		while(i<=n)
		{
			int j=n;
			while(j>=i)
			{
				System.out.print("*");
			j--;
			}
				int k=1;
				while(k<=i-1)
				{
					System.out.print("  ");
				k++;
				}
					j=n;
					while(j>=i)
					{
						System.out.print("*");
					j--;
					}

		System.out.println();
		i++;
		}
		i=1;
		while(i<=n)
		{
			int j=1;
			while(j<=i)
			{
				System.out.print("*");
			j++;
			}
				int k=n-1;
				while(k>=i)
				{ 
					System.out.print("  ");
				k--;
				}
					j=1;
					while(j<=i)
					{
						System.out.print("*");
					j++;
					}


		System.out.println();
		i++;
		}

	}
}