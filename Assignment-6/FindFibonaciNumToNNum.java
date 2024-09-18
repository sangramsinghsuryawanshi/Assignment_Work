import java.util.*;
public class FindFibonaciNumToNNum
{
	public static void main(String[]ar)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First number:");
		int n = sc.nextInt();
		System.out.println("-------------------------");
		System.out.println("Enter last number:");
		int n1 = sc.nextInt();
		System.out.println("-------------------------");
		System.out.println("Fibonaci number:");
		System.out.println("-------------------------");
		int a=0,b=1,sum=0;
		do
		{
			System.out.print(" "+a);
			sum=a+b;
			a=b;
			b=sum;
		n++;
		}while(n<=n1);
		System.out.println("\n-------------------------");
			
	}
}