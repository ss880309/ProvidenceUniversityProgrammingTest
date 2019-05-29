import java.util.Scanner;


public class Main 
{    
    
	
    public static void main(String[] args) 
    {
        //sc sc = new sc(System.in);
    	Scanner sc = new Scanner(System.in);
    	
    	while(sc.hasNext())
    	{
    		int n = sc.nextInt();
    		
    		for(int i=0;i<n;i++)
    		{
    			for(int j=0;j<=i;j++)
        		{
        			System.out.print("*");
        		}
    			System.out.println();
    		}
    		
    		
    	}
    }        
}
