import java.util.Scanner;
public class Main 
{	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext())
		{
			String s = sc.next();
			System.out.println(new StringBuilder(s).reverse().toString().equals(s)?"YES":"NO");
		}
	}
}