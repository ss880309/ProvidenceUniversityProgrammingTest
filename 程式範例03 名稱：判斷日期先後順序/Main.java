import java.util.Scanner;



public class Main 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		while (sc.hasNext()) 
		{
			String line = sc.nextLine();
			String[] S = line.split(" ");//    04/05/1999 20/02/1995
			
			String[] s1 = S[0].split("/");//   04/05/1999
			String[] s2 = S[1].split("/");//   20/02/1995
			
			int d1 = Integer.parseInt(s1[0]);
			int m1 = Integer.parseInt(s1[1]);
			int y1 = Integer.parseInt(s1[2]);
			
			int d2 = Integer.parseInt(s2[0]);
			int m2 = Integer.parseInt(s2[1]);
			int y2 = Integer.parseInt(s2[2]);
			
			if(y1>y2)
			{
				System.out.println("After");
			}
			else if(y1<y2)
			{
				System.out.println("Before");
			}
			else
			{
				if(m1>m2)
				{
					System.out.println("After");
				}
				else if(m1<m2)
				{
					System.out.println("Before");
				}
				else
				{
					if(d1>d2)
					{
						System.out.println("After");
					}
					else if(d1<d2)
					{
						System.out.println("Before");
					}
					else
					{
						System.out.println("Same");
					}
					
				}
			}
			
			
			
			
			
		}

	}

}