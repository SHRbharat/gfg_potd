//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*; 

class GFG{
    public static void main(String args[]) throws IOException { 
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
  
        
        int t = Integer.parseInt(br.readLine().trim()); 

        while(t > 0){
        	long n = Integer.parseInt(br.readLine().trim()); 
            Solution ob = new Solution();
            System.out.println(ob.countStr(n)); 
            t--;
        }
    } 
} 
// } Driver Code Ends

//User function Template for Java
class Solution 
{ 
    static long countStr(long n)
	{
	    // 1. for all a's -> n!/n! -> 1
	    // 2. for 1 b and (n-1) a's -> n!/(n-1)! -> n
	    // 3. for 1 c and (n-1) a's -> n!/(n-1)! -> n
	    // 4. for 1 b, 1 c, and (n-2) a's -> n!/(n-2)! -> n(n-1)
	    // 5. for 2 c's and (n-2) a's ->  n!/((n-2)! * 2!) -> n(n-1)/2
	    // 6. for 1 b, 2 c's and (n-3) a's -> n!/((n-1)! * 2! * 1!) -> n(n-1)(n-2)/2
	    
	    // On combining all, we get (1+2n) + n(n-1)(n+1)/2;
	    
	    return (1 + 2*n) + n*(n - 1)*(n + 1)/2;
	}
} 