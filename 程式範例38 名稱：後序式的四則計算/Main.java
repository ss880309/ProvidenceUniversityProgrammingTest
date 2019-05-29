import java.util.Scanner;
import java.util.Stack;
public class Main 
{		
	static int cal(int a,int b,char c)
	{
		switch(c)
		{
			case '+':
				return a+b;
			case '-':
				return a-b;
			case '*':
				return a*b;
			case '/':
				return a/b;
			default:
				return 0;
		}
			
	}
	static boolean isop(String s)
	{
		return (s.equals("+")||s.equals("-")||s.equals("*")||s.equals("/"))?true:false;
	}
	
	static int pos(String[] n)
	{
		Stack<String> st = new Stack<String>();
		for(int i=0;i<n.length;i++)
		{
			if(!isop(n[i]))
			{
				st.push(n[i]);
			}
			else
			{
				int a = Integer.parseInt(st.pop());
				int b =	Integer.parseInt(st.pop()); 
				st.push(Integer.toString(cal(b,a,n[i].charAt(0))));
			}
		}
		return Integer.parseInt(st.pop());
	}
	
	
	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext())
		{
			
			String S = sc.nextLine();
			String[] s = S.split(" ");
			System.out.println(pos(s));
			
		}
	}
}

