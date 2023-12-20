## GFG Problem Of The Day

### Date - 20 December, 2023
### Ques - [Modified Game Of Nim](https://www.geeksforgeeks.org/problems/variation-in-nim-game4317/1)
![](https://badgen.net/badge/Level/Medium/yellow)

You are given an array A of n elements. There are two players player 1 and player 2.
A player can choose any of element from an array and remove it. If the bitwise XOR of all remaining elements equals 0 after removal of the selected element, then that player loses. Find out the winner if player 1 starts the game and they both play their best. 

### Approach Used
Classify the elements as either occurring odd number of times or even number of times.If it occurs even number of times, we can ignore it in our calculation as both players pick it equal number of times.

- If there are odd number of odd count elements => Player 1 will lose
- If there are even number of odd count elements => Player 1 will win

**How to get number of elements that occur odd number of times?**
- We don't need the number, we just need to know if there are odd or even such numbers.
    - odd + even = odd
    - even + even = even

- We know that the even counting elements always occur even times in the array. So, the total number of elements (n) and the number of odd-count elements - must both be odd or both be even.

- Thus, to find if there are odd/even number of odd-count elements: just use n directly.
    - if n is odd -> Player 2 wins
    - if n is even -> Player 1 wins

**Edge case:** 
- If the xor value is already 0, Player 1 wins irrespective of remaining elements. Check for that first.

### Example :  n = 3, A = [3, 3, 2]
### Output : 2

## Explanation:
- Optimal removal of values are 3, 2, 3 sequentially. Then the array is empty. So player 2 wins.

### Time and Auxiliary Space Complexity

- **Time Complexity            :**  `O(n)`
- **Auxiliary Space Complexity :**  `O(1)` 

### Code (C++)
```cpp
class Solution{
public:
    int findWinner(int n, int A[]){
        int xorr = 0;
        
        for(int i = 0; i<n; i++)
            xorr ^= A[i];
        
        //Edge Case: if xor of all element is already 0, then player 1 wins
        if(xorr == 0)
            return 1;
        else
            return (n%2) + 1;
    }
};
```
### Contribution and Support

If you have a better solution or any queries / discussions , please visit our [discussion section](https://github.com/SHRbharat/gfg_potd/discussions).

If you find this solution helpful, consider supporting us by giving a `⭐ star` to the [SHRbharat/gfg_potd](https://github.com/SHRbharat/gfg_potd) repository.

![Total number of repository visitors](https://komarev.com/ghpvc/?username=SHRbharat&color=blueviolet&&label=Visitors)

[![Total number of repository stars](https://img.shields.io/github/stars/SHRbharat/gfg_potd.svg)](https://github.com/SHRbharat/gfg_potd/stargazers)             