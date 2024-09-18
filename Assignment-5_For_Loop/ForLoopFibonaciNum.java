import java.util.Scanner;
public class ForLoopFibonaciNum
{
	public static void main(String[]ar)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n number:");
		int n = sc.nextInt();
		System.out.println("--------------------");
		System.out.println("Fibonaci number upto "+n+" is:");
		System.out.println("--------------------");
		int sum=0,a=0,b=1;
		for(int i=0;i<=n;i++)
		{
			sum=a+b;
			a=b;
			b=sum;
			System.out.println(b);
			
		}
	}
}