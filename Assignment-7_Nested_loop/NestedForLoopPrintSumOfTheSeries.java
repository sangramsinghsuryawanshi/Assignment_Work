import java.util.*;
public class NestedForLoopPrintSumOfTheSeries
{
	public static void main(String[]ae)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number:");
		int n = sc.nextInt();
		System.out.println("--------------------------");
		System.out.println("given sum of series "+n+" is: ");
		System.out.println("--------------------------");
		double sum=0,a=0,ans=0;
		int i=1;
		for(int j=2;j<=n;j++)
		{
			
			a=(double)i/j;
			sum+=a;
			
		}
		ans=1+sum;
		System.out.println(ans);
	}
}