import java.util.*;
public class FactorialOfNNumUsingAllLoop
{
	public static void main(String[]ar)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First number:");
		int a=sc.nextInt();
		System.out.println("Enter Second number:");
		int b = sc.nextInt();
		System.out.println("Factorial of number between "+a+" To "+b+" using foor loop is:");
		for(int i=a;i<=b;i++)
		{
			int fact=1;
			for(int j=1;j<=i;j++)
			{
				fact*=j;
			}
				System.out.println(i+" = "+fact);
		}
		System.out.println("\n--------------------------------------------------------------------------------------------------------------------");

		System.out.println("Enter First number:");
		int n =sc.nextInt();
		System.out.println("Enter Second number:");
		int n1 = sc.nextInt();
		System.out.println("Factorial of number between "+n+" To "+n1+" using while loop is:");
		int j=n;
		while(j<=n1)
		{
			int fact1=1,l=1;
			while(l<=j)
			{
				fact1*=l;
			l++;
			}
				System.out.println(j+" = "+fact1);
		j++;
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
			int fact2=1,z=1;
			do
			{
				fact2*=z;
			z++;
			}while(z<=k);
				System.out.println(k+" = "+fact2);
		k++;
		}while(k<=m1);
	}
}