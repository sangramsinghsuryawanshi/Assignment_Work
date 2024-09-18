import java.util.*;
public class CheckNumIskrishnamurthyNumOrNot
{
	public static void main(String[]ar)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your number:");
		int num = sc.nextInt();
		System.out.println("----------------------");
		int sum=0,rem=0,temp=num;
		while(temp!=0)
		{
			int j=1,fact=1;
			rem=temp%10;
			while(j<=rem)
			{
				fact=fact*j;
				j++;
			}
			sum+=fact;
			temp=temp/10;
		}
		if(num==sum)
		{
			System.out.println("Inputed number is krishnamurthy number");
		}
		else
		{
			System.out.println("Inputed number is not krishnamurthy number");
		}
	}
} 
			
		