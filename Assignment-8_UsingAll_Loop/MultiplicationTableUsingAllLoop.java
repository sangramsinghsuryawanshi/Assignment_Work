import java.util.*;
public class MultiplicationTableUsingAllLoop
{
	public static void main(String[]ar)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Table number:");
		int n=sc.nextInt();
		System.out.println("Multiplication table number upto "+n+" using foor loop is:");
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=10;j++)
			{
				System.out.print((i*j)+" ");
			}
			System.out.println();
		}
		System.out.println("\n--------------------------------------------------------------------------------------------------------------------");

		System.out.println("Enter Table number:");
		int n1 = sc.nextInt();
		System.out.println("Multiplication table number upto "+n1+" using while loop is:");
		int k=1;
		while(k<=n1)
		{
			int l=1;
			while(l<=10)
			{
				System.out.print((k*l)+" ");
			l++;
			}
			System.out.println();
		k++;
		}
		System.out.println("\n--------------------------------------------------------------------------------------------------------------------");

		System.out.println("Enter Table number:");
		int m1 = sc.nextInt();
		System.out.println("Multiplication table number upto "+m1+" using do while loop is:");
		int o=1;
		do
		{
			int p=1;
			do
			{
				System.out.print((o*p)+" ");
			p++;	
			}while(p<=10);
			System.out.println();
		o++;
		}while(o<=m1);
		System.out.println("\n--------------------------------------------------------------------------------------------------------------------");
	}
}