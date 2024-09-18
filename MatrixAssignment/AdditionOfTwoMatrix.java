import java.util.*;
public class AdditionOfTwoMatrix
{
	public static void main(String[]ar)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter row of array:");
		int row = sc.nextInt();
		System.out.println("\n-----------------------------");
		System.out.print("Enter col of array:");
		int col = sc.nextInt();
		int a[][]=new int[row][col];
		int b[][]=new int[row][col];
		System.out.println("\n-----------------------------");
		System.out.println("Enter 1 array element:");
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				a[i][j]=sc.nextInt();
			}
		System.out.println();
		}
		System.out.println("\n-----------------------------");
		System.out.println("Enter 2 array element:");
		for(int i=0;i<b.length;i++)
		{
			for(int j=0;j<b[i].length;j++)
			{
				b[i][j]=sc.nextInt();
			}
		System.out.println();
		}
		System.out.println("\n-----------------------------");
		System.out.println("Addition of two matrix:");
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				System.out.print(a[i][j]+b[i][j]+" ");
			}
		System.out.println();
		}
		System.out.println("\n-----------------------------");
	}
}
				

		
		