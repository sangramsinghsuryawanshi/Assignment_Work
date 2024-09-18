import java.util.*;
public class CalculateElectricityBill
{
	public static void main(String[]ar)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter unite to calculate electricity bill:");
		int unit = sc.nextInt();
		System.out.println("-------------------------");
		double tot=0,ucharge=0,total=0;
		if(unit<=50)
		{
			ucharge=(unit*0.50);
			System.out.println("Your "+unit+" charge is RS."+ucharge);
			tot=(ucharge*20)/100;
			total=tot+ucharge;
			System.out.println("Your toatl electricity bill is RS."+total);
		}
		else if(unit>50 && unit<=150)
		{
			ucharge=(unit*0.75);
			System.out.println("Your "+unit+" charge is RS."+ucharge);
			tot=(ucharge*20)/100;
			total=tot+ucharge;
			System.out.println("Your toatl electricity bill is RS."+total);
		}
		else if(unit>150 && unit<=250)
		{
			ucharge=(unit*1.20);
			System.out.println("Your "+unit+" charge is RS."+ucharge);
			tot=(ucharge*20)/100;
			total=tot+ucharge;
			System.out.println("Your toatl electricity bill is RS."+total);
		}
		else if(unit>250)
		{
			ucharge=(unit*1.50);
			System.out.println("Your "+unit+" charge is RS."+ucharge);
			tot=(ucharge*20)/100;
			total=tot+ucharge;
			System.out.println("Your toatl electricity bill is RS."+total);
		}

		else
		{
			System.out.println("invalid unit");
		}
	}
}


			