import java.util.*;
public class  DispalyOddNumbersOneToHundreadUsingNested
{
	public static void main(String[]ar)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter given number:");
		int n = sc.nextInt();
		System.out.println("Given Odd Numbers 1 To 100 :");
		int i = 1;
		while(i<=n)
		{	
			if(i%3==0)
			{
				System.out.print(" "+i);
			}
			i++;
		}
	
	}
}