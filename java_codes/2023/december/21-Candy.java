//{ Driver Code Starts
// Initial Template for Java

import java.util.*;
import java.lang.*;
import java.math.*;
import java.io.*;

class GFG {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int n = sc.nextInt();
            int a[] = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            Solution obj = new Solution();
            int ans = obj.minCandy(n, a);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends

// User function Template for Java
class Solution {
    static int minCandy(int N, int ratings[]) {
        int candy[] = new int[N];
        Arrays.fill(candy , 1);
        
        //left to right
        for(int i = 1 ; i < N ; i++){
            if(ratings[i] > ratings[i-1]){
                candy[i] = candy[i-1] + 1;
            }
        }
        
        //right to left
        for(int i = N-2 ; i >= 0 ; i--){
            if(ratings[i] > ratings[i+1]){
                candy[i] = Math.max(candy[i+1] + 1 , candy[i]);
            }
        }
        
        int count = 0;
        for(int i = 0 ; i < N ; i++){
            count += candy[i];
        }
        return count;
    }
}
