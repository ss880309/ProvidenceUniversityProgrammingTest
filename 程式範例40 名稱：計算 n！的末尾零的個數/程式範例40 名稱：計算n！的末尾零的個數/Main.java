import java.util.Scanner;

public class Main 
{
	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		while (sc.hasNext()) 
		{
			
			int n = sc.nextInt();//100
			int sum = 0;
			
			while(n>=5)
			{
				sum += n/5;//0+20
				n = n/5;
			}
			
			System.out.println(sum);
			
		}

	}

}