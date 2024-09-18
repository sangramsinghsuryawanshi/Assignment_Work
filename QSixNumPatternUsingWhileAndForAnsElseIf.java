import java.util.*;
public class QSixNumPatternUsingWhileAndForAnsElseIf
{
	public static void main(String[]ar)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n number :");
		int n = sc.nextInt();
		System.out.println("Using for loop");
		int c=2,c1=3,c2=4,c3=5;
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=n;j++)
			{
				if(i==1 && j>=1 && j<=1)
				{
					System.out.print(j+" ");
				}
				else if(i==2 && j>=1 && j<=2)
				{
					
					System.out.print(c+" ");
                                        c++;
				}
                                else if(i==3 && j>=1 && j<=3)
				{
					
					System.out.print(c1+" ");
                                        c1++;
				}
				 else if(i==4 && j>=1 && j<=4)
				{
					
					System.out.print(c2+" ");
                                        c2++;
				}
				 else if(i==5 && j>=1 && j<=5)
				{
					
					System.out.print(c3+" ");
                                        c3++;
				}
				else
				{ 
					System.out.print(" ");
				}
			}
			System.out.println();
		}
        	System.out.println("___________________________________");
		
		System.out.println("Enter n number :");
		int n1 = sc.nextInt();
		System.out.println("Using while loop");
		int i=1;
		int a=2,a1=3,a2=4,a3=5;
		while(i<=5)
		{
			int j=1;
			while(j<=n1)
			{
				if(i==1 && j>=1 && j<=1)
				{
					System.out.print(j+" ");
				}
				else if(i==2 && j>=1 && j<=2)
				{
					
					System.out.print(a+" ");
                                        a++;
				}
                                else if(i==3 && j>=1 && j<=3)
				{
					
					System.out.print(a1+" ");
                                        a1++;
				}
				 else if(i==4 && j>=1 && j<=4)
				{
					
					System.out.print(a2+" ");
                                        a2++;
				}
				 else if(i==5 && j>=1 && j<=5)
				{
					
					System.out.print(a3+" ");
                                        a3++;
				}
				else
				{ 
					System.out.print(" ");
				}

			j++;
			}
			System.out.println();
		i++;
		}
	}
}