import java.util.ArrayList;
import java.util.Scanner;
public class Main 
{		
	//78 66 32 69 78 88 92 95 76 66 89 73 87 44 52 65 62 71 65 82
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext())
		{
			ArrayList<Character>[] star = new ArrayList[5];//EDCBA
			for(int i=0;i<5;i++)
				star[i] = new ArrayList<Character>();
			
			int[] n = new int[20];
			for(int i=0;i<20;i++)
				n[i] = sc.nextInt();
			for(int i=0;i<20;i++)
			{
				int t = n[i];
				if(90<=t && t<=100)
				{
					star[4].add('*');
				}else if(80<=t && t<=89)
				{
					star[3].add('*');
				}else if(70<=t && t<=79)
				{
					star[2].add('*');
				}else if(60<=t && t<=69)
				{
					star[1].add('*');
				}else if(t<=59)
				{
					star[0].add('*');
				}
				
			}
			
			int max = -999;
			for(int i=0;i<5;i++)
				max = Math.max(star[i].size(),max);
			
			StringBuilder sb = new StringBuilder("");
			
			for(int i=max-1;i>=0;i--)
			{
				for(int j=0;j<5;j++)
				{
					try
					{
						sb.append(star[j].get(i));
					}catch(Exception ex)
					{
						sb.append(' ');
					}
				}
				sb.append("\r\n");
			}
			
			sb.append("-----\r\nEDCBA");
			
			System.out.println(sb);
			
		}
	}
}




