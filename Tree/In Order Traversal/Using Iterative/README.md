# 94. Binary Tree Inorder Traversal

---

## 📝 Problem Overview

Given the root of a binary tree, return the **inorder traversal** of its nodes' values.

Inorder traversal visits the nodes in the following order:

```text
Left → Root → Right
```

For example, consider the binary tree:

```text
        1
         \
          2
         /
        3
```

The inorder traversal is:

```text
1 → 3 → 2
```

This solution uses an **iterative approach with a Stack** instead of recursion.

---

## 🎯 Objective

The objective is to traverse a binary tree using **inorder traversal** and return all node values in a list.

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
- Stack
- Iterative traversal
- Depth First Search (DFS)

---

## 💡 Approach

Inorder traversal requires us to process nodes in this order:

```text
Left → Root → Right
```

Unlike preorder traversal, we cannot process the root immediately.

We must first travel as far as possible toward the **left subtree**.

The Stack is used to remember the nodes that need to be processed after their left subtree has been visited.

The main idea is:

1. Start from the root.
2. Move continuously toward the left child.
3. Push every visited node into the Stack.
4. When there is no left child:
   - Pop a node from the Stack.
   - Add its value to the result.
   - Move to its right child.
5. Repeat until there are no nodes left to process.

---

## 🔄 Algorithm

1. Create an empty result list.
2. Create an empty Stack.
3. If the root is `null`, return the empty list.
4. Set the current node to the root.
5. Continue the traversal while there are nodes to process.
6. If the current node is not `null`:
   - Push the current node into the Stack.
   - Move to its left child.
7. Otherwise:
   - If the Stack is empty, traversal is complete.
   - Pop a node from the Stack.
   - Add its value to the result list.
   - Move to the popped node's right child.
8. Continue until the Stack is empty and there is no current node.
9. Return the result list.

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

## 🔍 Step-by-Step Stack Execution

Consider:

```text
        1
       / \
      2   3
     / \
    4   5
```

---

### Step 1

Start at:

```text
1
```

Move left while pushing nodes.

```text
Stack:
[1]
```

Move to:

```text
2
```

Push:

```text
[1, 2]
```

Move to:

```text
4
```

Push:

```text
[1, 2, 4]
```

Node `4` has no left child.

---

### Step 2

Pop `4`.

Result:

```text
[4]
```

Move to the right child of `4`.

There is no right child.

So:

```text
node = null
```

---

### Step 3

The Stack contains:

```text
[1, 2]
```

Pop `2`.

Result:

```text
[4, 2]
```

Move to the right child of `2`:

```text
5
```

---

### Step 4

Push `5`.

Stack:

```text
[1, 5]
```

`5` has no left child.

Pop `5`.

Result:

```text
[4, 2, 5]
```

There is no right child.

---

### Step 5

The Stack contains:

```text
[1]
```

Pop `1`.

Result:

```text
[4, 2, 5, 1]
```

Move to the right child:

```text
3
```

---

### Step 6

Process node `3`.

Result:

```text
[4, 2, 5, 1, 3]
```

Node `3` has no children.

The Stack is empty and there are no remaining nodes.

Traversal is complete.

---

## 🧠 Why Do We Go Left First?

The defining rule of inorder traversal is:

```text
Left → Root → Right
```

Therefore, before processing a node, we must completely process its left subtree.

The Stack allows us to remember the parent nodes while moving left.

For example:

```text
        1
       /
      2
     /
    3
```

The traversal first moves:

```text
1 → 2 → 3
```

and pushes:

```text
[1, 2, 3]
```

Then nodes are popped in reverse order:

```text
3 → 2 → 1
```

which produces:

```text
[3, 2, 1]
```

This is the correct inorder traversal.

---

## 🧠 Core Logic

The algorithm has two main operations.

### Operation 1: Move Left

If the current node exists:

```text
Current Node
     ↓
Push into Stack
     ↓
Move Left
```

This continues until:

```text
Current Node = null
```

---

### Operation 2: Process Node

When there is no left child:

```text
Pop from Stack
      ↓
Add value to result
      ↓
Move to Right Child
```

This process continues until all nodes are visited.

---

## 🔄 Traversal Flow

The overall process can be visualized as:

```text
              Start
                ↓
          Current = Root
                ↓
        Is Current != null?
           /          \
         Yes           No
          ↓             ↓
       Push Node    Is Stack Empty?
          ↓          /          \
      Move Left    Yes          No
                       ↓          ↓
                     Stop      Pop Node
                                  ↓
                             Add to Result
                                  ↓
                            Move Right
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

The left subtree of `2` contains `3`, so `3` is processed before `2`.

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

All nodes are on the left side.

The traversal reaches the deepest left node first and then processes the parent nodes while returning upward.

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

An empty tree contains no nodes.

Therefore, the traversal result is an empty list.

---

## 🌲 Inorder Traversal of a Binary Search Tree

One of the most important properties of inorder traversal is its behavior on a **Binary Search Tree**.

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
Inorder Traversal of BST
          ↓
    Sorted Order
```

