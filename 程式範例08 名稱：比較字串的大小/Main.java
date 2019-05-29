import java.util.Scanner;

public class Main 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		while (sc.hasNext()) 
		{
			String[] s = new String[3];
			for(int i=0;i<3;i++)
				s[i] = sc.nextLine();
			

			for(int i=0;i<s[0].length()-1;i++)
			{
				for(int j=1+i;j<s[0].length();j++)
				{
					if(s[i].charAt(0)>s[j].charAt(0))
					{
						String temp = s[i];
						s[i] = s[j];
						s[j] = temp;
					}
					else if(s[i].charAt(0)==s[j].charAt(0))
					{
						if(s[i].charAt(1)>s[j].charAt(1))
						{
							String temp = s[i];
							s[i] = s[j];
							s[j] = temp;
						}
						else if(s[i].charAt(1)==s[j].charAt(1))
						{
							if(s[i].charAt(2)>s[j].charAt(2))
							{
								String temp = s[i];
								s[i] = s[j];
								s[j] = temp;
							}
						}
					}
						
				}
			}
			
			for(int i=0;i<3;i++)
				System.out.println(s[i]);
			
			
			
		}

	}

}