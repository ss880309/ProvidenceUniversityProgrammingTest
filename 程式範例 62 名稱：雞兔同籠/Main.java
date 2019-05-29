import java.util.Scanner;
public class Main 
{ 
	public static void main(String[] args) 
	{ 
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext())
		{
			int head = sc.nextInt();
			int leg  = sc.nextInt();
			//int temp = leg/2;
			int r = (leg/2)-head;
			int c = head-r;
			System.out.println(c+" "+r);
			
		}		
	}
}

