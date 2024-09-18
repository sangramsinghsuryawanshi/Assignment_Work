import java.util.*;
public class PrintNumUptoNIntegers
{
	public static void main(String[]ar)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n integer number:");
		int n = sc.nextInt();
		System.out.println("-----------------------------");
		System.out.println("Enterd n integer is:");
		for(int i=1;i<=n;i++)
		{
			System.out.print(i+" ");
		}
		System.out.println("\n----------------------------------------------");
	}
}