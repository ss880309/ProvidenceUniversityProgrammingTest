import java.util.Scanner;
public class Main 
{		
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext())
		{
			int n = sc.nextInt();
			int sum = 0;
			for(int i=0;i<=(n/5)/2;i++)
				sum += (n/5) - 2*i + 1;
			System.out.println(sum);
		}
	}
}




