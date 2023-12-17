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
            int ans = ob.nthPoint(n);
            System.out.println(ans);            
        }
    }
}

// } Driver Code Ends

//User function Template for Java
class Solution
{
    public int nthPoint(int n)
    {
        if(n==1){
            return 1;
        }
       
       long mod = 1000000007;
        
       long dp[] = new long[n+1];
       dp[0] = 0;
       dp[1] = 1;
       dp[2] = 2;
       
       for(int i = 3; i<=n; i++){
           dp[i] = (dp[i-1] + dp[i-2]) % mod;
       }
       
       return (int)dp[n];
    }
}