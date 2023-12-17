## GFG Problem Of The Day

### Date - 18 December, 2023
### Ques  - [Game of XOR](https://www.geeksforgeeks.org/problems/game-of-xor1541/1)
![](https://badgen.net/badge/Level/Medium/yellow)

Given an array A of size N. The value of an array is denoted by the bit-wise XOR of all elements it contains. Find the bit-wise XOR of the values of all subarrays of A.

### Approach Used
The key observation is that if the frequency of an element in all possible subarrays is even, then XORing it with 0 (even number of times) results in 0. If the frequency is odd, XORing it with the element itself (odd number of times) preserves the element's value.

1. **Initialize Result:**
   - Initialize a variable `result` to store the final bitwise XOR of all subarrays. Start it with 0.

2. **Iterate Over Array:**
   - Use a loop to iterate through each element of the array `A` from index 0 to `N-1`.

3. **Calculate Frequency:**
   - For each element at index `i`, calculate its frequency in all possible subarrays. The frequency is determined by `(i + 1) * (N - i)`, representing the number of subarrays in which the element at index `i` appears.

4. **XOR Operation:**
   - If the frequency is even, XOR with 0. This is because XORing an even number of times with the same value results in 0.
   - If the frequency is odd, XOR with the element at index `i`.

5. **Repeat for All Elements:**
   - Repeat steps 3-4 for all elements in the array.

6. **Return Result:**
   - After processing all elements, the `result` variable contains the bitwise XOR of all subarrays. Return this result.

### Example :  N = 3 ,A = [1, 2, 3]

1. **Initialize Result:**
   - Initialize a variable `result` to 0.

2. **Iterate Over Array:**
   - For index 0:
     - Calculate frequency = (0 + 1) * (3 - 0) = 3 (odd)
     - XOR result ^= 1 (element at index 0)

   - For index 1:
     - Calculate frequency = (1 + 1) * (3 - 1) = 4 (even)
     - XOR result ^= 0 (XOR with 0)

   - For index 2:
     - Calculate frequency = (2 + 1) * (3 - 2) = 3 (odd)
     - XOR result ^= 3 (element at index 2)

3. **Final Result:**
   - `result` = 1 ^ 0 ^ 3 = 2

## Explanation:

- For index 0, the element 1 appears in 3 subarrays. XOR with 1 (odd frequency) results in 1.
- For index 1, the element 2 appears in 4 subarrays. XOR with 0 (even frequency) results in 2.
- For index 2, the element 3 appears in 3 subarrays. XOR with 3 (odd frequency) results in 0.

Thus, the final bitwise XOR of all subarrays is 2.

### Time and Auxiliary Space Complexity

- **Time Complexity            :**  `O(N)` , where N in the size of array
- **Auxiliary Space Complexity :**  `O(1)` 

### Code (C++)
```cpp
class Solution {
  public:
    int gameOfXor(int N , int A[]) {
        int result = 0;

        for (int i = 0; i < N; ++i) {
            int freq = (i + 1) * (N - i);
        
            // If frequency is even, XOR is 0.
            if (freq % 2 == 0) {
                result ^= 0;
            } 
            // If frequency is odd, XOR with the element.
            else {
                result ^= A[i];
            }
        }

        return result;
    }
};
```
### Contribution and Support

If you have a better solution or any queries / discussions , please visit our [discussion section](https://github.com/SHRbharat/gfg_potd/discussions).

If you find this solution helpful, consider supporting us by giving a `⭐ star` to the [SHRbharat/gfg_potd](https://github.com/SHRbharat/gfg_potd) repository.

![Total number of repository visitors](https://komarev.com/ghpvc/?username=SHRbharat&color=blueviolet&&label=Visitors)

[![Total number of repository stars](https://img.shields.io/github/stars/SHRbharat/gfg_potd.svg)](https://github.com/SHRbharat/gfg_potd/stargazers)             