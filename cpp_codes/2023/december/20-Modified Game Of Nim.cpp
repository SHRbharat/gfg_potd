//{ Driver Code Starts
// Initial Template for C++

#include <bits/stdc++.h>
using namespace std;

// } Driver Code Ends
// User function Template for C++

class Solution{
public:
    int findWinner(int n, int A[]){
        int xorr = 0;
        
        for(int i = 0; i<n; i++)
            xorr ^= A[i];
        
        //Edge Case: if xor of all element is already 0, then player 1 wins
        if(xorr == 0)
            return 1;
        else
            return (n%2) + 1;
    }
};

//{ Driver Code Starts.

int main(){
    int t;
    cin>>t;
    while(t--){
        int n;
        cin>>n;
        int A[n];
        for(int i = 0;i < n;i++)
            cin>>A[i];
        
        Solution ob;
        cout<<ob.findWinner(n, A)<<"\n";
    }
    return 0;
}
// } Driver Code Ends