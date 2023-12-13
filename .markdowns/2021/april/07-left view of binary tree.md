## GFG Problem Of The Day

### Today - 07 April, 2021
### Ques  - [Left View of Binary Tree](https://www.geeksforgeeks.org/problems/left-view-of-binary-tree/1)

Given a Binary Tree, return Left view of it. Left view of a Binary Tree is set of nodes visible when tree is visited from Left side. The task is to complete the function leftView(), which accepts root of the tree as argument.

Left view of following tree is 1 2 4 8.

          1
       /     \
     2        3
   /     \    /    \
  4     5   6    7
   \
     8   

![](https://badgen.net/badge/Level/Easy/green)

### Approach
The approach works by systematically traversing the binary tree in a level-order fashion, ensuring that at each level, the leftmost node is added to the result vector. Here's how it unfolds:

1. **Initialization:**
   - The algorithm begins by initializing an empty vector (`result`) to store the left view of the binary tree.
   - If the root is null, indicating an empty tree, the function returns the empty result vector.

2. **Level Order Traversal using Queue:**
   - The algorithm employs a queue to perform a level-order traversal starting from the root of the tree.
   - A while loop continues until all nodes in the tree have been processed.

3. **Process Each Level:**
   - For each level, the algorithm determines the number of nodes at that level (`levelSize`).
   - It iterates through the nodes at the current level, dequeuing each one.
   - If the dequeued node is the first in its level, its value is appended to the result vector.

4. **Enqueue Left and Right Children:**
   - The algorithm enqueues the left and right children of the dequeued node, if they exist, ensuring that subsequent levels are processed.

5. **Return the Result:**
   - After the while loop completes, the result vector contains the leftmost nodes at each level, which collectively form the left view of the binary tree.

In summary, the algorithm uses a breadth-first search (BFS) strategy with a queue to traverse the binary tree level by level. By tracking and appending the leftmost node at each level, it constructs the left view of the binary tree in the result vector.


### Time and Auxiliary Space Complexity

- **Time Complexity            :**  `O(N)`, where N is the number of nodes in the binary tree.

                    - The algorithm performs a level-order traversal of the binary tree using a queue.
                    - In the worst case, each node is visited once.

- **Auxiliary Space Complexity :**  `O(n)`, where n is the size of the queue.

                    - The space complexity is determined by the queue used for the level-order traversal.
                    - In the worst case, the queue may store all nodes at a particular level, and the maximum number of nodes at any level is the number of nodes in the last level of the binary tree (which can be roughly N/2 for a balanced binary tree).
                    - Therefore, the auxiliary space complexity is O(N/2), but in big O notation, it simplifies to O(N) as we focus on the dominant term.
  
### Code (C++)
```cpp
vector<int> leftView(Node *root)
{
    
    vector<int> result;
    if (!root) {
        return result;
    }

    queue<Node*> q;
    q.push(root);

    while (!q.empty()) {
        int levelSize = q.size();

        for (int i = 0; i < levelSize; i++) {
            Node* node = q.front();
            q.pop();

            // If this is the first node in the level, add it to the result
            if (i == 0) {
                result.push_back(node->data);
            }
            // Enqueue the left and right children if they exist
            if (node->left) {
                q.push(node->left);
            }
            if (node->right) {
                q.push(node->right);
            }
        }
    }

    return result;
   
}
```
### Contribution and Support

If you have a better solution or any queries / discussions , please visit our [discussion section](https://github.com/SHRbharat/gfg_potd/discussions). 

If you find this solution helpful, consider supporting us by giving a `⭐ star` to the [SHRbharat/gfg_potd](https://github.com/SHRbharat/gfg_potd) repository.

![Total number of repository visitors](https://komarev.com/ghpvc/?username=gl01potdgfg&color=blue&&label=Visitors)
![](https://hit.yhype.me/github/profile?user_id=79409258)

