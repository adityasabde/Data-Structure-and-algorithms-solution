package dsa;

import java.util.Scanner;

public class ReverseArray {

	public static void main(String[] args) {
		int a[] = new int[5];
		System.out.println("Enter 5 elements");
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<5;i++) {
			a[i]  = sc.nextInt();
		}
		String s = "I love my India";
		int temp=0;
//		
		System.out.println("reverse array");
		for(int i=0;i<a.length/2;i++) {
			temp = a[i];
			a[i] = a[a.length-1-i];
//			System.out.println(a[i]);
			a[a.length-1-i] = temp;
		}
		for(int i=0 ;i<a.length;i++) {
			System.out.println(a[i]);
		}
		
		
		System.out.println("reverse string");  
		String s1 = "";
		for(int j=s.length()-1 ;j>=0;j--) {
			s1 = s1 + s.charAt(j);
		}
		
		System.out.println(s1);

	}

}
