import java.util.Arrays;
import java.util.Scanner;
public class Main 
{		
	static int n = 0;
	static boolean isNumber(String s)
	{
		try
		{
			n = Integer.parseInt(s);
		}catch(Exception ex)
		{
			return false;
		}
		return true;
		
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext())
		{
			String S = sc.nextLine();
			String[] s = S.split(" ");
			int sum = 0;
			
			for(int i=0;i<s.length;i++)
			{
				if(isNumber(s[i]))
					sum += n;
			}
			
			System.out.println(sum);
			
		}
	}
}

