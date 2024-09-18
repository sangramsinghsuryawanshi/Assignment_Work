import java.util.*;
public class JoinYearBonus
{
	public static void main(String[]ar)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter joining year:");
		int jyear = sc.nextInt();
		System.out.println("-------------------------");
		System.out.println("Enter current year:");
		int cyear = sc.nextInt();
		System.out.println("-------------------------");
		jyear=jyear+3; 
		if(jyear<=cyear)
		{
			System.out.println("You have bonus of Rs. 2500/- ");
		}
		else
		{
			System.out.println("You have nothing else");
		}
	}
}


			