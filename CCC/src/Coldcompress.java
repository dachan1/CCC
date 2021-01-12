import java.util.Scanner;

/*
* Author : danielchan
*Date : Jan. 8, 2021
*/
public class Coldcompress
	{

		public static void main(String [] args) {
		        Scanner in = new Scanner(System.in);
		        int n = in.nextInt(); in.nextLine();
		        for (int k=1; k<=n; k++) {
		            String symbol = in.nextLine();
		            for(int i=0, j=0; i<symbol.length(); ) {
		                while(j < symbol.length() && symbol.charAt(i) == symbol.charAt(j)) {
		                    j++;
		                }
		                System.out.print((j-i) + " " + symbol.charAt(i) + " ");
		                i = j;
		            }
		            System.out.println();
		        }
		    }
	}
