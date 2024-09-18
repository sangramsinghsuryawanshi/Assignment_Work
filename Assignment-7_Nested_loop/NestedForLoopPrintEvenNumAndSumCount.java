import java.util.*;
public class NestedForLoopPrintEvenNumAndSumCount
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
		System.out.println("given even number "+n+" To "+n1+" is: ");
		System.out.println("--------------------------");
		int sum=0,count=0;
		for(int i=n;i<=n1;i++)
		{
			if(i%2==0)
			{
				count++;
				sum+=i;
				System.out.print(i+" ");
			}
		}
		System.out.println("\nCount of even number is: "+count);
		System.out.println("sum of even number is: "+sum);
		System.out.println("--------------------------");	
	}
}
