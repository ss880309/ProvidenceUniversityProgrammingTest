import java.util.Scanner;
public class Main 
{ 
	public static void main(String[] args) 
	{ 
		Scanner sc = new Scanner(System.in);
		/*
		90		 (09)
		9090999  (9990909)
		*/		
		String a = new StringBuilder(sc.next()).reverse().toString();
		String b = new StringBuilder(sc.next()).reverse().toString();
		int count = 0;
		int[] temp = new int[10];//¤£¶W¹L8
		String ans = "";
		
		for(int i=0,t=0;i<b.length();i++)
		{
			for(int j=i;j<b.length();j++)
			{
				if(b.substring(i, j+1).equals(a))
				{
					count++;
					temp[t++]=(i+a.length());
				}
			}	
		}
			
		for(int i=temp.length-1;i>=0;i--)
		{
			if(temp[i]==0)
				continue;
			ans+=(temp[i]+" ");
		}
		
		System.out.println(count);
		//System.out.println(ans);
		System.out.println(ans.trim());
	}
}