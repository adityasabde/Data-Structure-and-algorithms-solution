package dsa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class IntersectionUnionSortedArray {

	public static void main(String[] args) {
		int a[] = {1,2,3,4,5};
		int b[] = {4,5,6,7,8};
		ArrayList arr1 = new ArrayList();
		ArrayList arr2 = new ArrayList();
		int n= a.length;
		int m = b.length;
		Arrays.sort(a);
		Arrays.sort(b);
		
		HashSet setA = new HashSet<Integer>();
	    
	    int maxLength = Math.max(n, m);
	    
	    for(int i=0;i<maxLength;i++) {
	     if(i < a.length)
	      setA.add(a[i]);
	     if(i < b.length) 
	      setA.add(b[i]);
	    }
	    
	    System.out.println(setA);
		
		
	}

}
