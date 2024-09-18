import java.util.*;
public class ReverseOfGivenNumber
{
	public static void main(String[]ar)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter First number :");
		int first = sc.nextInt();
		System.out.print("------------------------\n");	
		System.out.print("Enter Last number :");
		int last = sc.nextInt();	
		System.out.print("------------------------\n");
		int i=first;
		while(i<=last)
		{
			int temp=i,rev=0,rem=0;
			while(temp!=0)
			{
				rem=temp%10;
				rev=(rev*10)+rem;
				temp=temp/10;
			}
			System.out.print(rev+" ");
			i++;
		}
		System.out.println("\n------------------------");
	}
}
		