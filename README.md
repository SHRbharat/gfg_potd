## GFG Problem Of The Day

### Date - 19 December, 2023
### Ques - [Righmost Different Bit](https://www.geeksforgeeks.org/problems/rightmost-different-bit-1587115621/1)
![](https://badgen.net/badge/Level/Medium/yellow)

Given two numbers M and N. The task is to find the position of the rightmost different bit in the binary representation of numbers. If both M and N are the same then return -1 in this case.

### Approach Used
The aims is to find the position of the rightmost different bit in the binary representation of two integers, M and N. If both M and N are the same, the function returns -1.

1. **Check if M and N are equal:**
    - If M is equal to N, it means that the binary representations of both numbers are the same, and there is no different bit. In this case, the function returns -1.
    
2. **Iterate through the bits of M and N:**
    - Use a loop to iterate through the bits of M and N. It does so by repeatedly dividing M and N by 2 until any one becomes zero. Inside the loop, it checks whether the rightmost bits of M and N are equal. 
    - If they are equal, it means that the rightmost bit is not different, so both M and N are right-shifted by dividing them by 2 and update the counter by one.
    - If the rightmost bits are different, it means the first different bit has been found, and the position of this bit / value of counter is returned.

3. **Return the position:**
    - The loop terminates when smaller number becomes smaller then zero, in this case the position of the next bit is returned because the smaller number doesn't have any other bits to compare with the larger number bits. 

### Example :  M = 52 , N = 4
### Output : 5

## Explanation:
- Binary representation of the given numbers are: 110100(52) and 0100(4), 5th-bit from right is different because N doesn't have any other bits to compare.

Thus, the final output is 5.

### Time and Auxiliary Space Complexity

- **Time Complexity            :**  `O(log(max(M, N)))`
- **Auxiliary Space Complexity :**  `O(1)` 

### Code (C++)
```cpp
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
```
### Contribution and Support

If you have a better solution or any queries / discussions , please visit our [discussion section](https://github.com/SHRbharat/gfg_potd/discussions).

If you find this solution helpful, consider supporting us by giving a `⭐ star` to the [SHRbharat/gfg_potd](https://github.com/SHRbharat/gfg_potd) repository.

![Total number of repository visitors](https://komarev.com/ghpvc/?username=SHRbharat&color=blueviolet&&label=Visitors)

[![Total number of repository stars](https://img.shields.io/github/stars/SHRbharat/gfg_potd.svg)](https://github.com/SHRbharat/gfg_potd/stargazers)             