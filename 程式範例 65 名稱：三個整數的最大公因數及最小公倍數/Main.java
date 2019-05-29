import java.util.Scanner;

public class Main 
{
	static int gcd(int a, int b) 
	{
        if(b == 0)
            return a;
        return gcd(b, a%b);
    }
	
	static int lcm(int a, int b) 
	{
	    return a * b / gcd(a, b);
	}
	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		while (sc.hasNext()) 
		{
			
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			System.out.println(gcd(gcd(a,b),c)+" "+lcm(lcm(a,b),c));
			
		}
	}
}