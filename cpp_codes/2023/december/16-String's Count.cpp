//{ Driver Code Starts
#include <bits/stdc++.h>
using namespace std;
long long int countStr(long long int n);

int main(){
    int t;
    cin >> t;
    while(t--){
        long long int n;
        cin >> n;
        cout << countStr(n) << endl;
    }
return 0;
}
// } Driver Code Ends

long long int countStr(long long int n){
    // 1. for all a's -> n!/n! -> 1
    // 2. for 1 b and (n-1) a's -> n!/(n-1)! -> n
    // 3. for 1 c and (n-1) a's -> n!/(n-1)! -> n
    // 4. for 1 b, 1 c, and (n-2) a's -> n!/(n-2)! -> n(n-1)
    // 5. for 2 c's and (n-2) a's ->  n!/((n-2)! * 2!) -> n(n-1)/2
    // 6. for 1 b, 2 c's and (n-3) a's -> n!/((n-3)! * 2! * 1!) -> n(n-1)(n-2)/2
    
    // on combining all we get (1+2n) + n(n-1)(n+1)/2;
    
    return (1 + 2*n) + n*(n - 1)*(n + 1)/2;
}
