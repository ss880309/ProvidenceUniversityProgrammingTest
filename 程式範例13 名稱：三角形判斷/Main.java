import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class Main 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		while (sc.hasNext()) 
		{
			
			int[] n = new int[3];
			for(int i=0;i<3;i++)
				n[i] = sc.nextInt();
			
			if( n[0]<0 || n[1]<0 || n[2]<0 )
			{
				System.out.println("NO");
				continue;
			}
			
			Arrays.sort(n);
			System.out.println(((n[0]+n[1])>n[2])?"YES":"NO");

		}
	}
}