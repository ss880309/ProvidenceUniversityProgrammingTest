import java.util.Arrays;
import java.util.LinkedList;
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
    		LinkedList p = new LinkedList<Integer>();
    		for(int i=1;i<=n;i++)
    			p.add(i);
    		
    		int count = 2;
    		while(p.size()!=1)
    		{
    			p.remove(count);
    			count = (count+2)%p.size();
    		}
    		System.out.println(p.get(0));
    		
    	}
    }        
}
