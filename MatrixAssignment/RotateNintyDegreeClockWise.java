import java.util.*;
public class RotateNintyDegreeClockWise
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
		System.out.println("matrix by 90 degrees clockwise: ");
		for(int i=0;i<a.length;i++)
		{
			for(int j=a.length-1;j>=0;j--)
			{
				System.out.print(a[j][i]+" ");
			}
		System.out.println();
		}
		System.out.println("\n-----------------------------");
	}
}