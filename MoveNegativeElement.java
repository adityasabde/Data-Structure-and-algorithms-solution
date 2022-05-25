package dsa;

import java.util.Scanner;

public class MoveNegativeElement {

	public static void main(String[] args) {
        int a[] = new int[10];
        int arr[] = new int[10];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the 10 Elements");
		for(int i=0;i<10;i++) {
			a[i]  = sc.nextInt();
		}
		
		int j =0;
		for(int i=0;i<10;i++) {
			if(a[i]<0) {
				arr[j++] = a[i];
			}
		}
		for(int i=0;i<10;i++)  {
			if(a[i]>0) {
				arr[j++] = a[i];
			}
		}
		
		for(int i =0 ;i<10;i++) {
			a[i]= arr[i];
		}
		
		System.out.println("negative number are come first");
		
		for(int i =0 ;i<10;i++) {
			System.out.println(a[i]);
		}

	}

}
