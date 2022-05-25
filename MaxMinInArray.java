package dsa;

import java.util.Arrays;
import java.util.Scanner;

public class MaxMinInArray {

	public static void main(String[] args) {
		int a[] = new int[10];
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the 10 Elements");
		for(int i=0;i<10;i++) {
			a[i]  = sc.nextInt();
		}
		
		Arrays.sort(a);
		System.out.println("Smallest element in array :- "+a[0]);
		System.out.println("largest element in array :- "+a[9]);

	}

}
