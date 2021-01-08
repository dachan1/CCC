import java.util.Scanner;

/*
* Author : danielchan
*Date : Jan. 8, 2021
*/
public class occupyparking
	{

		public static void main(String[] args)
			{
				Scanner sc=new Scanner(System.in);
				int x=sc.nextInt();
				String one=sc.next();
				String two=sc.next();
				int montant=0;
				for(int i=0; i<x; i++)
				{
					if(one.charAt(i)==two.charAt(i))
						if(one.charAt(i)=='C')
							montant=montant+1;
				}
				System.out.println(montant);

			}

	}
