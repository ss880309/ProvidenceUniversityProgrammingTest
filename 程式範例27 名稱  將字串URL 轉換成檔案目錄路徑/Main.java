import java.util.Arrays;
import java.util.Scanner;
public class Main 
{		
	/*�{���d��27 �W��  �N�r��URL �ഫ���ɮץؿ����|	
	URL = "http://www.cs.pu.edu.tw:8080/bcc/exam/test1.htm"
	DocRoot = "C:/apache/www/"	
	->	
	"C:/apache/www/bcc/exam/test1.htm"		
	*/
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext())
		{
			String u = sc.nextLine();
			String d = sc.nextLine();
			String[] su = u.split("/");
			String[] sd = d.split("\"");
			
			StringBuilder a = new StringBuilder("\""+sd[1]);
			for(int i=3;i<su.length;i++)
				a.append(su[i]+"/");
			
			a.deleteCharAt(a.length()-1);
			System.out.println(a);
			
		}
	}
}

