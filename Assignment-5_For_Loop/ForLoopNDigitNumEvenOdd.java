import java.util.Scanner;
public class ForLoopNDigitNumEvenOdd
{
	public static void main(String[]ar)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter frist value:");
		int n = sc.nextInt();
		System.out.println("--------------------");
		System.out.println("Even number "+n+" is:");
		System.out.println("--------------------");
		int rem=0,rev=0;
		for(int i=n;i!=0;i=i/10)
		{
			rem=i%10;
			if(rem%2==0)
			{
				System.out.println(rem);
			}
		}
			System.out.println("--------------------");
			System.out.println("Odd number "+n+" is:");
			System.out.println("--------------------");
			for(int j=n;j!=0;j=j/10)
			{
				rev=j%10;
				if(rev%2!=0)
				{
					System.out.println(rev);
				}

			}
			
	}
}