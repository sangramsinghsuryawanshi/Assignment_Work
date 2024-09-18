import java.util.*;
public class WhilePrintCountOfEvenIntegers
{
	public static void main(String[]ar)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any integer :");
		int a = sc.nextInt();
		System.out.println("Given even integer is :");
		int i = 1;
		int count = 0;
		while(i<=a)
		{
			if(i%2==0)
			{
				System.out.println(i);
				count++;
				
			}
			i++;
		}
		System.out.println("count of even integers :"+count);

	}
}