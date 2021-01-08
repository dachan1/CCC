import java.util.Scanner;
/*
* Author : danielchan
*Date : Jan. 8, 2021
*/
public class Winningscore
	{

		public static void main(String[] args)
			{
				Scanner sc=new Scanner(System.in);
				int a=sc.nextInt();
				int b=sc.nextInt();
				int c=sc.nextInt();
				int d=sc.nextInt();
				int e=sc.nextInt();
				int f=sc.nextInt();
				int team1=0;
				int team2=0;
				team1=a*3+b*2+c;
				team2=d*3+e*2+f;
				if(team1>team2)
				{
					System.out.println("team 1 = gagnant");
				}
				else if(team1<team2)
				{
				System.out.println("team 2 = gagant");	
				}
				else
					System.out.println("tie");
						

			}

	}
