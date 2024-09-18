import java.util.Scanner;
public class ForLoopTableOfNum
{
	public static void main(String[]ar)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n number:");
		int n = sc.nextInt();
		System.out.println("--------------------");
		System.out.println("Table of "+n+" is:");
		System.out.println("--------------------");
		int j=10;
		for(int i=1;i<=j;i++)
		{
			System.out.println(n+" * "+i+" = "+(n*i));
			
		}
	}
}