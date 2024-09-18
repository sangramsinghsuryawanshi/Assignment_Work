import java.util.*;
public class AlphabeticalCharacterDigitOrNot
{
	public static void main(String[]ar)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Alphabetical Character or digit or Special charater:");
		char ch = sc.next().charAt(0);
		if(ch>='a' && ch<='z')
		{
			System.out.println(ch+",is Alphabetical Character");
		}
		else if(ch>='0' && ch<='9')
		{
			System.out.println(ch+",is digit");
		}
		else 
		{
			System.out.println("It is special character");
		}

	}
}