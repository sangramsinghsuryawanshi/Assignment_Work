import java.util.*;
public class CheckAutomorphicNumber
{
	public static void main(String[]ar)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number:");
		int n = sc.nextInt();
		System.out.println("----------------------");
		int i=n,sq=0;
		while(true)
		{
			sq=i*i;
			int j=sq-(i*i-i);
			int temp=sq%100;
			int temp1=sq%10;
			if(temp1==n)
			{
				System.out.println(n+" is an automorphic number");
			}
			else if(temp==j)
			{
					System.out.println(n+" is an automorphic number");
			}
			else
			{
					System.out.println(n+" is not an automorphic number");
			}

		break;
		}
		System.out.println("-----------------------------------");
	}
} 
			
		