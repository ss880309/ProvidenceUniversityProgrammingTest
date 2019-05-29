import java.math.BigInteger;
import java.util.Scanner;


public class Main 
{    
    
    /* Main method */
	
	public static String to14(int temp)
	{
		if(temp>9)
		{
			switch(temp)
			{
				case 10:
					return "A";
				case 11:
					return "B";
				case 12:
					return "C";
				case 13:
					return "D";
			}
		}
		return Integer.toString(temp);
	}
	
    public static void main(String[] args) 
    {
        //sc sc = new sc(System.in);
    	Scanner sc = new Scanner(System.in);
    	while(sc.hasNext())
    	{
    		int n = sc.nextInt();
    		StringBuilder sb = new StringBuilder("");
    		while(n>14)
    		{
    			int temp = n%14;
    			n /= 14;
    			sb.append(to14(temp));
    		}
    		
    		sb.append(to14(n));
    		
    		System.out.println(sb.reverse());
    		
    		
    	}
    }        
}


