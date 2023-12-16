//{ Driver Code Starts
#include <bits/stdc++.h>

using namespace std;


// } Driver Code Ends
//User function template for C++
class Solution{
public:	
	// calculate the maximum sum with out adjacent
	int findMaxSum(int *arr, int n) {
	    // code here
	    if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return arr[0];
        }

        // Initialize an array to store the maximum sum up to each index
        int dp[n];

        // Base cases
        dp[0] = arr[0];
        dp[1] = max(arr[0], arr[1]);

        // Fill the dp array using the recurrence relation
        for (int i = 2; i < n; i++) {
            dp[i] = max(dp[i - 1], dp[i - 2] + arr[i]);
        }

        // Return the maximum sum
        return dp[n - 1];
	}
};

//{ Driver Code Starts.

int main() {
    int t;
    cin >> t;
    while (t--) {
        int n;
        cin >> n;
        int arr[n];
        for (int i = 0; i < n; i++) {
            cin >> arr[i];
        }
        Solution ob;
        auto ans = ob.findMaxSum(arr, n);
        cout << ans << "\n";
    }
    return 0;
}
// } Driver Code Ends