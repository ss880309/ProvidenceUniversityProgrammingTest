import java.util.Scanner;

//程式範例41 名稱：乘數問題

public class Main 
{
	
	static int c(int n)
	{
		int sum = 1;
		while(n>9)
		{
			sum*=n%10;
			n/=10;
		}
		
		return sum*n;
	}
	
	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		while (sc.hasNext()) 
		{
			
			int N = sc.nextInt();
			int[] n = new int[N];
			StringBuilder sb = new StringBuilder("");
			for(int i=0;i<N;i++)
			{
				n[i] = sc.nextInt();
				sb.append(c(n[i])+"\r\n");
			}
			
			System.out.print(sb);
		}

	}

}