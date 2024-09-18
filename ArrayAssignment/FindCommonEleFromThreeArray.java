import java.util.*;
public class FindCommonEleFromThreeArray
{
	public static void main(String[]ar)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter 1 array size :");
		int size = sc.nextInt();
		System.out.println("\n----------------------");
		System.out.print("Enter 2 array size :");
		int size1 = sc.nextInt();
		System.out.println("\n----------------------");
		System.out.print("Enter 2 array size :");
		int size2 = sc.nextInt();
		System.out.println("\n----------------------");
		int a[]=new int[size];
		int b[]=new int[size1];
		int c[]=new int[size2];
		int d[]=new int[a.length+b.length+c.length];
		System.out.print("Enter 1 array element :");
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
		System.out.print("Enter 3 array element :");
		for(int i=0;i<c.length;i++)
		{
			c[i]=sc.nextInt();
		}
		int c1=0;
		for(int i=0;i<a.length;i++)
		{
			d[i]=a[i];
			c1++;
		}
		for(int i=0;i<b.length;i++)
		{
			d[c1]=b[i];
			c1++;
		}
		for(int i=0;i<c.length;i++)
		{
			d[c1]=c[i];
			c1++;
		}
		System.out.println("\n----------------------");
		System.out.print("common elements in these array is: ");
		for(int i=0;i<d.length;i++)
		{
			for(int j=i+1;j<d.length;j++)
			{
				if(d[i]==d[j])
				{
					if(d[i]!=-1)
					System.out.print(d[i]+" ");
				}
				if(d[i]==d[j])
				{
					d[j]=-1;
					d[i]=-1;
				}
			}
		}
		System.out.println("\n----------------------");
	}
}