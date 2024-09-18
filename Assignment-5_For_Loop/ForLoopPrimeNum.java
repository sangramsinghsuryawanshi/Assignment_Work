import java.util.Scanner;
public class ForLoopPrimeNum
{
	public static void main(String[]ar)
	{
		Scanner sc = new Scanner(System.in);
		int c=0;
		System.out.println("Enter n number:");
		int n = sc.nextInt();
		System.out.println("--------------------");
		for(int i=1;i<=n;i++)
		{
			if(n%i==0)
			{
				c++;
			}
			
		}
		if(c==2)
		{
			System.out.println("Number is Prime");
		}
		else
		{
			System.out.println("Number is not Prime");
		}
	}
}