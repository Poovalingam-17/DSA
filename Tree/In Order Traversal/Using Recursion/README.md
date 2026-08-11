# 94. Binary Tree Inorder Traversal Using Recursion

---

## 📝 Problem Overview

Given the root of a binary tree, return the **inorder traversal** of its nodes' values.

Inorder traversal follows the order:

```text
Left → Root → Right
```

For example, consider the binary tree:

```text
        1
       / \
      2   3
     / \
    4   5
```

The inorder traversal is:

```text
4 → 2 → 5 → 1 → 3
```

This solution uses a **recursive approach** to traverse the binary tree.

---

## 🎯 Objective

The objective is to traverse every node of a binary tree using **Inorder Traversal** and store the values in a list.

The traversal follows:

```text
Left Subtree
      ↓
Root
      ↓
Right Subtree
```

The solution uses:

- Binary Tree
- Recursion
- Inorder Traversal
- Depth First Search (DFS)
- ArrayList

---

## 💡 Approach

Inorder traversal naturally fits the recursive structure of a binary tree.

For every node, we perform three operations in this exact order:

```text
1. Traverse Left Subtree
2. Process Current Node
3. Traverse Right Subtree
```

Therefore:

```text
Inorder = Left → Root → Right
```

The recursive function receives:

- The current tree node.
- The list used to store the traversal result.

The recursion continues until it reaches a `null` node.

---

## 🔄 Algorithm

1. Create an empty result list.
2. Start the recursive traversal from the root.
3. If the current node is `null`, stop the current recursive call.
4. Recursively traverse the left subtree.
5. Add the current node's value to the result list.
6. Recursively traverse the right subtree.
7. Continue until all nodes have been processed.
8. Return the result list.

---

## 🌳 Example

Consider the following binary tree:

```text
            1
           / \
          2   3
         / \
        4   5
```

### Inorder Rule

```text
Left → Root → Right
```

Therefore:

```text
4 → 2 → 5 → 1 → 3
```

### Output

```text
[4, 2, 5, 1, 3]
```

---

## 🔍 Step-by-Step Recursive Execution

Consider:

```text
        1
       / \
      2   3
     / \
    4   5
```

The recursion starts from node `1`.

---

### Step 1: Visit Node 1

The algorithm first moves to the left subtree.

```text
1
↓
2
```

---

### Step 2: Visit Node 2

Again, move to the left subtree.

```text
2
↓
4
```

---

### Step 3: Visit Node 4

Node `4` has no left child.

Therefore, process node `4`.

Result:

```text
[4]
```

Node `4` also has no right child.

Return to node `2`.

---

### Step 4: Process Node 2

After completing the left subtree of `2`, process `2`.

Result:

```text
[4, 2]
```

Now move to the right subtree of `2`.

```text
5
```

---

### Step 5: Process Node 5

Node `5` has no left child.

Process `5`.

Result:

```text
[4, 2, 5]
```

Return to node `1`.

---

### Step 6: Process Node 1

The entire left subtree of `1` is now complete.

Process `1`.

Result:

```text
[4, 2, 5, 1]
```

Now move to the right subtree.

```text
3
```

---

### Step 7: Process Node 3

Node `3` has no children.

Process `3`.

Final result:

```text
[4, 2, 5, 1, 3]
```

---

## 🧠 Recursive Structure

For every node, the recursive process follows:

```text
             Current Node
                  |
          ┌───────┴───────┐
          ↓               ↓
     Left Subtree     Right Subtree
          ↓               ↓
       Process         Process
          ↓
      Current Node
```

The exact order is:

```text
Traverse Left
      ↓
Process Current Node
      ↓
Traverse Right
```

---

## 🛑 Base Case

The most important part of recursive tree traversal is the base case.

The recursion stops when:

```text
node == null
```

This means there is no node to process.

For example:

```text
        4
       / \
    null null
```

When recursion reaches either missing child:

```text
node == null
```

the function returns immediately.

This prevents infinite recursion.

---

## 🔄 Recursive Traversal Flow

The overall process can be visualized as:

```text
                  Root
                    ↓
              Is Node Null?
               /          \
             Yes           No
              ↓             ↓
            Return      Traverse Left
                            ↓
                     Process Current
                            ↓
                     Traverse Right
                            ↓
                          Return
```

---

## 📖 Example 1

### Input

```text
        1
       / \
      2   3
     / \
    4   5
```

### Output

```text
[4, 2, 5, 1, 3]
```

### Explanation

Following:

```text
Left → Root → Right
```

produces:

```text
4 → 2 → 5 → 1 → 3
```

---

## 📖 Example 2

### Input

```text
        1
         \
          2
         /
        3
```

### Output

```text
[1, 3, 2]
```

### Explanation

The left subtree of `2` contains `3`.

Therefore:

```text
1 → 3 → 2
```

---

## 📖 Example 3

### Input

```text
        1
       /
      2
     /
    3
```

### Output

```text
[3, 2, 1]
```

### Explanation

The traversal reaches the deepest left node first and then processes the parent nodes while returning from recursion.

---

## 📖 Example 4

### Input

```text
root = null
```

### Output

```text
[]
```

### Explanation

There are no nodes in the tree.

The base case is immediately reached, so an empty list is returned.

---

## 🌲 Inorder Traversal of a Binary Search Tree

Inorder traversal has a special property when applied to a **Binary Search Tree**.

A BST follows:

```text
Left < Root < Right
```

Therefore, inorder traversal produces values in **ascending order**.

Example:

```text
             10
            /  \
           5    15
          / \   / \
         2   7 12 20
```

