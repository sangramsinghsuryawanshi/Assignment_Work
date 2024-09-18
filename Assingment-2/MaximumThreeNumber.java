import java.util.*;
public class MaximumThreeNumber
{
	public static void main(String[]ar)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First number:");
		int a = sc.nextInt();
		System.out.println("Enter Second number:");
		int b = sc.nextInt();
		System.out.println("Enter Third number:");
		int c = sc.nextInt();

		
		if(a>b)
		{
			if(a>c)
			{
				System.out.println(a+",is grater than ,"+b+",and" +c);
			}
			else
			{				
				System.out.println(c+",is grater than ,"+b+",and" +a);
                        }
		}
		else if(b>a)
		{
			if(b>c)
			{
				System.out.println(+b+",is greater than,"+c+",and" +a);
			}
			else
			{				
				System.out.println(c+",is grater than ,"+b+",and" +a);
			}

		}

		else
		{
			System.out.println(+c+",is greater than,"+a+",and "+b);
		}


	}
}