import java.util.Scanner;
import java.util.TreeMap;

public class Main 
{
	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		while (sc.hasNext()) 
		{
			int N = sc.nextInt();
			int[] t = new int[N];
			
			for(int i=0;i<N;i++)
				t[i] = sc.nextInt();
			
			TreeMap<Integer,Integer> n = new TreeMap<Integer,Integer>(); 
			
			for(int i=0;i<N;i++)
			{
				if(!n.containsKey(t[i]))
					n.put(t[i],1);
				else
					n.put(t[i],n.get(t[i])+1);
			}
			
			for(Object key:n.keySet())
				System.out.println(key+" "+n.get(key));
			
		}
	}
}