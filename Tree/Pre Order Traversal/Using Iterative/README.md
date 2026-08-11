# Binary Tree Preorder Traversal Using Stack

---

## 📝 Problem Overview

Given the root of a binary tree, return the **preorder traversal** of its nodes' values.

Preorder traversal follows the order:

```text
Root → Left → Right
```

For example, consider the binary tree:

```text
        1
       / \
      2   3
     / \
    4   5
```

The preorder traversal is:

```text
1 2 4 5 3
```

This solution uses an **iterative approach with a Stack** instead of recursion.

---

## 🎯 Objective

Perform preorder traversal of a binary tree using:

- Iterative traversal
- Stack data structure
- Root → Left → Right ordering
- `O(N)` time complexity
- `O(N)` auxiliary space in the worst case

---

## 💡 Approach

Preorder traversal requires every node to be processed in this order:

```text
Root
 ↓
Left
 ↓
Right
```

A Stack follows **LIFO (Last In, First Out)**.

To maintain the preorder order, the right child is pushed into the stack **before** the left child.

Why?

Suppose the current node has:

```text
       1
      / \
     2   3
```

We want:

```text
1 → 2 → 3
```

Since the stack is LIFO:

```text
Push Right
Push Left
```

The left child is popped first.

Therefore:

```text
Stack
 ↓
Right
Left
```

and:

```text
Left → Right
```

is maintained.

---

## 🔄 Algorithm

1. Create an empty list to store the traversal result.
2. Create an empty stack.
3. If the root is `null`, return the empty list.
4. Push the root node into the stack.
5. Continue while the stack is not empty.
6. Pop a node from the stack.
7. Add the node's value to the result list.
8. If the node has a right child, push it into the stack.
9. If the node has a left child, push it into the stack.
10. Continue until the stack becomes empty.
11. Return the traversal list.

---

## 🌳 Example

Consider the binary tree:

```text
        1
       / \
      2   3
     / \
    4   5
```

### Preorder Rule

```text
Root → Left → Right
```

Expected traversal:

```text
1 2 4 5 3
```

---

## 🔍 Stack Execution

### Step 1

Start with:

```text
Stack:
[1]
```

Pop `1`.

Result:

```text
[1]
```

Push:

```text
Right → 3
Left  → 2
```

Stack:

```text
[3, 2]
```

---

### Step 2

Pop `2`.

Result:

```text
[1, 2]
```

Node `2` has:

```text
Left  → 4
Right → 5
```

Push right first:

```text
5
```

Then left:

```text
4
```

Stack:

```text
[3, 5, 4]
```

---

### Step 3

Pop `4`.

Result:

```text
[1, 2, 4]
```

Node `4` has no children.

Stack:

```text
[3, 5]
```

---

### Step 4

Pop `5`.

Result:

```text
[1, 2, 4, 5]
```

Node `5` has no children.

Stack:

```text
[3]
```

---

### Step 5

Pop `3`.

Result:

```text
[1, 2, 4, 5, 3]
```

Node `3` has no children.

Stack:

```text
[]
```

The traversal is complete.

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
[1, 2, 4, 5, 3]
```

### Explanation

Following:

```text
Root → Left → Right
```

gives:

```text
1 → 2 → 4 → 5 → 3
```

---

## 📖 Example 2

### Input

```text
        1
         \
          2
           \
            3
```

### Output

```text
[1, 2, 3]
```

### Explanation

The tree contains only right children, so the traversal visits the nodes from top to bottom.

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
[1, 2, 3]
```

### Explanation

The tree contains only left children, so preorder traversal visits each node from the root toward the left.

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

If the tree is empty, there are no nodes to traverse.

Therefore, an empty list is returned.

---

## 🧠 Why Push Right Before Left?

This is the most important part of the iterative preorder traversal.

Preorder requires:

```text
Root → Left → Right
```

But Stack follows:

```text
Last In → First Out
```

Therefore, to process the left child first:

```text
Push Right
Push Left
```

Example:

```text
        1
       / \
      2   3
```

Push:

```text
3
2
```

The stack becomes:

```text
[3, 2]
```

Since `2` was pushed last, it is removed first.

Therefore:

```text
2 → 3
```

which gives the required:

```text
Root → Left → Right
```

---

## 🧠 Decision Logic

### Case 1: Empty Tree

If:

```text
root == null
```

return:

```text
[]
```

---

### Case 2: Root Exists

Push the root into the stack.

```text
Stack:
[root]
```

---

### Case 3: Process Current Node

While the stack is not empty:

1. Pop the top node.
2. Add its value to the result.
3. Push its right child.
4. Push its left child.

---

### Case 4: No Children

If a node does not have any children, nothing is pushed.

The algorithm continues with the remaining nodes in the stack.

---

## 📊 Complexity Analysis

Let `N` be the number of nodes in the binary tree.

### Time Complexity

Every node is:

