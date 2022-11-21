//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
	public static void main(String[] args) throws IOException
	{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while(t-->0)
        {
            String S = br.readLine().trim();
            Solution ob = new Solution();
            
            System.out.println(ob.minFlips(S));
                        
        }
	}
}


// } Driver Code Ends


//User function Template for Java


class Solution {
    public int minFlips(String s) {
        int x = 0;
        int y = 0;
        for(int i = 0 ; i<s.length();i++){
            if(i%2 == 0){
                if(s.charAt(i)!= '1'){
                     x++;
                }
               
            }
            else{
                if(s.charAt(i) != '0'){
                    x++;
                }
                
            }
        }
        // System.out.println(x);
        for(int i = 0 ; i<s.length();i++){
            if(i%2 == 0 && s.charAt(i)!= '0'){
                y++;
            }
            else if(i%2 !=0 && s.charAt(i) != '1'){
                y++;
            }
        }
        return Math.min(x,y);
    }
}