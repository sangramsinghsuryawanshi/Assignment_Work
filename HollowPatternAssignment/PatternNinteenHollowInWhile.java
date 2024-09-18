import java.util.*;
public class PatternNinteenHollowInWhile
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
			int k=n;
			while(k>=i)
			{
				System.out.print(" ");
			k--;
			}
			int j=1;
			while(j<=i)
			{	
				if(i%2!=0)
				{
				if(j==1 || j==i || i==n)
				{
				System.out.print("* ");
				}
				else
				{
				System.out.print("  ");
				}
				}
			j++;
			}
		System.out.println();
		i++;
		}
	}
}