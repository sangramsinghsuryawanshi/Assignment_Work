import java.util.*;
public class TakeRangeAndProductOfgivenIntegers
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
		System.out.print("Enter Specified number :");
		int pair = sc.nextInt();	
		System.out.print("-----------------------------------------\n");
		System.out.print("range "+first+" To "+last+"  whose Product is "+pair+" and pairs of integers is \n");
		System.out.print("-----------------------------------------\n");
		int i=first;
		while(i<=last)
		{
			int j=1,sum=0;
			while(j<=last)
			{
				sum=i*j;
				if(pair==sum)
				{
					System.out.println(i+" * "+j+" = "+pair);	
				}
			j++;
			}			
			i++;
		}
	}
}