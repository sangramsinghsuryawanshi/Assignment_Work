import java.util.*;
public class VerticallyTrianglePatternUsingWhileAndFor
{
	public static void main(String[]ar)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n number :");
		int n = sc.nextInt();
		System.out.println("Using for loop");
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i=n-1;i>=1;i--)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
        	System.out.println("___________________________________");
		
		System.out.println("Enter n number :");
		int n1 = sc.nextInt();
		System.out.println("Using while loop");
		int i=1;
		while(i<=n1)
		{
			int j=1;
			while(j<=i)
			{
				System.out.print("*");
			j++;
			}
			System.out.println();
		i++;
		}
		i=n1-1;
		while(i>=1)
		{
			int j=1;
			while(j<=i)
			{
				System.out.print("*");
			j++;
			}
			System.out.println();
		i--;
		}
		
	}
}