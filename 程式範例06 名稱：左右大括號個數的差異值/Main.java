import java.util.Scanner;



public class Main 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		while (sc.hasNext()) 
		{
			String s = sc.nextLine();
		    int a = 0;
			int b = 0;
			for(int i=0;i<s.length();i++)
			{
				if(s.charAt(i)=='{')
					a++;
				else if(s.charAt(i)=='}')
					b++;
			}
			
			int n = a-b;
			if(n<0)
				System.out.println("左括號較右括號少"+Math.abs(n)+"個");
			else if(n>0)
				System.out.println("左括號較右括號 多"+n+"個");
			else
				System.out.println("OK");
		}

	}

}