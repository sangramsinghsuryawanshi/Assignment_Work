import java.util.*;
public class PrintPrimeNumToNNumber
{
	public static void main(String[]ar)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First number:");
		int first = sc.nextInt();
		System.out.println("-------------------------");
		System.out.println("Enter Last number:");
		int last = sc.nextInt();
		System.out.println("-------------------------");
		System.out.println("Prime number "+first+" To "+last+" is :");
		System.out.println("-------------------------");
		int i=first;
		do
		{
			int c=0,j=1;
			do
			{
				if(i%j==0)
				{
					c++;
				}
			j++;
			}while(j<=i);
			if(c==2)
			{
				System.out.print(" "+i);
			}
		i++;
		}while(i<=last);
	}
}
