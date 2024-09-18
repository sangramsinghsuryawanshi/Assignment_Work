import java.util.*;
public class CalculateGrossSalary
{
	public static void main(String[]ar)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your salary:");
		int n = sc.nextInt();
		System.out.println("-------------------------");
		int gsal=0;
		if(n<=10000)
		{
			gsal=(n*20)/100;
			int hra=gsal;
			System.out.println("Including HRA Remaing salary is :"+hra);
			gsal=(n*80)/100;
			int da=gsal;
			System.out.println("Including DA Remaing salary is :"+da);
			System.out.println("Including HRA and DA total salary is :"+(hra+da));
		}
		else if(n>10000 && n<=20000)
		{
			gsal=(n*25)/100;
			int hra=gsal;
			System.out.println("Including HRA Remaing salary is :"+hra);
			gsal=(n*90)/100;
			int da=gsal;
			System.out.println("Including DA Remaing salary is :"+da);
			System.out.println("Including HRA and DA total salary is :"+(hra+da));
		}
		else if(n>20000)
		{
			gsal=(n*30)/100;
			int hra=gsal;
			System.out.println("Including HRA Remaing salary is :"+hra);
			gsal=(n*90)/100;
			int da=gsal;
			System.out.println("Including DA Remaing salary is :"+da);
			System.out.println("Including HRA and DA total salary is :"+(hra+da));
		}
		else
		{
			System.out.println("Enter valid salary");
		}
	}
}


			