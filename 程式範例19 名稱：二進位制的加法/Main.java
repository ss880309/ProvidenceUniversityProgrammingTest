import java.util.Scanner;

public class Main 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		while (sc.hasNext()) 
		{
			int a = Integer.valueOf(sc.next(), 2);
			int b = Integer.valueOf(sc.next(), 2);
			System.out.println(Integer.toBinaryString(a+b));
		}
	}
}