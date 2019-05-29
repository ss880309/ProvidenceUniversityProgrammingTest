import java.util.Scanner;

public class Main 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		while (sc.hasNext()) 
		{
			char op = sc.next().charAt(0);
			double x = sc.nextDouble();
			double y = sc.nextDouble();
			System.out.printf("%.6f\r\n",(op=='$')?(x+y)/2.0:(x-y)/2.0);
			
		}
	}
}