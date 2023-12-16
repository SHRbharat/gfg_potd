## GFG Problem Of The Day

### Date - 17 December, 2023
### Ques  - [Max Sum without Adjacents](https://www.geeksforgeeks.org/problems/max-sum-without-adjacents2430/1)
![](https://badgen.net/badge/Level/Easy/green)

Given an array Arr of size N containing positive integers. Find the maximum sum of a any possible subsequence such that no two numbers in the subsequence should be adjacent in Arr.

### Approach Used
We have used dynamic programming to compute and store the maximum sum of a subsequence, ensuring that no two numbers in the subsequence are adjacent. The dynamic programming array `dp` is filled iteratively, considering the choice of including or excluding each element in the calculation of the maximum sum.

### Example:  Let's take ` n = 6 ` and `arr = {5,5,10,100,10,5}`
- Initialization:
    - `dp[0] = 5` (maximum sum ending at index 0)
    - `dp[1] = max(5, 5) = 5` (maximum sum ending at index 1)

- Iteration (i = 2):
    - `dp[2] = max(dp[1], dp[0] + Arr[2]) = max(5, 5 + 10) = 15`

- Iteration (i = 3):
    - `dp[3] = max(dp[2], dp[1] + Arr[3]) = max(15, 5 + 100) = 105`

- Iteration (i = 4):
    - `dp[4] = max(dp[3], dp[2] + Arr[4]) = max(105, 15 + 10) = 105`

- Iteration (i = 5):
    - `dp[5] = max(dp[4], dp[3] + Arr[5]) = max(105, 105 + 5) = 110`

### Time and Auxiliary Space Complexity

- **Time Complexity            :**  `O(N)` , where N in the size of array
- **Auxiliary Space Complexity :**  `O(n)` , where n is size of dp array 

### Code (C++)
```cpp
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
```
### Contribution and Support

If you have a better solution or any queries / discussions , please visit our [discussion section](https://github.com/SHRbharat/gfg_potd/discussions).

If you find this solution helpful, consider supporting us by giving a `⭐ star` to the [SHRbharat/gfg_potd](https://github.com/SHRbharat/gfg_potd) repository.

![Total number of repository visitors](https://komarev.com/ghpvc/?username=SHRbharat&color=blueviolet&&label=Visitors)

[![Total number of repository stars](https://img.shields.io/github/stars/SHRbharat/gfg_potd.svg)](https://github.com/SHRbharat/gfg_potd/stargazers)             