import java.util.Scanner;
public class ForLoopFirstLastNumEvenOdd
{
	public static void main(String[]ar)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter frist value:");
		int n = sc.nextInt();
		System.out.println("--------------------");
		System.out.println("Enter last value:");
		int n1 = sc.nextInt();
		System.out.println("--------------------");
		System.out.println("Even number "+n+" to "+n1+" is:");
		System.out.println("--------------------");
		for(int i=n;i<=n1;i++)
		{
			if(i%2==0)
			{
				System.out.println(i);
			}
		}
			System.out.println("--------------------");
			System.out.println("Odd number "+n+" to "+n1+" is:");
			System.out.println("--------------------");
			for(int j=n;j<=n1;j++)
			{
				if(j%2!=0)
				{
					System.out.println(j);
				}
			}
			
	}
}