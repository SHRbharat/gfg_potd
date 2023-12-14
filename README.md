## GFG Problem Of The Day

### Today - 14 December, 2023
### Ques  - [Painting the Fence](https://www.geeksforgeeks.org/problems/painting-the-fence3727/1)
![](https://badgen.net/badge/Level/Medium/yellow)


Given a fence with n posts and k colors, find out the number of ways of painting the fence so that not more than two consecutive posts have the same colors. Since the answer can be large return it modulo 109 + 7.

### My Approach
The problem can be approached using combinations and permutations.

Consider the two scenarios:

- 1.The last two posts have the same color:
        In this case, you have `k` choices for the color of the last post, and the color of the second-to-last post is fixed. Therefore, there are `k` ways to paint the fence in this scenario.

- 2.The last two posts have different colors:
        In this case, you have `(k-1)` choices for the color of the last post (to avoid having three consecutive posts with the same color), and the color of the second-to-last post can be any of the `k` colors. Therefore, there are `(k-1) * k` ways to paint the fence in this scenario.

Now, you can combine these two scenarios:

The total number of ways to paint the fence without more than two consecutive posts having the same color is the sum of the ways in the above two scenarios.
Using the permutation and combination concept, this can be expressed as follows:

`Total Ways = Ways with Same Color + Ways with Different Colors`
`Total Ways = k + (k−1)*k`

### Explain with example
 Let's dry run the code for the input n = 3 and k = 2.

1. Initialize variables:
- `sameColor = 2` (number of ways to paint the first post with the same color)
- `differentColor = 2` (number of ways to paint the first post with a different color)

2. Iterate from i = 3 to n (3 in this case):
- For i = 3:
        > Save `differentColor` in a temporary variable (`temp = 2`)
        > Update `differentColor` to be the sum of the  previous        `sameColor` and `differentColor`, multiplied by `k - 1`:
            `differentColor = (2+2)*(2-1) = 4`
        > Update `sameColor` to be the previous `differentColor`:
            `sameColor = temp = 2`
3. After the loop, calculate the total number of ways:
    `totalWays = sameColor + differentColor = 2 + 4 = 6`

### Time and Auxiliary Space Complexity

- **Time Complexity            :**  `O(N)`, where N is the no. of posts
- **Auxiliary Space Complexity :**  `O(1)`

### Code (C++)
```cpp
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
```
### Contribution and Support

I always encourage contributors to participate in the discussion forum for this repository.

If you have a better solution or any queries / discussions related to the `Problem of the Day` solution, please visit our [discussion section](https://github.com/SHRbharat/gfg_potd/discussions). We welcome your input and aim to foster a collaborative learning environment.

If you find this solution helpful, consider supporting us by giving a `⭐ star` to the [SHRbharat/gfg_potd](https://github.com/SHRbharat/gfg_potd) repository.

![Total number of repository visitors](https://komarev.com/ghpvc/?username=gl01potdgfg&color=blue&&label=Visitors)
![](https://hit.yhype.me/github/profile?user_id=79409258)

[![Total number of repository stars](https://img.shields.io/github/stars/SHRbharat/gfg_potd.svg)](https://github.com/SHRbharat/gfg_potd/stargazers)

![GitHub views](https://img.shields.io/github/views/SHRbharat/gfg_potd.svg?style=flat)

