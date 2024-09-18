import java.util.*;
public class SignalColour
{
	public static void main(String[]ar)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter signal colour(r/g/y):");
		char colour = sc.next().charAt(0);
		System.out.println("-------------------------");
		if(colour=='r')
		{
			System.out.println("Car has to stop");
		}
		else if(colour=='y')
		{
			System.out.println("Car has to wait");
		}
		else if(colour=='g')
		{
			System.out.println("Car is allowed to go");
		}
		else
		{
			System.out.println("unrecognized signal");
		}
	}
}


			