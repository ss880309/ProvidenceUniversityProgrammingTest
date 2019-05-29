import java.util.Scanner;


public class Main 
{    
    
	
    public static void main(String[] args) 
    {
        //sc sc = new sc(System.in);
    	Scanner sc = new Scanner(System.in);
    	
    	while(sc.hasNext())
    	{
    		int sum = 1;
    		
    		int n = sc.nextInt();
    		
    		for(int i=n;i>=1;i--)
    			sum*=i;
    		
    		System.out.println(sum);
    		
    		
    	}
    }        
}
