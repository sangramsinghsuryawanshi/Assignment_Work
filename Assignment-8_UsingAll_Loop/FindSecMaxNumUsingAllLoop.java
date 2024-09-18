import java.util.*;
public class FindSecMaxNumUsingAllLoop
{
	public static void main(String[]ar)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n number:");
		int n=sc.nextInt();
		System.out.println("Max And Second Max number of "+n+" using for loop is:");
		int rem=0,max=0,secmax=0;
		for(;n!=0;)
		{
			rem=n%10;
			if(rem>max)
			{
				secmax=max;
				max=rem;
			}
			else if(rem>secmax && max!=rem)	
			{
				secmax=rem;
			}
			n=n/10;
		}
		System.out.println("Max is:"+max);
		System.out.println("Second Max is:"+secmax);
		System.out.println("\n--------------------------------------------------------------------------------------------------------------------");

		System.out.println("Enter n number:");
		int n1 = sc.nextInt();
		System.out.println("Max And Second Max number of "+n1+" using while loop is:");

		int rem1=0,max1=0,secmax1=0;
		while(n1!=0)
		{
			rem1=n1%10;
			if(rem1>max1)
			{
				secmax1=max1;
				max1=rem1;
			}
			else if(rem1>secmax1 && max1!=rem1)	
			{
				secmax1=rem1;
			}

			n1=n1/10;
		}
		
		System.out.println("Max is:"+max1);
		System.out.println("Second Max is:"+secmax1);

		System.out.println("\n--------------------------------------------------------------------------------------------------------------------");

		System.out.println("Enter n number:");
		int m1 = sc.nextInt();
		System.out.println("Max And Second Max number of "+m1+" using do while loop is:");
		int rem2=0,max2=0,secmax2=0;
		do
		{
			rem2=m1%10;
			if(rem2>max2)
			{
				secmax2=max2;
				max2=rem2;
			}
			else if(rem2>secmax2 && max2!=rem2)	
			{
				secmax2=rem2;
			}

			m1=m1/10;
		}while(m1!=0);

		System.out.println("Max is:"+max2);
		System.out.println("Second Max is:"+secmax2);
			
		System.out.println("\n--------------------------------------------------------------------------------------------------------------------");
	}
}