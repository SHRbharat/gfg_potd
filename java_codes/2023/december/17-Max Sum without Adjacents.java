//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String[] inputLine;
            int n = Integer.parseInt(br.readLine().trim());
            int[] arr = new int[n];
            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }

            int ans = new Solution().findMaxSum(arr, n);
            System.out.println(ans);
        }
    }
}
// } Driver Code Ends

//User function Template for Java
class Solution {
    int findMaxSum(int arr[], int n) {
        if(n == 1){
            return arr[0];
        }
        
        int dp[] = new int[n];
        dp[0] = arr[0];
        dp[1] = Math.max(arr[0], arr[1]);
        
        for(int i = 2; i<n; i++){
            dp[i] = Math.max(dp[i-1], arr[i] + dp[i-2]);
        }
        
        return dp[n-1];
    }
}