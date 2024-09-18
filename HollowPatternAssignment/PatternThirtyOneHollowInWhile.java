import java.util.*;
public class PatternThirtyOneHollowInWhile
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
			while(j<=n)
			{	
				if(j==1 || j==n ||i==1 || i==n)
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
	}
}