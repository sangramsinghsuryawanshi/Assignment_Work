import java.util.*;
public class QTenNumPatternUsingWhileAndForAnsElseIf
{
	public static void main(String[]ar)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n number :");
		int n = sc.nextInt();
		System.out.println("Using for loop");
		int c=1,c2=3,c3=4,c4=5;
		char c1='@';
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=n;j++)
			{
				if(i==1 && j>=1 && j<=5)
				{
					System.out.print(c+" ");
				}
				else if(i==2 && j>=1 && j<=4)
				{
					System.out.print(c1+" ");
				}
                                else if(i==3 && j>=1 && j<=3)
				{
					
					System.out.print(c2+" ");
				}
				 else if(i==4 && j>=1 && j<=2)
				{
					
					System.out.print(c3+" ");
				}
				 else if(i==5 && j>=1 && j<=1)
				{
					
					System.out.print(c4+" ");
				}
				
				
			}
			System.out.println();
		}
        	System.out.println("___________________________________");
		
		System.out.println("Enter n number :");
		int n1 = sc.nextInt();
		System.out.println("Using while loop");
		int i=1;
		int a=1,a1=2,a2=3,a3=4,a4=5;
		while(i<=5)
		{
			int j=1;
			while(j<=n1)
			{
				if(i==1 && j>=1 && j<=5)
				{
					System.out.print(a+" ");
				}
				else if(i==2 && j>=1 && j<=4)
				{
					
					System.out.print(a1+" ");
				}
                                else if(i==3 && j>=1 && j<=3)
				{
					
					System.out.print(a2+" ");
				}
				 else if(i==4 && j>=1 && j<=2)
				{
					
					System.out.print(a3+" ");
				}
				 else if(i==5 && j>=1 && j<=1)
				{
					
					System.out.print(a4+" ");
				}

			j++;
			}
			System.out.println();
		i++;
		}
	}
}