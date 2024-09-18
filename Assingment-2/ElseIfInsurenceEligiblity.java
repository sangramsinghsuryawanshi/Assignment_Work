import java.util.*;
public class ElseIfInsurenceEligiblity
{
	public static void main(String[]ar)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your age:");
		int age=sc.nextInt();
		System.out.println("Married Status(y/n):");
		char s=sc.next().charAt(0);
		System.out.println("Enter your gender(f/m):");
		char ch=sc.next().charAt(0);

		if(s=='y')
		{
			System.out.println("The Driver is married");
			if(age>=30)
			{
				System.out.println("Driver is eligible");
			}

		}
		if(s=='n')
		{
			if(age>=25)
			{
				System.out.println("Driver is eligible");
			}
				if(ch=='m')
				{
					System.out.println(" the driver is unmarried, male & above 25 years of age");
				}
				if(ch=='f')
				{
					 System.out.println("the driver is unmarried, female & above 25 years of age");
				}
		}


	}
}
