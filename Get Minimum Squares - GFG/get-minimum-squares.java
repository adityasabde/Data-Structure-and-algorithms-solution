//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            int n = Integer.parseInt(br.readLine().trim());
            Solution ob = new Solution();
            int ans = ob.MinSquares(n);
            System.out.println(ans);           
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution
{
    public int MinSquares(int n)
    {
        int dp[] = new int[n+1];
        Arrays.fill(dp , -1);
        int x = solvemem(n , dp);
        return x;
        
    }
    
    public int solve(int n){
        //  base case
        if(n== 0){
            return 0 ;
        }
        int ans = n;
        for(int i = 1 ;i*i <= n;i++){
            ans = Math.min(ans , 1+ solve(n - i*i)); 
        }
        
        return ans;
    }
    
    public int solvemem(int n , int dp[]){
        //  base case
        if(n== 0){
            return 0 ;
        }
        
        if(dp[n] != -1){
            return dp[n];
        }
        int ans = n;
        for(int i = 1 ;i*i <= n;i++){
            ans = Math.min(ans , 1+ solvemem(n - i*i , dp)); 
        }
        dp[n] = ans;
        
        return dp[n];
    }
    
    
}