import java.util.*;
public class SortArrayInAscendingOfEachRow
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
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				for(int k=j+1;k<a[j].length;k++)
				{
					if(a[i][j]>a[i][k])
					{
						int t=a[i][j];
						a[i][j]=a[i][k];
						a[i][k]=t;
					}	
				}
			}
		}
		System.out.println("\n-----------------------------");
		System.out.println("given sort matrix is: \n");
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				System.out.print(a[i][j]+" ");
			}
		System.out.println();
		}
	}
}
						
						
						
						
			