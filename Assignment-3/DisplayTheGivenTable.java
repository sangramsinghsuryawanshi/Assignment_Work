import java.util.*;
public class DisplayTheGivenTable
{
	public static void main(String[]ar)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Table number:");
		int j = sc.nextInt();
		System.out.println("Enter last number:");
		int n = sc.nextInt();
		System.out.println("Table of "+j+" number:");
		int i = 1;
		while(i<=n)
		{
			System.out.println(i*j);
			i++;
		}
	}
}