import java.util.Scanner;
import java.util.StringTokenizer;

//�{���d��39 �W�١G�G���y���I�Ƨ�

class Co
{
	int x = 0;
	int y = 0;
}

public class Main 
{
	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		while (sc.hasNext()) 
		{
			int n = sc.nextInt();
			Co[] co = new Co[n];
			Co temp = new Co();
			for(int i=0;i<n;i++)
			{
				co[i] = new Co();
				co[i].x = sc.nextInt();
				co[i].y = sc.nextInt();
			}
			
			for(int i=0;i<n-1;i++)
			{
				for(int j=i+1;j<n;j++)
				{
					if(co[i].x>co[j].x)
					{
						temp = co[i];
						co[i] = co[j];
						co[j] = temp;
					}
					else if(co[i].x==co[j].x)
					{
						if(co[i].y>co[j].y)
						{
							temp = co[i];
							co[i] = co[j];
							co[j] = temp;
						}
					}
				}
			}	
			
			for(int i=0;i<n;i++)
				System.out.println(co[i].x+" "+co[i].y);
			
		}

	}

}