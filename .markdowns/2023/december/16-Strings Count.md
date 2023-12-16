## GFG Problem Of The Day

### Date - 16 December, 2023
### Ques  - [String's Count](https://www.geeksforgeeks.org/problems/count-of-strings-that-can-be-formed-using-a-b-and-c-under-given-constraints1135/1)
![](https://badgen.net/badge/Level/Easy/green)

Given a length n, count the number of strings of length n that can be made using a, b and c with at-most one b and two c allowed.

### Approach Used
The problem can be solved using dynamic approach or using permutation and combination but we have to solve the problem in constant Time complexity so, we are using the permutation approach.

- The number of permutations for ` n ` different things taken all at a time are ` n! `

- The number of permutations of n things taken all at a time, `p` are alike of one kind, `q` are alike of second kind and `r` are alike of third kind and the rest `n-(p+q+r)` are all different is `n! / (p! * q! * r!)` .

- Formula:
    - Permutation of string with all a's are ` n!/n! = 1 `
    - Permutation of string with one b and (n-1) a's are ` n!/(n-1)! = n `
    - Permutation of string with one c and (n-1) a's are ` n!/(n-1)! = n `
    - Permutation of string with one b, one c and (n-2) a's are ` n!/(n-2)! = n(n-1) `
    - Permutation of string with two c's and (n-2) a's are ` n!/((n-2)! * 2!) = n(n-1)/2 `
    - Permutation of string with one b, two c's and (n-3) a's are ` n!/((n-3)! * 2! * 1!) = n(n-1)(n-2)/2 `
    
    - Adding all of the above we get, ` (1+2n) + n(n-1)(n+1)/2 `

- Example:  Let's take ` n = 3 `
    - Permutation of string with 3 a's are ` 1 `, { aaa }
    - Permutation of string with 1 b and 2 a's are ` 3!/2! = 3 `, { aab, aba, baa }
    - Permutation of string with 1 c and 2 a's are ` 3!/2! = 3 `, { aac, aca, caa }
    - Permutation of string with 1 a, 1 b and 1 c are ` 3! = 6 `, { abc, acb, bac, bca, cab, cba }
    - Permutation of string with 2 c's and 1 a are ` 3!/(1! * 2!) = 3 `, { cca, cac, acc }
    - Permutation of string with 1 b, 2 c's and 0 a's are ` 3!/(0! * 2! * 1!) = 3 `, { ccb, cbc, bcc }
    
    - Adding all of the above we get, ` 19 `

### Time and Auxiliary Space Complexity

- **Time Complexity            :**  `O(1)`
- **Auxiliary Space Complexity :**  `O(1)`

### Code (C++)
```cpp
long long int countStr(long long int n){
    return (1 + 2*n) + n*(n - 1)*(n + 1)/2;
}
```
### Contribution and Support

If you have a better solution or any queries / discussions , please visit our [discussion section](https://github.com/SHRbharat/gfg_potd/discussions).

If you find this solution helpful, consider supporting us by giving a `⭐ star` to the [SHRbharat/gfg_potd](https://github.com/SHRbharat/gfg_potd) repository.

![Total number of repository visitors](https://komarev.com/ghpvc/?username=SHRbharat&color=blueviolet&&label=Visitors)

[![Total number of repository stars](https://img.shields.io/github/stars/SHRbharat/gfg_potd.svg)](https://github.com/SHRbharat/gfg_potd/stargazers)             