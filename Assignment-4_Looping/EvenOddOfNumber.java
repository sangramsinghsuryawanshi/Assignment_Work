import java.util.*;
public class EvenOddOfNumber
{
	public static void main(String[]ar)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter given number:");
		int no = sc.nextInt();
		System.out.println("even of given number :");
		int j = 1;
		int i=1;
		while(i<=no)
		{
			if(i%2==0)
			{
				System.out.println(i);
			}
			i++;
		}
		System.out.println("\n-------------------------------");
		System.out.println("odd of given number :");
		while(j<=no)
		{
			if(j%2!=0)
			{
				System.out.println(j);
			}
			j++;
		}
		System.out.println("\n-------------------------------");

	}
}