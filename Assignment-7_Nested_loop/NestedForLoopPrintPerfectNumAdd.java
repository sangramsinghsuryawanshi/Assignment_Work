import java.util.*;
public class NestedForLoopPrintPerfectNumAdd
{
	public static void main(String[]ae)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number:");
		int n = sc.nextInt();
		System.out.println("--------------------------");
		System.out.println("Enter last number:");
		int n1 = sc.nextInt();
		System.out.println("--------------------------");
		System.out.println("given perfect number "+n+" To "+n1+" is: ");
		System.out.println("--------------------------");
		int sum=0;
		for(int i=n;i<=n1;i++)
		{
			if(n1%i==0)
			{
				sum=sum+i;
				System.out.println(i);
			}
		if(sum==n1)
		{
			System.out.println(n1);

		}
		else
		{
			System.out.println("invalid");

		}
		}
	}
}