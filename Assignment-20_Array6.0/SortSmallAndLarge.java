import java.util.*;
public class SortSmallAndLarge
{
	public static void main(String[]ar)
	{
		 int a[] = { 1, 5, 6, 7, 8, 10 };
		 int b[] = { 2, 4, 9 };
		 int c[]=new int[a.length+b.length];
		 int c1=0;
		 for(int i=0;i<a.length;i++)
		 {
			c[i]=a[i];
			c1++;
		 }
		 for(int i=0;i<b.length;i++)
		 {
			c[c1]=b[i];
			c1++;
		 }
		 Arrays.sort(c);
		 System.out.println("\n-----------------------------");
		 System.out.print("1 array element is :");
		 for(int i=0;i<c.length-3;i++)
		 {
			System.out.print(c[i]+" ");
		 }
		 System.out.println("\n-----------------------------");
		 System.out.print("2 array element is :");
		 for(int i=6;i<c.length;i++)
		 {
			System.out.print(c[i]+" ");
		 }
		 System.out.println("\n-----------------------------");
	}
}

		
			
		