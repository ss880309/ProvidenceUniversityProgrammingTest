import java.util.Scanner;
public class Main 
{	
	static double dis(int a,int b,int c,int d)
	{
		//  A  (a,b)   B  (c,d)
		return Math.sqrt(Math.pow(c-a,2)+Math.pow(d-b,2));
	}
	
	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext())
		{
			int N = sc.nextInt();
			int[] a = new int[N];
			int[] b = new int[N];
			for(int i=0;i<N;i++)
			{
				a[i] = sc.nextInt();
				b[i] = sc.nextInt();
			}
			
			double min = Double.MAX_VALUE;
			
			for(int i=0;i<N-1;i++)
			{
				for(int j=i+1;j<N;j++)
					min = Math.min(min, dis(a[i],b[i],a[j],b[j]));	
			}
			
			System.out.printf("%.1f\r\n",min);
		}
		
	}
}

