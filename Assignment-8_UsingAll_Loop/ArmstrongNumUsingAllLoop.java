import java.util.*;
public class ArmstrongNumUsingAllLoop
{
	public static void main(String[]ar)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First number:");
		int a=sc.nextInt();
		System.out.println("Enter Second number:");
		int b = sc.nextInt();
		System.out.println("Armstrong number between "+a+" To "+b+" using foor loop is:");
		for(int i=a;i<=b;i++)
		{
			int rem=0,temp=i,rev=0;
			for(;temp!=0;)
			{
				rem=temp%10;
				rev+=(rem*rem*rem);
				temp=temp/10;
			}
			if(rev==i)
			{

				System.out.print(rev+"  ");
			}
		}
		System.out.println("\n--------------------------------------------------------------------------------------------------------------------");

		System.out.println("Enter First number:");
		int n =sc.nextInt();
		System.out.println("Enter Second number:");
		int n1 = sc.nextInt();
		System.out.println("Armstrong number between "+n+" To "+n1+" using while loop is:");
		int j=n;
		while(j<=n1)
		{
			int rem1=0,temp1=j,rev1=0;
			while(temp1!=0)
			{
				rem1=temp1%10;
				rev1+=(rem1*rem1*rem1);
				temp1=temp1/10;
			}
			if(rev1==j)
			{
				System.out.print(rev1+"  ");
			}
		j++;
		}
		System.out.println("\n--------------------------------------------------------------------------------------------------------------------");

		System.out.println("Enter First number:");
		int m =sc.nextInt();
		System.out.println("Enter Second number:");
		int m1 = sc.nextInt();
		System.out.println("sum of n digit number between "+m+" To "+m1+" using do while loop is:");
		int k=m;
		do
		{
			int rem2=0,temp2=k,rev2=0;
			do
			{
				rem2=temp2%10;
				rev2+=(rem2*rem2*rem2);
				temp2=temp2/10;
			}while(temp2!=0);
			if(rev2==k)
			{
				System.out.print(rev2+"  ");
			}
		k++;
		}while(k<=m1);
	}
}