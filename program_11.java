
// microsoft , amazone;
// find third largest element

package csacademy;

import java.util.Scanner;

public class program_11 {

	public static void main(String[] args) {
		System.out.println("enter the size");
		try (Scanner scan = new Scanner (System.in)) {
			int n= scan.nextInt();
			  int []arr = new int [n];
			  
			   System.out.println("elements dalo");
			  for(int i=0;i<n;i++) {
				  arr[i]=scan.nextInt();
			  }
			  
			  // processs
			  int k=0;
			  
			  for(int i=0;i<n;i++) {
				  for(int j=i+1;j<n;j++) {
					  if(arr[i]==arr[j]) {
						  continue;
					  }
					  else {
						  if(arr[i]<arr[j]) {
							  k=arr[i];
							  arr[i]=arr[j];
							  arr[j]=k;
						  }
					  }
				  }
				  
			  }
			  /*
			  System.out.println(" ye raha aapka output");
			  for(int i=0;i<n;i++) {
				System.out.println(arr[i]);
			}*/
			  
			  System.out.println("the third largest elemnt is ="+ arr[2]);
		}

	}

}
