  // google , microsoft
// find the palidrome number.
package csacademy;

import java.util.Scanner;

public class program_12 {

	public static void main(String[] args) {
		System.out.println("enter the number ");
		try (Scanner sc = new Scanner (System.in)) {
			int n=sc.nextInt();
			int rem;
			int rev =0;
			int num = n;
			while(n!=0) {

				rem = n % 10  ;
				rev = rev*10 + rem;	
				n = n/10;
				
			}
			
			if(num == rev) {
				System.out.println(" yse this is palidrome number");
			}
			else {
				System.out.println(" no , this is not a palidrom number");
			}
		}
		
		

	}

}
