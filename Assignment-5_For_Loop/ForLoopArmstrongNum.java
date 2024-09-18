import java.util.Scanner;
public class ForLoopArmstrongNum
{
	public static void main(String[]ar)
	{
		Scanner sc = new Scanner(System.in);
		int rem=0,rev=0;
		System.out.println("Enter n number:");
		int n = sc.nextInt();	
		System.out.println("--------------------");
		for(int i=n;i!=0;i=i/10)
		{
			rem=i%10;
			rev+=(rem*rem*rem);
		}
		if(rev==n)
		{
			System.out.println("Number is Armstrong");
		}
		else
		{
			System.out.println("Number is not Armstrong");
		}
	}
}