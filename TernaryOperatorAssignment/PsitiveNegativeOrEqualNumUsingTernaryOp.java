import java.util.*;
public class PsitiveNegativeOrEqualNumUsingTernaryOp
{
	public static void main(String[]ar)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number:");
		int n = sc.nextInt();
		System.out.println((n>0)?"positive":(n<0)?"negative":"equal");
	}
}