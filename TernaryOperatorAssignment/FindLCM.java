import java.util.*;
public class FindLCM
{
	public static void main(String[]ar)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number:");
		int n = sc.nextInt();
		System.out.println("-----------------------------");
		System.out.println("Enter last number:");
		int n1 = sc.nextInt();
		System.out.println("Given common divisor of "+n+" and "+n1+" is:");
		System.out.println("-----------------------------");
        	int max = (n > n1) ? n : n1;
       	        int lcm = max;
      		boolean v = false;
       		for (int i = max; !v; i++) 
		{
            		if (i % n == 0 && i % n1 == 0) 
			{
              			  lcm = i;
                		  v = true; 
           		 }
       		 }

                System.out.println("LCM of " + n + " and " + n1 + " is: " + lcm);
		System.out.println("\n----------------------------------------------");
	}
}