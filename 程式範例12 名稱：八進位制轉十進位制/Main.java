import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class Main 
{    
    
	
    public static void main(String[] args) 
    {
        //sc sc = new sc(System.in);
    	Scanner sc = new Scanner(System.in);
    	while(sc.hasNext())
    	{
    		String s = sc.nextLine();
    		int sum = 0;
    		for(int i=0;i<s.length();i++)
    		{
    			sum*=8;
    			sum += (s.charAt(i)-'0');
    		}
    		
    		System.out.println(sum);
    		
    	}
    	
    	/*88
    	while(sc.hasNext())
    	{
    		LinkedList<String> s = new LinkedList<String>();
    		
    		for(int i=0;i<3;i++)
    			s.add(sc.nextLine());
    		
    		for(int i=0;i<s.get(0).length();i++)
    		{
    			for(int j=0;j<3;j++)
    			{
    				//if(s.get(j))
    			}
    		}
    		
    		
    		
    	}
    	*/
    	
    	
    	
    }        
}
