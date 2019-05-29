import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
public class Main 
{ 
	public static void main(String[] args) 
	{ 
		Scanner sc = new Scanner(System.in);
		//題目可能有問題?
		while(sc.hasNext())
		{
			int a = sc.nextInt()+1;
			int b = sc.nextInt()+1;
			int[][] n = new int[a][b];
			n[0][0] = 0;
			for(int i=0;i<a;i++)
				n[i][0] = 1;
			for(int i=0;i<b;i++)
				n[0][i] = 1;
			for(int i=1;i<a;i++)
			{
				for(int j=1;j<b;j++)
				{
					n[i][j] = n[i-1][j]+n[i][j-1];
				}
			}
			
			//for(int i=0;i<a;i++)
			//	System.out.println(Arrays.toString(n[i]));
			
			
			System.out.println(n[a-1][b-1]);
			
		}
		
		
		
		
		
	}
}