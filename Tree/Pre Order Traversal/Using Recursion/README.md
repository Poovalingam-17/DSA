# 144. Binary Tree Preorder Traversal

---

## 📝 Problem Overview

Given the root of a binary tree, return the **preorder traversal** of its nodes' values.

Preorder traversal visits the nodes in the following order:

```text
Root → Left → Right
```

For example, consider the following binary tree:

```text
        1
       / \
      2   3
     / \
    4   5
```

The preorder traversal is:

```text
1 → 2 → 4 → 5 → 3
```

This solution uses an **iterative approach with a Stack** to perform the traversal.

---

## 🎯 Objective

The objective is to traverse a binary tree in **preorder order** and return all node values in a list.

The traversal should follow:

```text
Root
 ↓
Left Subtree
 ↓
Right Subtree
```

The solution uses:

- Binary Tree
- Stack
- Iterative traversal
- Depth First Search (DFS)

---

## 💡 Approach

There are two common ways to perform preorder traversal:

1. Recursion
2. Iteration using a Stack

This solution uses the **iterative Stack approach**.

The main idea is:

1. Start from the root.
2. Push the root into the stack.
3. Pop the top node.
4. Add its value to the result.
5. Push the right child into the stack.
6. Push the left child into the stack.
7. Continue until the stack becomes empty.

The right child is pushed **before** the left child because the stack follows **LIFO (Last In, First Out)**.

Therefore, the left child will be processed first.

---

## 🔄 Algorithm

1. Create an empty result list.
2. Create an empty stack.
3. If the root is `null`, return the empty list.
4. Push the root node into the stack.
5. While the stack is not empty:
   - Remove the top node from the stack.
   - Add its value to the result list.
   - If the node has a right child, push it into the stack.
   - If the node has a left child, push it into the stack.
6. Continue until all nodes are processed.
7. Return the result list.

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

### Preorder Rule

```text
Root → Left → Right
```

Therefore:

```text
1 → 2 → 4 → 5 → 3
```

### Output

```text
[1, 2, 4, 5, 3]
```

---

## 🔍 Step-by-Step Stack Execution

### Step 1

Initial tree:

```text
        1
       / \
      2   3
```

Push the root:

```text
Stack:
[1]
```

---

### Step 2

Pop `1`.

Result:

```text
[1]
```

Push the right child first:

```text
3
```

Then push the left child:

```text
2
```

Stack:

```text
[3, 2]
```

Because the stack follows LIFO, `2` will be processed first.

---

### Step 3

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

Push `5` first and then `4`.

Stack:

```text
[3, 5, 4]
```

---

### Step 4

Pop `4`.

Result:

```text
[1, 2, 4]
```

Node `4` has no children.

---

### Step 5

Pop `5`.

Result:

```text
[1, 2, 4, 5]
```

Node `5` has no children.

---

### Step 6

Pop `3`.

Result:

```text
[1, 2, 4, 5, 3]
```

Node `3` has no children.

The stack is now empty.

Traversal is complete.

---

## 🧠 Why Push the Right Child First?

This is the most important concept in iterative preorder traversal.

Preorder requires:

```text
Root → Left → Right
```

But a stack follows:

```text
Last In → First Out
```

Therefore, we must push the children in reverse order.

Required processing order:

```text
Left → Right
```

Stack insertion order:

```text
Right → Left
```

For example:

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

Stack:

```text
[3, 2]
```

The top element is:

```text
2
```

Therefore, `2` is popped before `3`.

This gives:

```text
1 → 2 → 3
```

which is exactly preorder traversal.

---

## 📖 Example 1

### Input

```text
root =
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

produces:

```text
1 → 2 → 4 → 5 → 3
```

---

## 📖 Example 2

### Input

```text
root =
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

Each node has only a right child, so the traversal proceeds from top to bottom.

---

## 📖 Example 3

### Input

```text
root =
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

Each node has only a left child, so the traversal follows the left side of the tree.

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

If the binary tree is empty, there are no nodes to visit.

Therefore, an empty list is returned.

---

## 🌲 Preorder Traversal

The general preorder traversal pattern is:

```text
              Root
             /    \
            /      \
        Left        Right
         ↓            ↓
      Process       Process
```

The order is always:

```text
Root → Left → Right
```

---

## 🔁 Recursive vs Iterative Approach

Preorder traversal can be implemented using either recursion or iteration.

### Recursive Approach

The recursive approach naturally follows:

```text
Process Root
     ↓
Traverse Left
     ↓
