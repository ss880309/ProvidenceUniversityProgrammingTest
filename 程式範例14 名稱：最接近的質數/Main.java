import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class Main 
{

	static boolean isPrime(int n)
	{
		for(int i=2;i*i<n;i++)
		{
			if(n%i==0)
				return false;
		}
		return true;
	}
	
	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		while (sc.hasNext()) 
		{
			int n = sc.nextInt()+1;
			
			while(true)
			{
				if(isPrime(n))
				{
					System.out.println(n);
					break;
				}
				n++;
			}
			
		}
	}
}