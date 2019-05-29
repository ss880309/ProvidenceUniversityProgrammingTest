import java.util.Scanner;
public class Main 
{		
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext())
		{
			int n = sc.nextInt();
			String s;
			switch(n)
			{
				default:
					s = "";
					break;
				case 0:
					s = "a,b,c,d,e,f";
					break;
				case 1:
					s = "b,c";
					break;
				case 2:
					s = "a,b,d,e,g";
					break;
				case 3:
					s = "a,b,c,d,g";
					break;
				case 4:
					s = "b,c,f,g";
					break;
				case 5:
					s = "a,c,d,f,g";
					break;
				case 6:
					s = "a,c,d,e,f,g";
					break;
				case 7:
					s = "a,b,c,f";
					break;
				case 8:
					s = "a,b,c,d,e,f,g";
					break;
				case 9:
					s = "a,b,c,d,f,g";
					break;
			}
			
			System.out.println(s);
			
		}
	}
}

