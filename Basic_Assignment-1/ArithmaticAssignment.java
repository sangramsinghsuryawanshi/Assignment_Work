import java.util.Scanner;
public class ArithmaticAssignment
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Input Frist Number:");
		int a = sc.nextInt();
		System.out.print("Input Second Number:");
		int b = sc.nextInt();
		System.out.println("125 + 24 ="+(a+b));
		System.out.println("125 - 24 = "+(a-b));
		System.out.println("125 x 24 = "+(a*b));
		System.out.println("125 / 24 = "+(a/b));
		System.out.println("125 mod 24 = "+(a%b));

	}
}