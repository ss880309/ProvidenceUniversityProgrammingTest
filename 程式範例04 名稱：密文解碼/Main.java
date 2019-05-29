import java.util.Scanner;


public class Main 
{    
    
	
    public static void main(String[] args) 
    {
        //sc sc = new sc(System.in);
    	Scanner sc = new Scanner(System.in);
    	
    	//String t = "DEFGHIJKLMNOPQRSTUVWXYZABC";
    	String t = "XYZABCDEFGHIJKLMNOPQRSTUVWXYZABC";
    	
    	while(sc.hasNext())
    	{
    		String s = sc.nextLine();//DSSOH -> APPLE
    		for(int i=0;i<s.length();i++)
    		{
    			
    			
    			System.out.print( t.charAt( s.charAt(i)-'A' ) );
    			
    		}
    		System.out.println();
    	}
    }        
}
