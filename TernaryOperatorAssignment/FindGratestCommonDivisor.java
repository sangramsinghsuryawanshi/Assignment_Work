import java.util.*;
public class FindGratestCommonDivisor
{
	public static void main(String[]ar)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number:");
		int n = sc.nextInt();
		System.out.println("-----------------------------");
		System.out.println("Enter last number:");
		int n1 = sc.nextInt();
		System.out.println("Given common divisor of "+n+" and "+n1+" is:");
		System.out.println("-----------------------------");
		int max=0;
		for(int i=1;i<=n1;i++)
		{
			if(n%i==0 && n1%i==0)
			{
				if(i>max)
				{
					max=i;
				}
			}
				
		}
		System.out.println("Greatest common divisor is: "+max);
		System.out.println("\n----------------------------------------------");
	}
}