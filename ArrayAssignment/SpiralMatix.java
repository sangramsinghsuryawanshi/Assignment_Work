/* top----->0       1 2 3  0 1 2<-a.lenght-1<--right side-->indexes 00 01 02
            1       4 5 6	                                    10 11 12
            2       7 8 9                                           20 21 22
		    0
		    1
bottom->a.length-1->2
             
left side-->0 1 2-> 1 2 3  0 1 2<-a.lenght-1<--right side-->indexes 00 01 02
                    4 5 6	                                    10 11 12
                    7 8 9                                           20 21 22


left side is a 0 and starting index
right side is a a.length-1 and end of every row and col given index
top is a 0  and starting index
bottom is a a.length-1 and end of every row and col given index
*/

import java.util.*;
public class SpiralMatix
{
	public static void main(String[]ar)
	{
		Scanner sc = new Scanner(System.in);
		int a[][]={{1,2,3},{4,5,6},{7,8,9}};
		int left=0;
		int right =a[0].length-1;
		int top=0,bottom=a.length-1;
		while(left<=right && top<=bottom)//first give condition where //we want to go
		{
			for(int i=left;i<=right;i++)//first loop always //starting with left to right to check condition and print a[top][i]top->is //starting //point with left side and i-> is not constant index  that's why we use top is constatnt
			{
				System.out.print(a[top][i]+" ");//a[1][2]a[2][2]...check condition
			}
			top++;//to move the next index: top 0-->1
			for(int i=top;i<=bottom;i++)//ele going to top to //bootom from right side top is =1 and bottom is a= a.length-1-->2  and a[i]=is //a //changing index because of top and a[right] is a constant a.lenght-1 =2
			{
				System.out.print(a[i][right]+" ");//a[1][2]a[2][2]...
			}
			right--; //move to previous index right-->1
			if(top<=bottom)//1<=3//row and colo are not match then use //these conditon
			{
			for(int i=right;i>=left;i--)//after going to top to //bottom we going to right to left to reverse loop right=2 1 0 to left =0 
			{
				System.out.print(a[bottom][i]+" ");//a[2][1]a[2][0]….
			}
			bottom--;//-->1
			}
			if(left<=right)//row or col check
			{
				for(int i=bottom;i>=top;i--)//left column 
				{
					System.out.print(a[i][left]+" ");
				}
				left++;
			}
		}
	}
}