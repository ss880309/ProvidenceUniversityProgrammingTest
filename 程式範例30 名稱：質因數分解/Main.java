import java.util.Arrays;
import java.util.Scanner;
public class Main 
{		
	
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
			int a = sc.nextInt();//1000
			if(isPrime(a))
			{
				System.out.println(a);
				continue;
			}
			else
			{
				StringBuilder sb = new StringBuilder(a+"=");
				int[] t = new int[(int)Math.sqrt(a)];
				
				int count = 0;
				int i=0;
				for(;;)
				{
					if(a%n[i]==0)
					{
						a/=n[i];
						count++;
					}
					else
					{
						t[i] = count;
						count = 0;
						i++;
					}
					if(a==1)
					{
						t[i] = count;
						count = 0;
						i++;
						break;
					}
				}
				for(int j=0;j<=i;j++)
				{
					if(t[j]!=0)
					{
						if(t[j]==1)
							sb.append(n[j]+"*");
						else	
							sb.append(n[j]+"^"+t[j]+"*");
					}
					
				}
								
				System.out.println(sb.deleteCharAt(sb.length()-1));
				
			}
		}
	}
}

