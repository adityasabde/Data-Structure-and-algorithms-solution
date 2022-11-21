//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {   
            String S = read.readLine();
            Solution ob = new Solution();
            System.out.println(ob.minimumNumberOfSwaps(S));
        }
    }
}

// } Driver Code Ends


//User function Template for Java
class Solution{
    static int minimumNumberOfSwaps(String s){
        int open = 0;
        int close = 0;
        int unbalanced = 0;
        int swaps = 0;
        
        for(int i=0 ;i<s.length();i++){
            if(s.charAt(i) == '['){
                open++;
                if(unbalanced > 0){
                    swaps += unbalanced;
                    unbalanced--;
                }
            }
            else{
                close++;
                unbalanced = close - open;
            }
        }
        return swaps;
        
    }
}


