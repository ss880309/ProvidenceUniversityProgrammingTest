import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		while (sc.hasNext()) 
		{
			Integer[] n = new Integer[5];
			
			for(int i=0;i<5;i++)
				n[i] = sc.nextInt();
			
			Arrays.sort
			(n,
					new Comparator<Integer>() 
					{
				    	public int compare(Integer o1, Integer o2) 
				    	{
				        	return Integer.valueOf(Math.abs(o1)).compareTo(Math.abs(o2));
				    	}
					}
			);
					
			System.out.println(n[0]*n[1]);
			
		}
	}
}