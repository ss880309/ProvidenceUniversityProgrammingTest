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
				System.out.println("���A�����k�A����"+Math.abs(n)+"��");
			else if(n>0)
				System.out.println("���A�����k�A�� �h"+n+"��");
			else
				System.out.println("OK");
		}

	}

}