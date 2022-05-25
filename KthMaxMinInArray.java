package dsa;

import java.util.Arrays;
import java.util.Scanner;

public class KthMaxMinInArray {

	public static void main(String[] args) {
        int a[] = new int[10];
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the 10 Elements");
		for(int i=0;i<10;i++) {
			a[i]  = sc.nextInt();
		}
		
		Arrays.sort(a);
		System.out.println("Enter the element which is at Kth position in asending order");
		int k = sc.nextInt();
		System.out.println("Smallest "+ k +"th element in array :- "+a[k-1]);
		System.out.println("largest "+k+"th element in array :- "+a[9-k+1]);


	}

}
