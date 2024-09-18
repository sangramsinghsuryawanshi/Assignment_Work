import java.util.*;
public class SmallestNumUsingTernaryOp
{
	public static void main(String[]ar)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number:");
		int n = sc.nextInt();
		System.out.println("-----------------------------");
		System.out.println("Enter last number:");
		int n1 = sc.nextInt();
        	int min = (n < n1) ? n : n1;
		System.out.println(min+" is smallest number");
	}
}