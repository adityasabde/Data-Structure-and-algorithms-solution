//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0)
        {
            int n = sc.nextInt();
            String arr[] = new String[n];
            for(int i = 0;i<n;i++)
                arr[i] = sc.next();
            
            Solution ob = new Solution();
            
            System.out.println(ob.secFrequent(arr, n));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
    String secFrequent(String arr[], int n)
    {
        HashMap<String , Integer> map = new HashMap<>();
        for(int i =0 ;i<n;i++){
            map.put(arr[i] , map.getOrDefault(arr[i],0)+1);
        }
        int max = Integer.MIN_VALUE ;
        String str = "";
        for(Map.Entry<String , Integer> entry : map.entrySet()){
            if(max < entry.getValue()){
                max = entry.getValue();
                str = entry.getKey();
            }
        }
        
        map.remove(str);
        
        int max1 = Integer.MIN_VALUE ;
        String str1 = "";
        for(Map.Entry<String , Integer> entry : map.entrySet()){
            if(max1 < entry.getValue()){
                max1 = entry.getValue();
                str1 = entry.getKey();
            }
        }
        return str1;
        
    }
}