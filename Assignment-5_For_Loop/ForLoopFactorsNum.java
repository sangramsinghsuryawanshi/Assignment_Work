import java.util.Scanner;
public class ForLoopFactorsNum
{
	public static void main(String[]ar)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n number:");
		int n = sc.nextInt();
		System.out.println("--------------------");
		System.out.println("Factors of "+n+" is:");
		System.out.println("--------------------");
		for(int i=1;i<=n;i++)
		{
			if(n%i==0)
			{
				System.out.println(i);
			}
			
		}
	}
}