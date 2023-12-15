// There are N points on the road, you can step ahead by 1 or 2 .
//  If you start from a point 0, and can only move from point i to point i+1 
//  after taking a step of length one, find the number of ways you can reach at point N. 

//{ Driver Code Starts
#include<bits/stdc++.h>
using namespace std;

// } Driver Code Ends
class Solution{
	public:
		int nthPoint(int n){
		    // Code here
		    int mod = 1000000007;
		    if (n == 1) {
                return 1;
            }

            vector<int> dp(n, 0);
            dp[0] = 1;
            dp[1] = 2;

            for (int i = 2; i < n; ++i) {
                dp[i] = (dp[i - 1] + dp[i - 2]) % mod;
            }

            return dp[n-1];
		}
};

//{ Driver Code Starts.
int main(){
	int tc;
	cin >> tc;
	while(tc--){
		int n;
		cin >> n;
		Solution ob;
		int ans  = ob.nthPoint(n);
		cout << ans <<"\n";
	}
	return 0;
}
// } Driver Code Ends