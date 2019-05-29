import java.util.Scanner;
public class Main 
{		
	
	static String format(char c,int[] n)
	{
		return "("+c+","+n[c-'a']+")";
	}
	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext())
		{
			String s = sc.nextLine().toLowerCase();
			int[] c = new int[26];
			for(int i=0;i<s.length();i++)
			{
				if('a'<=s.charAt(i)&&s.charAt(i)<='z')
					c[s.charAt(i)-'a']++;
			}
			StringBuilder sb = new StringBuilder("");
			for(int i=0;i<26;i++)
			{
				if(c[i]!=0)
					sb.append(format((char)(i+'a'),c));
			}
			
			System.out.println(sb);
			
		}
	}
}

