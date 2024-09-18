import java.util.*;
public class CoumputeTheAddSeriesUsingAllLoop
{
	public static void main(String[]ar)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n number:");
		int v=sc.nextInt();
		double j=1,a=0,ans=0,sum=0;
		for(int i=2;i<=v;i++)
		{
			a=(double)j/i;
			sum+=a;
		}
		ans=1+sum;
		System.out.print(ans);
		System.out.println("\n--------------------------------------------------------------------------------------------------------------------");

		System.out.println("Enter n number:");
		int n =sc.nextInt();
		double s=2,a1=0,ans1=0,n1=1,sum1=0;
		while(s<=n)
		{
			a1=(double)n1/s;
			sum1+=a1;
		s++;
		}
		ans1=1+sum1;
		System.out.print(ans1);
		System.out.println("\n--------------------------------------------------------------------------------------------------------------------");

		System.out.println("Enter First number:");
		int m =sc.nextInt();
		
		double m2=2,a2=0,ans2=0,m1=1,sum2=0;
		do
		{
			a2=(double)m1/m2;
			sum2+=a2;
		m2++;
		}while(m2<=m);
		ans2=1+sum2;
		System.out.print(ans2);

	}
}