import java.util.*;
public class FindSecMinNumUsingAllLoop
{
	public static void main(String[]ar)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n number:");
		int n=sc.nextInt();
		System.out.println("Min And Second Min number of "+n+" using for loop is:");
		int rem=0,min=10,secmin=10;
		for(;n!=0;)
		{
			rem=n%10;
			if(rem<min)
			{
				secmin=min;
				min=rem;
			}
			else if(rem<secmin && min!=rem)	
			{
				secmin=rem;
			}
			n=n/10;
		}
		System.out.println("Min is:"+min);
		System.out.println("Second Min is:"+secmin);
		System.out.println("\n--------------------------------------------------------------------------------------------------------------------");

		System.out.println("Enter n number:");
		int n1 = sc.nextInt();
		System.out.println("Min And Second Min number of "+n1+" using while loop is:");

		int rem1=0,min1=10,secmin1=10;
		while(n1!=0)
		{
			rem1=n1%10;
			if(rem1<min1)
			{
				secmin1=min1;
				min1=rem1;
			}
			else if(rem1<secmin1 && min1!=rem1)	
			{
				secmin1=rem1;
			}

			n1=n1/10;
		}
		
		System.out.println("Min is:"+min1);
		System.out.println("Second Min is:"+secmin1);

		System.out.println("\n--------------------------------------------------------------------------------------------------------------------");

		System.out.println("Enter n number:");
		int m1 = sc.nextInt();
		System.out.println("Min And Second Min number of "+m1+" using do while loop is:");
		int rem2=0,min2=10,secmin2=10;
		do
		{
			rem2=m1%10;
			if(rem2<min2)
			{
				secmin2=min2;
				min2=rem2;
			}
			else if(rem2<secmin2 && min2!=rem2)	
			{
				secmin2=rem2;
			}

			m1=m1/10;
		}while(m1!=0);

		System.out.println("Min is:"+min2);
		System.out.println("Second Min is:"+secmin2);
			
		System.out.println("\n--------------------------------------------------------------------------------------------------------------------");
	}
}