- Pushed at most once.
- Popped at most once.
- Processed once.

Therefore:

```text
O(N)
```

---

### Space Complexity

The stack can contain multiple nodes at the same time.

In the worst case, the stack may contain `O(N)` nodes.

Therefore:

```text
O(N)
```

The result list itself also stores `N` values.

If counting only auxiliary traversal space:

```text
O(N)
```

---

## 🚀 Recursive vs Iterative Approach

Preorder traversal can be implemented using both recursion and iteration.

### Recursive Approach

The traversal naturally follows:

```text
Root
 ↓
Left
 ↓
Right
```

Advantages:

- Simple implementation
- Easy to understand
- Naturally matches tree structure

Disadvantage:

- Uses the recursion call stack.

---

### Iterative Approach

Uses an explicit Stack.

Advantages:

- Avoids recursive function calls.
- Gives direct control over the traversal stack.
- Useful when recursion depth could become large.

Disadvantage:

- Slightly more complex than the recursive approach.

---

## 📊 Comparison

| Approach | Time | Space | Technique |
|----------|------|-------|-----------|
| Recursive | O(N) | O(H) | Recursion |
| Iterative | O(N) | O(N) worst case | Stack |

Here:

```text
N = Number of nodes
H = Height of tree
```

For a balanced tree:

```text
H ≈ log N
```

For a skewed tree:

```text
H ≈ N
```

---

## 📌 Important Observations

- Preorder traversal follows **Root → Left → Right**.
- A Stack is used for iterative preorder traversal.
- The root must be pushed first.
- The current node is processed immediately after popping.
- The right child must be pushed before the left child.
- The left child is therefore processed first because the Stack follows LIFO.
- An empty tree returns an empty list.
- Every node is visited exactly once.
- The algorithm does not modify the original tree.

---

## 🧠 Key Concepts

- Binary Tree
- Tree Traversal
- Preorder Traversal
- Stack
- LIFO
- Iterative Traversal
- Recursion vs Iteration
- Depth First Search
- DFS

---

## 🌐 Preorder Traversal as DFS

Preorder traversal is a form of **Depth First Search (DFS)**.

The traversal goes as deep as possible through the left subtree before processing the right subtree.

The basic structure is:

```text
              Root
             /    \
            /      \
        Left        Right
         ↓            ↓
      Traverse      Traverse
```

The preorder sequence is:

```text
Root → Left → Right
```

---

## 🎓 Learning Outcomes

After solving this problem, you will understand:

- What preorder traversal is.
- How to traverse a Binary Tree iteratively.
- How a Stack can replace recursion.
- Why the right child is pushed before the left child.
- How LIFO behavior affects traversal order.
- How preorder traversal relates to DFS.
- How to analyze tree traversal complexity.
- The difference between recursive and iterative traversal.

---

## 💼 Interview Perspective

Preorder traversal is one of the most important Binary Tree problems in technical interviews.

### Common Interview Questions

**1. What is preorder traversal?**

```text
Root → Left → Right
```

---

**2. Which data structure is used for iterative preorder traversal?**

```text
Stack
```

---

**3. Why is the right child pushed before the left child?**

Because the Stack follows LIFO.

Pushing:

```text
Right → Left
```

causes:

```text
Left → Right
```

to be processed.

---

**4. What is the time complexity?**

```text
O(N)
```

because every node is visited once.

---

**5. What is the auxiliary space complexity?**

```text
O(N)
```

in the worst case due to the explicit stack.

---

**6. Is preorder traversal DFS or BFS?**

Preorder traversal is a type of:

```text
Depth First Search (DFS)
```

---

**7. What are the other major tree traversals?**

```text
Preorder   → Root → Left → Right
Inorder    → Left → Root → Right
Postorder  → Left → Right → Root
Level Order → Level by Level
```

---

## 🔖 Tags

- Binary Tree
- Tree Traversal
- Preorder Traversal
- Stack
- DFS
- Depth First Search
- Iterative Traversal
- Java
- Recursion
- Data Structures
- DSA
- Problem Solving

---

## 🏆 Key Takeaway

The main idea behind iterative preorder traversal is:

```text
Start with Root
      ↓
Pop a node
      ↓
Process the node
      ↓
Push Right Child
      ↓
Push Left Child
      ↓
Repeat
```

The most important rule is:

```text
Preorder = Root → Left → Right
```

Since a Stack follows:

```text
LIFO
```

we push:

```text
Right → Left
```

so that the nodes are processed as:

```text
Left → Right
```

Therefore:

```text
                 Preorder
                    ↓
             Root → Left → Right
                    ↓
                  Stack
                    ↓
          Push Right → Push Left
                    ↓
              Correct Order
```

Mastering iterative preorder traversal provides a strong foundation for understanding **Binary Trees, DFS, Stack-based traversal, and advanced Tree problems**.

---

### ⭐ If you found this explanation helpful, consider giving the repository a **Star**.
