import java.util.*;
public class SumOfEachRowAndColoumn
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
		System.out.println("\n-----------------------------");
		System.out.println("Enter array element:");
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		System.out.println("\n-----------------------------");
		System.out.println("Addition of row: \n");
		int sum=0,sum1=0;
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				sum1+=a[i][j];
				System.out.print(a[i][j]+" + ");
			}
		System.out.print(" = "+sum1);
		System.out.println();
		}
		System.out.println("\n-----------------------------");
		System.out.println("Addition of column: \n");
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				sum+=a[j][i];
				System.out.print(a[j][i]+" + ");
			}
		System.out.print(" = "+sum);
		System.out.println();
		}
		System.out.println("\n-----------------------------");
	}
}
			
				