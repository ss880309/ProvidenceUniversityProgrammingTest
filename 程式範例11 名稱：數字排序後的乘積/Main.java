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
    		ArrayList<Integer> n = new ArrayList<Integer>();
    		for(int i=0;i<8;i++)
    			n.add(sc.nextInt());
    		Collections.sort(n);
    		System.out.println(n.get(1)*n.get(6));
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
