import java.util.*;
public class PrimeNumberBetweenTwoGivenNum
{
	public static void main(String[]ar)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter First number :");
		int first = sc.nextInt();
		System.out.print("-----------------------------------------\n");	
		System.out.print("Enter Last number :");
		int last = sc.nextInt();	
		System.out.print("-----------------------------------------\n");
		System.out.print("Prime number "+first+" To "+last+" is \n");
		System.out.print("-----------------------------------------\n");
		int i=first;
		while(i<=last)
		{
			int c=0,j=1;
			while(j<=i)
			{
				if(i%j==0)
				{
					c++;
				}
				j++;
			}
			if(c==2)
			{
				System.out.print(i+" \n");
			}
			i++;
		}
		System.out.println("---------------------------------------");
	}
}