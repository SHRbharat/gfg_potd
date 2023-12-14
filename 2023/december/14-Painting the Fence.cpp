
//{ Driver Code Starts
#include <bits/stdc++.h>
#include<stdio.h>
#include<math.h>
using namespace std;

// } Driver Code Ends
class Solution{
    public:
    long long countWays(int n, int k){
        // code here
        const int MOD = 1000000007;

        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return k;
        }

        long long sameColor = k;
        long long differentColor = (k - 1LL) * k % MOD;

        for (int i = 3; i <= n; ++i) {
            long long temp = differentColor;
            differentColor = (sameColor + differentColor) * (k - 1LL) % MOD;
            sameColor = temp;
        }

        long long totalWays = (sameColor + differentColor) % MOD;

        return totalWays;
    }
};

//{ Driver Code Starts.

int main()
{
	
	int t;
	cin>>t;
	while(t--)
	{
		int n,k;
		cin>>n>>k;
		Solution ob;
		cout<<ob.countWays(n,k)<<endl;
	}
	return 0;
}
// } Driver Code Ends