import java.util.Arrays;
import java.util.Scanner;
public class Main 
{		
	
	static String format(int n)
	{
		String s = Integer.toString(n);
		switch(s.length())
		{
			case 1:
				return "00"+s;
			case 2:	
				return "0"+s;
			case 3:
				return s;
			default:
				return "000";
		}
	}
	
	
	static boolean isPrime(int n)
	{
		boolean is = true;
		for(int i=2;i*i<=n;i++)
		{
			if(n%i==0)
			{
				is = false;
				break;
			}
		}
		return is;
	}
	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int[] n = new int[10000];
		for(int i=2,index = 0;i<9000;i++)
		{
			boolean is = true;
			for(int j=2;j*j<=i;j++)
			{
				if(i%j==0)
				{
					is = false;
					break;
				}
			}	
			if(is)
				n[index++] = i;
		}

		while(sc.hasNext())
		{
			int N = sc.nextInt();//1000
			StringBuilder sb = new StringBuilder("");
			int sbcount = 0;
			for(int i=2;i<N;i++)
			{
				if(isPrime(i))
				{
					sb.append(format(i));
					sbcount++;
					
					if(sbcount%5==0)
						sb.append("\r\n");
					else
						sb.append("\t");
				}
			}
			
			System.out.println(sb+"小於"+N+"的質數共有"+sbcount+"個");
			
		}
	}
}

