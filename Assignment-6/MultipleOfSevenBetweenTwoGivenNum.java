import java.util.*;
public class MultipleOfSevenBetweenTwoGivenNum
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
		System.out.print("multiple of 7 number "+first+" To "+last+" is \n");
		System.out.print("-----------------------------------------\n");
		int i=first;
		while(i<=last)
		{
			if(i%7==0)
			{
				System.out.print(i+" ");
			}
		i++;
		}
	}
}
