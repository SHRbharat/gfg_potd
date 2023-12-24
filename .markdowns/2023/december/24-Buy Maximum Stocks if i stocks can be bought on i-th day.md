## GFG Problem Of The Day

### Date - 24 December, 2023
### Ques - [Buy Maximum Stocks if i stocks can be bought on i-th day](https://www.geeksforgeeks.org/problems/buy-maximum-stocks-if-i-stocks-can-be-bought-on-i-th-day/1)
![](https://badgen.net/badge/Level/Medium/yellow)

In a stock market, there is a product with its infinite stocks. The stock prices are given for N days, where price[i] denotes the price of the stock on the ith day.
- There is a rule that a customer can buy at most i stock on the ith day.
- If the customer has an amount of k amount of money initially. The task is to find out the maximum number of stocks a customer can buy. 

### Approach Used :
    - Goal is to buy maximum number of stocks, so we buy stocks from the cheapest to more expensive, hence sorting is required but we have to keep the index in mind.

    - First form a list stock with (price, index). For this question, the index is also the maximum number of this stock we can buy at this price.

    - Sort the list by price.

    - We keep buying stock from the beginning of the list until we run out of money.

### Example :  N = 3, k = 45,  arr = [10, 7, 19]
### Output : 4

## Explanation:
- First create a list of stock with (price, index): [(10,1), (7,2), (19,3)].
- Then sort the list, it becomes :  [(7,2), (10,1), (19,3)]
- Now, keep buying the stock until we ran out of money, here with k = 45, we can buy: 7*2 + 10*1 + 19*1 = 43.
- Hence, total 4 stocks we can buy with k = 45;

### Time and Auxiliary Space Complexity

- **Time Complexity            :**  `O(NLogN)`, because of sorting the vector array
- **Auxiliary Space Complexity :**  `O(N)`, vector array size

### Code (C++)
```cpp
class Solution {
public:
    int buyMaximumProducts(int n, int k, int price[]) {
        vector<pair<int, int>> v;
        for (int i = 0; i < n; ++i)
            v.push_back({price[i], i + 1});

        sort(v.begin(), v.end());

        int count = 0;

        for (auto i : v) {
            int maxBuy = min(k / i.first, i.second);
            count += maxBuy;
            k -= i.first * maxBuy;
        }
        return count;
    }
};
```
### Contribution and Support

If you have a better solution or any queries / discussions , please visit our [discussion section](https://github.com/SHRbharat/gfg_potd/discussions).

If you find this solution helpful, consider supporting us by giving a `⭐ star` to the [SHRbharat/gfg_potd](https://github.com/SHRbharat/gfg_potd) repository.

![Total number of repository visitors](https://komarev.com/ghpvc/?username=SHRbharat&color=blueviolet&&label=Visitors)

[![Total number of repository stars](https://img.shields.io/github/stars/SHRbharat/gfg_potd.svg)](https://github.com/SHRbharat/gfg_potd/stargazers)             