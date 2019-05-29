import java.util.Scanner;
public class Main 
{	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext())
		{
			String s = sc.nextLine();
			StringBuilder sb = new StringBuilder(s.charAt(0)+""+(char)(s.charAt(1)-'a'+'A'));
			for(int i=2;i<s.length();i++)
			{
				if((s.charAt(i-1)==' '&&s.charAt(i-2)=='.')&&('a'<=s.charAt(i)&&s.charAt(i)<='z'))
					sb.append((char)(s.charAt(i)-'a'+'A'));
				else
					sb.append(s.charAt(i));
			}
			
			System.out.println(sb);

		}
		
	}
}

