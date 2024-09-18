import java.util.*;
public class VowelOrNot
{
	public static void main(String[]ar)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Alphabetical Character:");
		char ch = sc.next().charAt(0);
		switch(ch)
		{
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':System.out.println("It is a vowel");
				break;
			default:System.out.println("It is a consonant");
				break;
		}
	}
}