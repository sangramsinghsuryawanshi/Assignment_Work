import java.util.*;
public class DispalyReverseNaturalNum
{
	public static void main(String[]ar)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter given number:");
		int n = sc.nextInt();
		System.out.println("Given reverse natural Numbers n To 1 :");
		int i = 100;
		while(i>=n)
		{	
			System.out.print(" "+i);
			i--;
		}
	
	}
}