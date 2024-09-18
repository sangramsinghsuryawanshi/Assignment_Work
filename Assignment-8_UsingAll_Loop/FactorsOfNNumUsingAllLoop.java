import java.util.*;
public class FactorsOfNNumUsingAllLoop
{
	public static void main(String[]ar)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First number:");
		int a=sc.nextInt();
		System.out.println("Enter Second number:");
		int b = sc.nextInt();
		System.out.println("Factors of number between "+a+" To "+b+" using foor loop is:");
		for(int i=a;i<=b;i++)
		{
			System.out.print("Factors of: "+i+" is-->");
			for(int j=1;j<=i;j++)
			{
				if(i%j==0)
				{
					System.out.print(j+" ");
				}
			}
				System.out.println();
		}
		System.out.println("\n--------------------------------------------------------------------------------------------------------------------");

		System.out.println("Enter First number:");
		int n =sc.nextInt();
		System.out.println("Enter Second number:");
		int n1 = sc.nextInt();
		System.out.println("Factors of number between "+n+" To "+n1+" using while loop is:");
		int s=n;
		while(s<=n1)
		{
			System.out.print("Factors of: "+s+" is-->");
			int l=1;
			while(l<=s)
			{
				if(s%l==0)
				{
					System.out.print(l+" ");
				}
			l++;
			}
			System.out.println();
		s++;
		}
		System.out.println("\n--------------------------------------------------------------------------------------------------------------------");

		System.out.println("Enter First number:");
		int m =sc.nextInt();
		System.out.println("Enter Second number:");
		int m1 = sc.nextInt();
		System.out.println("Factors of number between "+m+" To "+m1+" using do while loop is:");
		int k=m;
		do
		{
			System.out.print("Factors of: "+k+" is-->");
			int z=1;
			do
			{
				if(k%z==0)
				{
					System.out.print(z+" ");
				}

			z++;
			}while(z<=k);
			System.out.println();
		k++;
		}while(k<=m1);
	}
}