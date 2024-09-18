import java.util.*;
public class AlphabeticalCharacterUpperLowerCase
{
	public static void main(String[]ar)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Alphabetical Character in Lower case Or Upper Case:");
		char ch = sc.next().charAt(0);
		if(ch>='a' && ch<='z')
		{
			System.out.println(ch+",is Lower Case Alphabetical Character");
		}
		else if(ch>='A' && ch<='Z')
		{
			System.out.println(ch+",is Upper Case Alphabetical Character");
		}
		else 
		{
			System.out.println("Invalid Input");
		}

	}
}