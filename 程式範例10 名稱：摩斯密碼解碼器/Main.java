import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class Main 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String[] alpha = { "a", "b", "c", "d", "e", "f", "g", "h", "i", "j",
	            "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v",
	            "w", "x", "y", "z"};
		String[] mos = { ".-", "-...", "-.-.", "-..", ".", "..-.", "--.",
	            "....", "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.",
	            "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-",
	            "-.--", "--.."};
		//程式範例10 名稱：摩斯密碼解碼器
		while (sc.hasNext()) 
		{
			String S = sc.nextLine();
			String[] s = S.split(",");
			StringBuilder sb = new StringBuilder("");
			for(int i=0;i<s.length;i++)	
			{
				for(int j=0;j<mos.length;j++)
				{
					if(mos[j].equals(s[i]))
						sb.append(alpha[j]);
				}
			}
			System.out.println(sb.toString().toUpperCase());
		}
	}
}