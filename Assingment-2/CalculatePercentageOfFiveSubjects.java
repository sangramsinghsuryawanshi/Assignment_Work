import java.util.*;
public class CalculatePercentageOfFiveSubjects
{
	public static void main(String[]ar)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Physics marks :");
		int phy = sc.nextInt();
		System.out.println("Enter Chemistry marks:");
		int che = sc.nextInt();
		System.out.println("Enter Biology marks:");
		int bio = sc.nextInt();
		System.out.println("Enter Mathematics  marks:");
		int maths = sc.nextInt();
		System.out.println("Enter Computer marks:");
		int com = sc.nextInt();
		float percentage=(phy+che+bio+maths+com)/5;
		if(percentage >= 90)
		{
			System.out.println("Grade A:"+percentage);
		}
		else if(percentage >= 80)
		{
			System.out.println("Grade B:"+percentage);
		}
		else if(percentage >= 70)
		{
			System.out.println("Grade C:"+percentage);
		}
		else if(percentage >= 60)
		{
			System.out.println("Grade D:"+percentage);
		}
		else if(percentage >= 40)
		{
			System.out.println("Grade E:"+percentage);
		}
		else if(percentage < 40)
		{
			System.out.println("Grade F:"+percentage);
		}

		else
		{
			System.out.println("Invalid Output");
		}


	}
}