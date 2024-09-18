import java.util.*;
public class PrimeOfNNumUsingAllLoop
{
	public static void main(String[]ar)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First number:");
		int a=sc.nextInt();
		System.out.println("Enter Second number:");
		int b = sc.nextInt();
		System.out.println("Prime number between "+a+" To "+b+" using foor loop is:");
		for(int i=a;i<=b;i++)
		{
			int c=0;
			for(int j=1;j<=i;j++)
			{
				if(i%j==0)
				{
					c++;
				}
			}
			if(c==2)
			{
				System.out.println(i+"  ");
			}
		}
		System.out.println("\n--------------------------------------------------------------------------------------------------------------------");

		System.out.println("Enter First number:");
		int n =sc.nextInt();
		System.out.println("Enter Second number:");
		int n1 = sc.nextInt();
		System.out.println("Factorial of number between "+n+" To "+n1+" using while loop is:");
		int s=n;
		while(s<=n1)
		{
			int c1=0,l=1;
			while(l<=s)
			{
				if(s%l==0)
				{
					c1++;
				}

			l++;
			}
			if(c1==2)
			{
				System.out.println(s+"  ");
			}
		s++;
		}
		System.out.println("\n--------------------------------------------------------------------------------------------------------------------");

		System.out.println("Enter First number:");
		int m =sc.nextInt();
		System.out.println("Enter Second number:");
		int m1 = sc.nextInt();
		System.out.println("Factorial of number between "+m+" To "+m1+" using do while loop is:");
		int k=m;
		do
		{
			int c2=0,z=1;
			do
			{
				if(k%z==0)
				{
					c2++;
				}

			z++;
			}while(z<=k);
			if(c2==2)
			{
				System.out.println(k+"  ");
			}

		k++;
		}while(k<=m1);
	}
}