This is one of the most important concepts to remember for Tree and BST problems.

---

## 🆚 Preorder vs Inorder

| Traversal | Order |
|-----------|-------|
| Preorder | Root → Left → Right |
| Inorder | Left → Root → Right |

For the tree:

```text
        1
       / \
      2   3
```

### Preorder

```text
1 → 2 → 3
```

### Inorder

```text
2 → 1 → 3
```

---

## 🆚 Recursive vs Iterative Inorder

### Recursive Approach

The recursive process follows:

```text
Traverse Left
     ↓
Process Root
     ↓
Traverse Right
```

Advantages:

- Simple
- Easy to understand
- Closely follows the definition of inorder traversal

Disadvantage:

- Uses the recursion call stack.

---

### Iterative Approach

The iterative approach uses an explicit Stack.

Advantages:

- Avoids recursive function calls.
- Provides explicit control over traversal.
- Useful when recursion depth could become large.

Disadvantage:

- Requires manual Stack management.

---

## 📊 Complexity Analysis

Let:

```text
N = Number of nodes
```

### Time Complexity

Every node is:

- Pushed into the Stack once.
- Popped from the Stack once.
- Added to the result once.

Therefore:

```text
O(N)
```

---

### Space Complexity

The Stack can contain nodes along the current path.

In the worst case, the tree can be completely skewed:

```text
1
 \
  2
   \
    3
     \
      4
       \
        5
```

In this case, the Stack may require:

```text
O(N)
```

space.

Therefore:

```text
Space Complexity = O(N)
```

The result list also contains `N` values.

---

## 📊 Traversal Complexity Comparison

| Traversal | Time Complexity | Auxiliary Space |
|-----------|-----------------|-----------------|
| Preorder | O(N) | O(N) |
| Inorder | O(N) | O(N) |
| Postorder | O(N) | O(N) |
| Level Order | O(N) | O(N) |

---

## 📌 Important Observations

- Inorder traversal follows **Left → Root → Right**.
- A Stack is used for iterative inorder traversal.
- The algorithm moves as far left as possible.
- Every visited node is temporarily stored in the Stack.
- A node is processed only after its left subtree has been processed.
- After processing a node, traversal moves to its right subtree.
- An empty tree returns an empty list.
- Every node is visited exactly once.
- Inorder traversal of a BST produces values in ascending order.
- The original tree structure is not modified.

---

## 🧠 Key Concepts

- Binary Tree
- Inorder Traversal
- Stack
- LIFO
- Iterative Traversal
- Depth First Search
- DFS
- Binary Search Tree
- Recursion
- Tree Traversal

---

## 🎓 Learning Outcomes

After solving this problem, you will understand:

- What inorder traversal is.
- How to perform inorder traversal iteratively.
- How a Stack can replace recursion.
- Why the algorithm moves left before processing a node.
- How the Stack stores parent nodes.
- Why traversal moves to the right after processing a node.
- Why inorder traversal produces sorted values in a BST.
- How to analyze the complexity of tree traversal.

---

## 💼 Interview Perspective

Inorder traversal is one of the most important Binary Tree concepts for technical interviews.

### Common Interview Questions

**1. What is inorder traversal?**

```text
Left → Root → Right
```

---

**2. Which data structure is used for iterative inorder traversal?**

```text
Stack
```

---

**3. Why do we move to the left before processing the current node?**

Because inorder traversal requires the entire left subtree to be processed before the root.

---

**4. What happens after processing a node?**

The traversal moves to the node's:

```text
Right Child
```

---

**5. What is the time complexity?**

```text
O(N)
```

because every node is visited once.

---

**6. What is the auxiliary space complexity?**

```text
O(N)
```

in the worst case due to the Stack.

---

**7. What is the important property of inorder traversal in a BST?**

It produces the node values in:

```text
Ascending Order
```

---

**8. Is inorder traversal DFS or BFS?**

Inorder traversal is a type of:

```text
Depth First Search (DFS)
```

---

## 🏆 Key Takeaway

The core idea of iterative inorder traversal is:

```text
                 Root
                   ↓
             Move Left
                   ↓
              Push Nodes
                   ↓
          Reach Null / Leaf
                   ↓
              Pop Node
                   ↓
            Process Node
                   ↓
             Move Right
                   ↓
                Repeat
```

The most important rule is:

```text
Inorder = Left → Root → Right
```

For a Binary Search Tree:

```text
BST
 ↓
Inorder Traversal
 ↓
Ascending Order
```

The iterative solution uses a Stack to simulate the behavior of recursion while maintaining the correct traversal order.

Mastering inorder traversal provides a strong foundation for:

- Binary Search Trees
- DFS
- Stack-based algorithms
- Tree recursion
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
- Stack
- DFS
- Depth First Search
- Iterative Traversal
- Binary Search Tree
- BST
- Java
- Data Structures
- Algorithms
- DSA
- Problem Solving

---

### ⭐ If you found this explanation helpful, consider giving the repository a **Star**.
