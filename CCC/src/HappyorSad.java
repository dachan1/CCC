import java.util.Scanner;
//https://github.com/dachan1/CCC.git
/*
* Author : danielchan
*Date : Jan. 8, 2021
*/
public class HappyorSad
	{

		public static void main(String[] args)
			{
				Scanner sc=new Scanner(System.in);
				String input=sc.nextLine();
				int montant=0;
				boolean r=false;
				for(int i=0; i<input.length(); i++)
					if(input.charAt(i) == ':' && input.charAt(i+1) =='-') 
					{
						if(input.charAt(i + 2) == ')') {
							montant++;
							r=true;
			
						}else if(input.charAt(i+2)=='(')
						{
						montant--;
						r=true;
						}
					}
				if(montant > 0){
		            System.out.println("happy");
		        }else if(montant < 0){
		            System.out.println("sad");
		        }else if(montant==0 && r){
		            System.out.println("unsure");   
		        }else{
		            System.out.println("none");

			}

	}
	}
