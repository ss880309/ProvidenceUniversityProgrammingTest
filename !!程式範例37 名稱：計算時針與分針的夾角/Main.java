import java.util.Scanner;
import java.util.StringTokenizer;

public class Main 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		/*
		while(sc.hasNext())
		{
			
			
			String s = sc.nextLine();
			String[] n = s.split(" ");
			int sum = 0;
			int temp = 0;
			int notnum = 0;
			for(int i=0;i<n.length;i++)
			{
				try
				{
					temp = Integer.parseInt(n[i]);
					sum += temp;
				}catch(NumberFormatException e)
				{
					//System.out.println("not a number");
					notnum++;
				}
			
				System.out.println("��"+n.length+"�Ӽƭ�");
				System.out.println("�`�M�O"+sum);
				System.out.println("�ƭȦ�"+(n.length-notnum)+"��");
				System.out.println("�D�ƭȦ�"+notnum+"��");
			
			}
			
			
			
		}
		*/
		
		
		
		
		///*
		while (sc.hasNext()) 
		{

			//StringTokenizer st = new StringTokenizer(time, ":");

			int hour = sc.nextInt();
			int mins = sc.nextInt();
			if (hour == 0 && mins == 0)
				break;

			double angle = Math.abs( 0.5 * (60 * hour - 11 * mins) );
			
			if(angle>180)
				angle = 360 - angle;

			System.out.printf("%.0f\n", angle);
			
		}
		//*/
	}

}