import java.util.Scanner;
import java.util.Stack;

public class Main 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		while (sc.hasNext()) 
		{
			
			String s = sc.nextLine();
			Stack st = new Stack();
			boolean yes = true;
			for(int i=0;i<s.length();i++)
			{
				char t = s.charAt(i);
				if(t=='(')
					st.push(t);
				else if(t==')')
				{
					if(!st.empty())
						st.pop();
					else
						yes = false;
				}
				
				if(!yes)
					break;
			}
			
			if(st.empty())
				System.out.println(yes?"YES":"NO");
			else
				System.out.println("NO");
		}

	}

}