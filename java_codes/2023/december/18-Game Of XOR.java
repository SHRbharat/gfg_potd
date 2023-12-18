//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int N = Integer.parseInt(read.readLine());
            
            String S[] = read.readLine().split(" ");
            int[] A = new int[N];
            
            for(int i=0 ; i<N ; i++)
                A[i] = Integer.parseInt(S[i]);

            Solution ob = new Solution();
            System.out.println(ob.gameOfXor(N,A));
        }
    }
}
// } Driver Code Ends

//User function Template for Java
class Solution {
    static int gameOfXor(int N , int[] A) {
        //if size of the array is even, then all the elements occur even times in all subarrays
        //Hence, their xor gives 0
        if(N % 2 == 0){
            return 0;
        }
        
        //if size of the array is odd, then elements at odd index occurs odd times,
        //elements at even indices occurs even times therefore, only taking xor of
        //elements at odd indices
        int ans = 0;
        for(int i = 0; i<N; i+=2){
            ans ^= A[i];
        }
        
        return ans;
    }
};