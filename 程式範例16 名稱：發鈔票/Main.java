import java.util.HashMap;
import java.util.Scanner;

public class Main 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		while (sc.hasNext()) 
		{
			int n = sc.nextInt();
			int d1 = 0;
			int d5 = 0;
			int d10 = 0;
			int d50 = 0;
			int d100 = 0;
			
			while(n!=0)
			{
				if(n>=100)
				{
					d100++;
					n-=100;
					continue;
				}
				else if(n>=50)
				{
					d50++;
					n-=50;
					continue;
				}
				else if(n>=10)
				{
					d10++;
					n-=10;
					continue;
				}
				else if(n>=5)
				{
					d5++;
					n-=5;
					continue;
				}
				else if(n>=1)
				{
					d1++;
					n-=1;
					continue;
				}
			}
			
			System.out.printf("1-%d, 5-%d, 10-%d, 50-%d, 100-%d\r\n",d1,d5,d10,d50,d100);

		}
	}
}