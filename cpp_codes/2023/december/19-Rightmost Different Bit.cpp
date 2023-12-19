//{ Driver Code Starts
//Initial Template for C++

#include <bits/stdc++.h>
using namespace std;

// } Driver Code Ends
//User function Template for C++

class Solution
{
    public:
    //Function to find the first position with different bits.
    int posOfRightMostDiffBit(int m, int n)
    {
        if(m == n){
            return -1;
        }
        
        int i = 1;
        while(m >= 0 && n >= 0){
            if(m % 2 == n % 2){
                m /= 2;
                n /= 2;
            }else{
                return i;
            }
            
            i++;
        }
        
        return i;
    }
};

//{ Driver Code Starts.
// Driver Code
int main()
{   
    int t;
    cin>>t; //input number of testcases
    while(t--)
    {
         int m,n;
         cin>>m>>n; //input m and n
         Solution ob;
         cout << ob.posOfRightMostDiffBit(m, n)<<endl;
    }
    return 0;     
} 
// } Driver Code Ends