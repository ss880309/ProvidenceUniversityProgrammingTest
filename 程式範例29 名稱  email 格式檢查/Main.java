import java.util.Scanner;
public class Main 
{		
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext())
		{
			
			String S = sc.nextLine();
			String[] s = S.split("@");
			boolean legal = true;
			for(int i=0;i<s[0].length();i++)
			{
				if(!(('a'<=s[0].charAt(i)&&s[0].charAt(i)<='z')||('A'<=s[0].charAt(i)&&s[0].charAt(i)<='Z')))
				{
					legal = false;
					break;
				}
			}
			
			System.out.println("�z��J���r��G"+S+(legal?" ��X�k�� email �榡":" ���ŦX email ���榡"));
			
		}
	}
}

