import java.util.*;
public class FindTheMinimumValueOfSeriesOFArray
{
	public static void main(String[]ar)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter array size :");
		int size = sc.nextInt();
		System.out.println("\n----------------------");
		int a[]=new int[size];
		int b[]=new int[size];
		System.out.print("Enter array element :");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("\n----------------------");
		System.out.print("Enter 2 array element :");
		for(int i=0;i<b.length;i++)
		{
			b[i]=sc.nextInt();
		}
		System.out.println("\n----------------------");
		int sum=0;
		for(int i=0;i<b.length;i++)
		{
			for(int j=i+1;j<b.length;j++)
			{
				if(b[i]>b[j])
				{
					int t=b[i];
					b[i]=b[j];
					b[j]=t;
				}
			}
		}
		for(int i=0;i<a.length;i++)
		{
			int temp=a[i]*b[i];
			sum+=temp;
		}
		System.out.print("Minimum value is: "+sum);
	}
}