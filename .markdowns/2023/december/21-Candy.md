## GFG Problem Of The Day

### Date - 21 December, 2023
### Ques - [Candy](https://www.geeksforgeeks.org/problems/candy/1)
![](https://badgen.net/badge/Level/Medium/yellow)

There are N children standing in a line. Each child is assigned a rating value given in the integer array ratings.You are giving candies to these children subjected to the following requirements:
- Each child must have atleast one candy.
- Children with a higher rating than its neighbors get more candies than their neighbors.

Return the minimum number of candies you need to have to distribute. 

### Approach Used
**Initialization:** Check if the number of kids N is zero. If true, return 0 candies.

**Candies Array:** Initialize an array candies to store the number of candies each kid receives. Initially, set each kid's candies to 1.

**Traverse Left to Right:** Traverse the ratings array from left to right. If the current kid's rating is higher than the previous one, update the candies accordingly.

**Traverse Right to Left:** Traverse the ratings array from right to left. If the current kid's rating is higher than the next one, update the candies, taking the maximum of the current value and the updated value.

**Total Candies:** Calculate the total number of candies needed by summing up the values in the candies array.

**Return:** Return the total number of candies.

### Time and Auxiliary Space Complexity

- **Time Complexity            :**  `O(N)` 
- **Auxiliary Space Complexity :**  `O(N)`, because of array to store number of candies

### Code (C++)
```cpp
class Solution {
    public:
    int minCandy(int N, vector<int> &ratings) {
        vector<int> v(N,1);
        for(int i=1;i<N;i++)
        {
            if(ratings[i]>ratings[i-1])
            v[i]=v[i-1]+1;
        }
        
        for(int i=N-2;i>=0;i--)
        {
            if(ratings[i]>ratings[i+1])
            v[i]=max(v[i],v[i+1]+1);
        }
        
        int sum=0;
        for(int i=0;i<N;i++)
        sum+=v[i];
        
        return sum;
    }
};
```
### Contribution and Support

If you have a better solution or any queries / discussions , please visit our [discussion section](https://github.com/SHRbharat/gfg_potd/discussions).

If you find this solution helpful, consider supporting us by giving a `⭐ star` to the [SHRbharat/gfg_potd](https://github.com/SHRbharat/gfg_potd) repository.

![Total number of repository visitors](https://komarev.com/ghpvc/?username=SHRbharat&color=blueviolet&&label=Visitors)

[![Total number of repository stars](https://img.shields.io/github/stars/SHRbharat/gfg_potd.svg)](https://github.com/SHRbharat/gfg_potd/stargazers)             