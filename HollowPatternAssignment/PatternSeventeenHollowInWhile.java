import java.util.*;
public class PatternSeventeenHollowInWhile
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
				if(j==n || j==i || i==1)
				System.out.print("*");
				else
				System.out.print(" ");
			j--;
			}
		System.out.println();
		i++;
		}
	}
}