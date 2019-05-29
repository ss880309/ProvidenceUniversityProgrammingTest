import java.util.LinkedList;
import java.util.Scanner;
public class Main 
{	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		LinkedList<String> s = new LinkedList<String>();
		
		while(sc.hasNext())
			s.add(sc.nextLine());
		
		StringBuilder sb = new StringBuilder(s.remove(0));
		
		for(int i=0;i<s.size();i++)
			sb.append("<BR>"+s.remove(0));
		
		System.out.println(sb);
		
	}
}