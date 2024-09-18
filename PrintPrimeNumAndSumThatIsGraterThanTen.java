import java.util.*;
public class PrintPrimeNumAndSumThatIsGraterThanTen
{
	public static void main(String[]ar)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number:");
		int n = sc.nextInt();
		System.out.println("----------------------");
		System.out.println("Enter last number:");
		int n1 = sc.nextInt();
		int i=n,sum1=0;
		while(i<=n1)
		{
			int j=1,c=0;
			while(j<=i)
			{
				if(i%j==0)
				{
					c++;
				}
				j++;
			}
			if(c==2)
			{
				int rem=0,temp=i,sum=0;
				while(temp!=0)
				{
					rem=temp%10;
					sum=sum+rem;
					temp=temp/10;
				}
					if(sum>=10)
					{
						System.out.println(i+" = "+sum);
						sum1+=i;
					}
			
			}
		i++;
		}
		System.out.println("-----------------------------------\nAddition of all prime number:"+sum1);

	}
} 
			
		