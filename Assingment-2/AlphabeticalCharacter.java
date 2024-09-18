import java.util.*;
public class AlphabeticalCharacter
{
	public static void main(String[]ar)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Alphabetical Character:");
		char ch = sc.next().charAt(0);
		if(ch>='a' && ch<='z')
		{
			System.out.println(ch+",is Alphabetical Character");
		}
		else
		{
			System.out.println(ch+",is not Alphabetical Character");
		}

	}
}