import java.util.*;
public class PatternTweentyTwoHollowInWhile
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
			int j=1;
			while(j<=i)
			{	
				
				if(j==1 || j==i)
				{
				System.out.print("*");
				}
				else
				{
				System.out.print(" ");
				}
			j++;
			}
		System.out.println();
		i++;
		}
		i=2;
		while(i<=n)
		{
			int j=n;
			while(j>=i)
			{	
				if(j==n || j==i)
				{
				System.out.print("*");
				}
				else
				{
				System.out.print(" ");
				}
			j--;
			}
		System.out.println();
		i++;
		}

	}
}