import java.util.*;
public class PrintTableWhile 
{
	public static void main(String[]ar)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter given number:");
		int no = sc.nextInt();
		System.out.println("Enter given Table number:");
		int j = sc.nextInt();
		System.out.println("Table of given number :");
		int i= 1;
		while(i<=no)
		{
			System.out.println(i*j);
			i++;
		}
	}
}
