
public class Main 
{    
    
    /* Main method */
    public static void main(String[] args) 
    {
        sc sc = new sc(System.in);
    	int N = sc.nextInt();
    	for(int i=0;i<N;i++)
    	{
    		
    		int n = sc.nextInt();
    		int sum = n%10;  		
    		do
    		{
    			n /= 10;
    			sum *= n%10;	
    		}while(n>10);
    		
    		System.out.println(sum);
    				
    	}    	
    }        
}















