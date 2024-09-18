import java.util.*;
public class SwitchCaseWeekDay
{
	public static void main(String[]ar)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number 1 To 7:");
		int no=sc.nextInt();
		switch(no)
		{
		case 1:System.out.println("sunday");
			break;
		case 2:System.out.println("monday");
			break;
		case 3:System.out.println("tuesday");
			break;
		case 4:System.out.println("Wednesday");
			break;
		case 5:System.out.println("Thursday");
			break;
		case 6:System.out.println("Friday");
			break;
		case 7:System.out.println("Saturday");
			break;
		default:System.out.println("invalid input");
			break;
		}
	}
}
