import java.util.*;
public class QEightNumPatternUsingWhileAndFor
{
	public static void main(String[]ar)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n number :");
		int n = sc.nextInt();
		System.out.println("Using for loop");
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=n;j++)
			{
				if(i==1 && j==1)
				{
					System.out.print(j+" ");
				}
				else if(i==2 && j>=1 && j<=3)
				{
					System.out.print(j+" ");
				}
				else if(i==3 && j>=1 && j<=5)
				{
					System.out.print(j+" ");
				}
				else if(i==4 && j>=1 && j<=7)
				{
					System.out.print(j+" ");
				}
				else if(i==5 && j>=1 && j<=9)
				{
					System.out.print(j+" ");
				}

			}
			System.out.println();
		}
        	System.out.println("___________________________________");
		
		System.out.println("Enter n number :");
		int n1 = sc.nextInt();
		System.out.println("Using while loop");
		int i=1;
		while(i<=5)
		{
			int j=1;
			while(j<=n1)
			{
				if(i==1 && j==1)
				{
					System.out.print(j+" ");
				}
				else if(i==2 && j>=1 && j<=3)
				{
					System.out.print(j+" ");
				}
				else if(i==3 && j>=1 && j<=5)
				{
					System.out.print(j+" ");
				}
				else if(i==4 && j>=1 && j<=7)
				{
					System.out.print(j+" ");
				}
				else if(i==5 && j>=1 && j<=9)
				{
					System.out.print(j+" ");
				}
			j++;
			}
			System.out.println();
		i++;
		}
	}
}