Inorder traversal:

```text
2 → 5 → 7 → 10 → 12 → 15 → 20
```

Therefore:

```text
Binary Search Tree
        ↓
Inorder Traversal
        ↓
Ascending Order
```

This property is extremely useful in many BST problems.

---

## 🆚 Recursive vs Iterative Inorder Traversal

There are two common ways to implement inorder traversal.

### Recursive Approach

The recursive solution follows the definition directly:

```text
Left
 ↓
Root
 ↓
Right
```

Advantages:

- Simple and clean.
- Easy to understand.
- Naturally matches the tree structure.
- Less explicit stack management.

Disadvantage:

- Uses the system recursion stack.
- Very deep trees can cause excessive recursion depth.

---

### Iterative Approach

The iterative solution uses an explicit Stack.

Advantages:

- Avoids recursive function calls.
- Provides direct control over stack memory.
- Useful for very deep trees.

Disadvantage:

- Requires additional logic to manage the stack.

---

## 📊 Complexity Analysis

Let:

```text
N = Number of nodes
```

### Time Complexity

Every node is visited exactly once.

For each node:

```text
Visit Left
Process Node
Visit Right
```

Therefore:

```text
O(N)
```

---

### Space Complexity

The recursive call stack depends on the height of the tree.

Let:

```text
H = Height of the tree
```

The auxiliary space used by recursion is:

```text
O(H)
```

For a balanced tree:

```text
H = O(log N)
```

Therefore:

```text
Space = O(log N)
```

For a completely skewed tree:

```text
H = O(N)
```

Therefore:

```text
Space = O(N)
```

The result list itself requires:

```text
O(N)
```

space because it stores all node values.

---

## 📊 Complexity Summary

| Operation | Complexity |
|-----------|------------|
| Time | O(N) |
| Recursive Stack | O(H) |
| Result List | O(N) |
| Total Output Space | O(N) |

Where:

```text
N = Number of nodes
H = Height of tree
```

---

## 🌐 Inorder Traversal and DFS

Inorder traversal is a form of:

```text
Depth First Search (DFS)
```

The traversal explores the tree deeply before processing the next branch.

The recursive structure is:

```text
Root
 ↓
Left Subtree
 ↓
Current Node
 ↓
Right Subtree
```

Therefore:

```text
Inorder = DFS
```

---

## 🧠 Key Concepts

- Binary Tree
- Tree Traversal
- Inorder Traversal
- Recursion
- Depth First Search
- DFS
- Binary Search Tree
- Recursive Call Stack
- Base Case
- ArrayList

---

## 📌 Important Observations

- Inorder traversal follows **Left → Root → Right**.
- The solution uses recursion.
- The recursion stops when the node is `null`.
- The left subtree is always processed first.
- The current node is processed after its left subtree.
- The right subtree is processed after the current node.
- Every node is visited exactly once.
- Inorder traversal of a BST produces sorted values.
- Recursive space depends on the height of the tree.
- A balanced tree requires approximately `O(log N)` recursive stack space.
- A skewed tree can require `O(N)` recursive stack space.
- The original tree structure is not modified.

---

## 🎓 Learning Outcomes

After solving this problem, you will understand:

- How recursive tree traversal works.
- What inorder traversal means.
- How the `Left → Root → Right` order is maintained.
- How to define a base case in recursive tree problems.
- How recursive calls move through a binary tree.
- How values are collected during traversal.
- Why inorder traversal of a BST produces sorted values.
- How recursion stack space depends on tree height.
- The difference between recursive and iterative traversal.

---

## 💼 Interview Perspective

Binary Tree traversal is one of the most frequently asked topics in technical interviews.

### Common Interview Questions

**1. What is inorder traversal?**

```text
Left → Root → Right
```

---

**2. What is the base case in recursive inorder traversal?**

```text
node == null
```

---

**3. Why is the current node processed between the left and right recursive calls?**

Because inorder traversal follows:

```text
Left → Root → Right
```

---

**4. What is the time complexity?**

```text
O(N)
```

Every node is visited exactly once.

---

**5. What is the recursive space complexity?**

```text
O(H)
```

where `H` is the height of the tree.

---

**6. What is the worst-case recursive space complexity?**

For a skewed tree:

```text
O(N)
```

---

**7. What is the important property of inorder traversal in a BST?**

It produces the elements in:

```text
Ascending Order
```

---

**8. Is inorder traversal DFS or BFS?**

It is a:

```text
Depth First Search (DFS)
```

---

## 🏆 Key Takeaway

The core idea of recursive inorder traversal is:

```text
             Current Node
                  ↓
           Traverse Left
                  ↓
          Process Current
                  ↓
          Traverse Right
```

The most important rule to remember is:

```text
Inorder = Left → Root → Right
```

For a Binary Search Tree:

```text
BST
 ↓
Inorder Traversal
 ↓
Sorted Order
```

The recursive solution is particularly elegant because the structure of the algorithm directly matches the structure of the binary tree.

Mastering recursive inorder traversal provides a strong foundation for:

- Binary Trees
- Binary Search Trees
- DFS
- Recursion
- Tree Searching
- BST validation
- Kth smallest element problems
- Sorted traversal problems
- Advanced Tree algorithms

---

## 🔖 Tags

- LeetCode
- LeetCode 94
- Binary Tree
- Tree Traversal
- Inorder Traversal
- Recursion
- DFS
- Depth First Search
- Binary Search Tree
- BST
- Java
- Data Structures
- Algorithms
- DSA
- Problem Solving

---

### ⭐ If you found this explanation helpful, consider giving the repository a **Star**.
