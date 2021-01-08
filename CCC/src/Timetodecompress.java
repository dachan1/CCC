import java.util.Scanner;

/*
* Author : danielchan
*Date : Jan. 8, 2021
*/
public class Timetodecompress
	{

		public static void main(String[] args)
			{
				Scanner sc=new Scanner(System.in);
				int x=sc.nextInt();
				for(int i=0; i<x; i++) {
				int numbre=sc.nextInt();
				String symbol=sc.next();
				for(int j=0; j<numbre; j++) {
					System.out.print(symbol);
				}
			}

	}
	}
