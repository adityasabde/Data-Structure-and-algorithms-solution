package csacademy;

import java.util.Scanner;

public class program_14 {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("enter the size");
			int n =sc.nextInt();
			System.out.println("enter the elements");
			int arr[] = new int[n];
			for(int i=0; i<n ;i++) {
				arr[i] =sc.nextInt();
			}
			System.out.println("enter the rotation number");
			int k=sc.nextInt();

			/*for(int i=0;i<k ;i++) {
				int num=arr[n-1];
				for(int j=n-2;j>=0 ;j--) {
					arr[j+1] = arr[j];
				}
				arr[0] =num;
			}
			*/
			
			
			// method 2
			
			for(int i=n-k ; i<n ; i++) {
				System.out.println(arr[i]);
			}
			for(int i=0; i<n-2 ;i++) {
				System.out.println(arr[i]);
			}
			
			
			
			
			
			
			
			
		/*	System.out.println("output");
			for(int i=0 ; i<n ;i++) {
				System.out.println(arr[i]);
			}
			*/
		}
		
	}

}
