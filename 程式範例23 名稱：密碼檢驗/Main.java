import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;
public class Main 
{	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		//LinkedList<String> s = new LinkedList<String>();
		while(sc.hasNext())
		{
			int[] a = new int[4];
			for(int i=0;i<4;i++)
				a[i] = sc.nextInt();
			
			String s = sc.nextLine();
			int[] b = new int[4];
			for(int i=0,j=0;i<s.length();i++)
			{
				if('0'<=s.charAt(i)&&s.charAt(i)<='9')
					b[j++] = s.charAt(i)-'0';
			}
			
			boolean c = true;
			
			for(int i=0;i<a.length;i++)
			{
				if(a[i]!=b[i])
				{
					c = false;
					break;
				}
			}
			
			System.out.println(c?"¡§CORRECT¡¨":"¡§INCORRECT¡¨");

		}
		
	}
}

/*
1 2 3 4 (±K½X: 1 2 3 4)
2 5 12 3 (±K½X: 1 2 3 4)

*/

