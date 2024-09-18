import java.util.*;
public class QTenNumPatternUsingWhileAndFor
{
	public static void main(String[]ar)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n number :");
		int n = sc.nextInt();
		System.out.println("Using for loop");
		for(int i=1;i<=n;i++)
		{
			for(int j=i;j<=n;j++)
			{
				System.out.print(i+" ");
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
			int j=i;
			while(j<=n1)
			{
				System.out.print(i+" ");
			j++;
			}
			System.out.println();
		i++;
		}
	}
}