Traverse Right
```

Advantages:

- Simple
- Easy to understand
- Closely follows the tree structure

Disadvantage:

- Uses the recursion call stack.

---

### Iterative Approach

The iterative approach uses an explicit Stack.

Advantages:

- Avoids recursive function calls.
- Provides direct control over traversal.
- Useful for understanding Stack-based DFS.

Disadvantage:

- Requires explicit stack management.

---

## 📊 Complexity Analysis

Let:

```text
N = Number of nodes
```

### Time Complexity

Every node is visited exactly once.

For every node:

- It is pushed at most once.
- It is popped at most once.
- Its value is processed once.

Therefore:

```text
O(N)
```

---

### Space Complexity

The Stack may contain multiple nodes.

In the worst case:

```text
O(N)
```

The result list also contains `N` node values.

Therefore, the overall space required is:

```text
O(N)
```

If only auxiliary space is considered, the explicit traversal stack requires up to:

```text
O(N)
```

in the worst case.

---

## 🆚 Preorder Traversal Types

There are four important tree traversal techniques.

| Traversal | Order | Common Technique |
|-----------|-------|------------------|
| Preorder | Root → Left → Right | Stack / Recursion |
| Inorder | Left → Root → Right | Stack / Recursion |
| Postorder | Left → Right → Root | Stack / Recursion |
| Level Order | Level by Level | Queue |

---

## 🌐 Preorder Traversal and DFS

Preorder traversal is a form of:

```text
Depth First Search (DFS)
```

DFS explores the tree deeply before moving to another branch.

The preorder strategy is:

```text
Visit Root
    ↓
Explore Left
    ↓
Explore Right
```

Therefore:

```text
Preorder = DFS
```

---

## 📌 Important Observations

- Preorder traversal follows **Root → Left → Right**.
- A Stack is used for iterative traversal.
- The root is pushed into the Stack first.
- The current node is processed immediately after popping.
- The right child must be pushed before the left child.
- The Stack follows LIFO order.
- Pushing the right child first ensures that the left child is processed first.
- Every node is visited exactly once.
- An empty tree returns an empty list.
- The original tree is not modified.
- The traversal takes `O(N)` time.

---

## 🧠 Key Concepts

- Binary Tree
- Tree Traversal
- Preorder Traversal
- Stack
- LIFO
- Iterative DFS
- Depth First Search
- Recursion
- Data Structures
- Tree Algorithms

---

## 🎓 Learning Outcomes

After solving this problem, you will understand:

- What preorder traversal is.
- How to traverse a binary tree iteratively.
- How Stack data structures can be used for DFS.
- Why the right child is pushed before the left child.
- How LIFO behavior controls traversal order.
- The difference between recursive and iterative traversal.
- How to handle an empty binary tree.
- How to analyze the time and space complexity of tree traversal.

---

## 💼 Interview Perspective

Binary Tree traversal is one of the most frequently asked topics in DSA interviews.

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

**3. Why do we push the right child before the left child?**

Because Stack follows:

```text
LIFO
```

Therefore:

```text
Push Right
Push Left
```

results in:

```text
Process Left
Process Right
```

---

**4. What is the time complexity?**

```text
O(N)
```

because every node is visited exactly once.

---

**5. What is the space complexity?**

```text
O(N)
```

in the worst case due to the Stack and result storage.

---

**6. Is preorder traversal DFS or BFS?**

Preorder traversal is a type of:

```text
Depth First Search (DFS)
```

---

**7. What are the three depth-first traversals?**

```text
Preorder  → Root → Left → Right
Inorder   → Left → Root → Right
Postorder → Left → Right → Root
```

---

## 🏆 Key Takeaway

The core idea of iterative preorder traversal is:

```text
             Root
               ↓
             Push
               ↓
              Pop
               ↓
         Process Node
               ↓
       ┌───────┴───────┐
       ↓               ↓
   Push Right       Push Left
                       ↓
                Left processed first
```

The most important rule to remember is:

```text
Preorder = Root → Left → Right
```

Since a Stack follows:

```text
LIFO
```

the children must be pushed in reverse order:

```text
Right → Left
```

so that they are processed in the correct order:

```text
Left → Right
```

Mastering preorder traversal provides a strong foundation for:

- Binary Trees
- DFS
- Stack-based algorithms
- Recursive Tree problems
- Inorder Traversal
- Postorder Traversal
- Advanced Tree Algorithms

---

## 🔖 Tags

- LeetCode
- Binary Tree
- Tree Traversal
- Preorder Traversal
- Stack
- DFS
- Depth First Search
- Iterative Traversal
- Java
- Data Structures
- Algorithms
- DSA
- Problem Solving

---

### ⭐ If you found this explanation helpful, consider giving the repository a **Star**.
