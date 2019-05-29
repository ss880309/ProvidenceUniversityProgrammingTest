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
    		int[] p = new int[n];
    		int max = Integer.MIN_VALUE;
    		int min = Integer.MAX_VALUE;
    		double ave = 0.0d;
    		for(int i=0;i<n;i++)
    		{
    			p[i] = sc.nextInt();
    			max = p[i]>max?p[i]:max;
    			min = p[i]>min?min:p[i];
    			ave += (double)p[i];
    		}
    		
    		System.out.println("Maximun="+max);
    		System.out.println("Minimun="+min);
    		System.out.printf("Mean=%.3f",ave/(double)n);
    		
    		
    		
    	}
    }        
}
