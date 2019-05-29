import java.math.BigInteger;
import java.util.Scanner;


public class Main 
{    
    
    /* Main method */
    public static void main(String[] args) 
    {
        //sc sc = new sc(System.in);
    	Scanner sc = new Scanner(System.in);
    	while(sc.hasNext())
    	{
    		int n = sc.nextInt();
    		BigInteger sum = new BigInteger("1");
    		for(int i=1;i<=n;i++)
    			sum = sum.multiply(BigInteger.valueOf(i));

    		String s = sum.toString();
    		int count = 0;
    		for(int i=s.length()-1;i>=0;i--)
    		{
    			if(s.charAt(i)=='0')
    				count++;
    			else
    				break;
    		}
    		System.out.println(count);
    		
    	}
    }        
}















