import java.util.*;
public class RandomShuffleArrayEle
{
	public static void main(String[]ar)
	{
		Random r = new Random();	
		int a[]={1, 2, 3, 4, 5, 6};
		System.out.println("\n------------------------");
		System.out.print("Given array element is:");
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
		for(int i=0;i<a.length;i++)
		{
			int ind = r.nextInt(a.length);
			int t=a[i];
			a[i]=a[ind];
			a[ind]=t;
		}
		System.out.println("\n------------------------");
		System.out.print("Shuffle array:");
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
		System.out.println("\n------------------------");
	}
}
			