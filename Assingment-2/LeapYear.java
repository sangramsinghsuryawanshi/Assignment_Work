import java.util.*;
public class LeapYear
{
	public static void main(String[]ar)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Leap Year:");
		int a = sc.nextInt();
		if(a%4==0)
		{
			System.out.println(+a+",is leap year");
		}
		else
		{
			System.out.println(+a+",is not leap year");
		}

	}
}