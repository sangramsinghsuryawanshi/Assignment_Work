import java.util.*;
public class FibnonacciNumUsingAllLoop
{
	public static void main(String[]ar)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n number:");
		int n=sc.nextInt();
		System.out.println("Fibonacci number upto "+n+" using foor loop is:");
		int a=0,b=1,c=0;
		for(int i=1;i<=n;i++)
		{
			System.out.print(a);
			c=a+b;
			a=b;
			b=c;
		}
		System.out.println("\n--------------------------------------------------------------------------------------------------------------------");

		System.out.println("Enter n number:");
		int n1 = sc.nextInt();
		System.out.println("Fibonacci number upto "+n1+" using while loop is:");
		int j=1,c1=0,a1=0,b1=1;
		while(j<=n1)
		{
			System.out.print(a1);
			c1=a1+b1;
			a1=b1;
			b1=c1;
		j++;
		}
		System.out.println("\n--------------------------------------------------------------------------------------------------------------------");

		System.out.println("Enter n number:");
		int m1 = sc.nextInt();
		System.out.println("Fibonacci number upto "+m1+" using do while loop is:");
		int k=1;
		int a2=0,b2=1,c2=0;
		do
		{
			System.out.print(a2);
			c2=a2+b2;
			a2=b2;
			b2=c2;
		k++;
		}while(k<=m1);
	}
}