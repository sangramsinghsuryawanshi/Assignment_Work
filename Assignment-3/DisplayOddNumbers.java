import java.util.*;
public class DisplayOddNumbers
{
	public static void main(String[]ar)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter given number:");
		int n = sc.nextInt();
		System.out.println("Given odd Numbers 200 To 300 :");
		int i = 200;
		while(i<=n)
		{	
			if(i%2!=0)
			{
				System.out.print(" "+i);
			}
			i++;
		}
	}
}