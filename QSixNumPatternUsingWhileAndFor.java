import java.util.*;
public class QSixNumPatternUsingWhileAndFor
{
	public static void main(String[]ar)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n number :");
		int n = sc.nextInt();
		System.out.println("Using for loop");
		int c=1;
		for(int i=1;i<=n;i++)
		{
                     c=i;
			for(int j=1;j<=i;j++)
			{
                                
				System.out.print(c+" ");
				c++;
			}
			System.out.println();
		}
        	System.out.println("___________________________________");
		
		System.out.println("Enter n number :");
		int n1 = sc.nextInt();
		System.out.println("Using while loop");
		int i=1,s=1;
		while(i<=n1)
		{
			s=i;
			int j=1;
			while(j<=i)
			{
				System.out.print(s+" ");
				s++;
			j++;
			}
			System.out.println();
		i++;
		}
	}
}