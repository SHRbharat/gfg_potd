## GFG Problem Of The Day

### Date - 15 December, 2023
### Ques  - [Reach the Nth point](https://www.geeksforgeeks.org/problems/reach-the-nth-point5433/1)
![](https://badgen.net/badge/Level/Easy/green)


There are N points on the road, you can step ahead by 1 or 2 . If you start from a point 0, and can only move from point i to point i+1 after taking a step of length one, find the number of ways you can reach at point N. 

### Approach Used
The problem can be approached using dynamic programming.

- we can clearly observe that the the number of ways to obtain sum `n` is nothing but just the sum of ways to obtain `n-1`and `n-2`.

- For example :
    - n = 1 ; ways = 1  {base case}
    - n = 2 ; ways = 2  {base case}
    - n = 3 ; ways = 2 + 1 = 3
    - n = 4 ; ways = 3 + 2 = 5
    - n = 5 ; ways = 5 + 3 = 8


### Time and Auxiliary Space Complexity

- **Time Complexity            :**  `O(N)`, where N is the no. of size of dp vector (no of times the loop executes)
- **Auxiliary Space Complexity :**  `O(n)` , where n is the size of dp vector

### Code (C++)
```cpp
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
```
### Contribution and Support

If you have a better solution or any queries / discussions , please visit our [discussion section](https://github.com/SHRbharat/gfg_potd/discussions).

If you find this solution helpful, consider supporting us by giving a `⭐ star` to the [SHRbharat/gfg_potd](https://github.com/SHRbharat/gfg_potd) repository.

![Total number of repository visitors](https://komarev.com/ghpvc/?username=SHRbharat&color=blueviolet&&label=Visitors)

[![Total number of repository stars](https://img.shields.io/github/stars/SHRbharat/gfg_potd.svg)](https://github.com/SHRbharat/gfg_potd/stargazers)