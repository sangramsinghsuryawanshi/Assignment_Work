import java.util.*;
public class CheckDuckNumber
{
	public static void main(String[]ar)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number:");
		String n = sc.next();
		boolean condition = false;
		System.out.println("----------------------");
		for(int i = 0; i <= n.length(); i++) 
		{
              		if (n.charAt(i)!= '0') 
			{
                		condition = true;
				System.out.println(n + " is a duck number.");
                		break;             
			}
			else if(n.charAt(i)== '0')
			{
				condition = true;
				 System.out.println(n + " is not a duck number.");
                		break;   
			}
        	} 
    	}
}
			
		