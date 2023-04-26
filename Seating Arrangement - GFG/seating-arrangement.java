//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out=new PrintWriter(System.out);
        int test = Integer.parseInt(in.readLine().trim());
        while(test-- > 0){
            int n = Integer.parseInt(in.readLine().trim());
            int m = Integer.parseInt(in.readLine().trim());
            String s[]=in.readLine().trim().split(" ");
            int [] seats = new int[m];
            for(int i = 0; i < m; i++){
                seats[i] = Integer.parseInt(s[i]);
            }
            Solution obj = new Solution();
            boolean res = obj.is_possible_to_get_seats(n, m, seats);
            
            String _result_val = (res) ? "Yes" : "No";
            out.println(_result_val);
        }
        out.close();
    }
}

// } Driver Code Ends


class Solution {
    public static boolean is_possible_to_get_seats(int n, int m, int[] seats) {
        HashSet<Integer>set = new HashSet();
        
        for(int i =0 ;i<m;i++){
            if(seats[i] == 1){
                set.add(i);
            }
        }
        int i = 0;
        
       while(n>0 && i<m){
           if(seats[i] == 0){
            //   System.out.println(i);
               if(i-1 <0 && !set.contains(i+1)){
                    n--;
                  set.add(i);
               }
               else if(i+1 == m && !set.contains(i-1)){
                    n--;
                  set.add(i);
               }
               else if(i+1 < m && !set.contains(i+1) && i-1 >=0 && !set.contains(i-1)){
                  n--;
                  set.add(i);
               }
            //   System.out.println(set);
           }
           i++;
       }
       
       if(n <= 0){
           return true;
       }
        return false;
    }
}
        
