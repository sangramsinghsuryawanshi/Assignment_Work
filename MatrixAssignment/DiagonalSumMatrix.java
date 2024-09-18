import java.util.*;
public class DiagonalSumMatrix
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
		int c=0;
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				if(i!=j && a[i][j]!=0)
				{
					c++;
					break;
				}
				else if(i==j && a[i][j]==0)
				{
					c++;
					break;
				}
			}
			if(c==1)
			{
				break;
			}
		}
		int sum=0;
		if(c==0)
		{
			System.out.println("Diagonal matrix:");
			for(int i=0;i<a.length;i++)
			{
				for(int j=0;j<a[i].length;j++)
				{
					sum+=a[i][j];
					System.out.print(a[i][j]+" ");
				}
			System.out.println();
			}
		}
		else
		{
			System.out.print("Non Diagonal matrix");
		}
		System.out.println("\n-----------------------------");
		System.out.print("Sum of Diagonal matrix is: "+sum);
		System.out.println("\n-----------------------------");
	}
}