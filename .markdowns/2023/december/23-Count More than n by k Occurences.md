## GFG Problem Of The Day

### Date - 23 December, 2023
### Ques - [Count More than n/k Occurences](https://www.geeksforgeeks.org/problems/count-element-occurences/1)
![](https://badgen.net/badge/Level/Medium/yellow)

Given an array arr of size N and an element k. The task is to find the count of elements in the array that appear more than n/k times. 

### Approach Used :
    - First create a `map` to store the number of occurences of all the elements in the given array.
    - Then, traverse over the whole array and store the occurrences of all the elements in the map.
    - Then, traverse over the elements in the map and check
    - if the element has the number of occurences greater than n/k, then increase the count the count by 1.
    - At the end return the value of count.

### Example :  N = 8, arr = [3,1,2,2,1,2,3,3], k = 4
### Output : 2

## Explanation:
- In the given array, 3 and 2 are the only elements that appears more than `n/k = 2` times.

### Time and Auxiliary Space Complexity

- **Time Complexity            :**  `O(N)`
- **Auxiliary Space Complexity :**  `O(N)`, used to store the occurences of numbers in the map

### Code (C++)
```cpp
class Solution
{
    public:
    //Function to find all elements in array that appear more than n/k times.
    int countOccurence(int arr[], int n, int k){
        int maxOccurence = n/k;
        
        unordered_map<int, int> map;
        for(int i = 0; i<n; i++){
            map[arr[i]]++;
        }
        
        int count = 0;
        for (auto x : map){
            if(x.second > maxOccurence){
                count++;
            }
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