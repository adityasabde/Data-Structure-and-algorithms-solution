//Array only contains the 0,1,2 sort the array without sort algorithm

package dsa;

public class SortArrayWithoutSortAlgo {

	public static void main(String[] args) {
		 int a[] = {1,0,2,0,1};
		 int n = a.length;
		 int arr[] = new int[n];
	       int c0 =0 ;
	       int c1= 0;
	       int c2 = 0;
	       int i=0;
	       while(i<n){
	           if(a[i]==0){
	               c0++;
	           }if(a[i]==1){
	               c1++;
	           }if(a[i]==2){
	               c2++;
	           }
	           i++;
	       }
	       
	       for(int j=0;j<n;j++){
	           if(c0 != 0){
	               arr[j] = 0;
	               c0--;
	               continue;
	           }if(c1!= 0){
	               arr[j]=1;
	               c1--;
	               continue;
	           }
	           if(c2!= 0){
	               arr[j]=2;
	               c2--;
	               continue;
	           }
	       }
	       
	       for(int k=0;k<n;k++){
	           a[k] = arr[k];
	       }
	       
	      System.out.println("Sorted array");
	       for(int l=0 ;l<n;l++) {
	    	   System.out.println(a[l]);
	       }

	}

}
