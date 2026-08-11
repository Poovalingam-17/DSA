# 🌳 Tree Data Structure

---

## 📝 Overview

A **Tree** is a non-linear data structure used to represent hierarchical relationships between elements.

Unlike arrays, linked lists, stacks, and queues, which are generally linear data structures, a tree organizes data in a **hierarchical structure**.

A tree consists of:

- **Nodes**
- **Edges**
- **Root**
- **Parent**
- **Child**
- **Leaf Nodes**
- **Subtrees**

Trees are widely used in computer science and software development, including:

- File systems
- Databases
- Searching
- Sorting
- Compilers
- Artificial Intelligence
- Networking
- HTML/XML DOM
- Priority-based systems

---

## 🎯 Objective

The objective of learning Trees is to understand:

- How hierarchical data is represented.
- How nodes are connected.
- Different types of trees.
- Tree traversal techniques.
- Binary Trees.
- Binary Search Trees.
- Recursive tree operations.
- Searching and insertion in trees.
- Tree height and depth.
- Common tree-based algorithms.

---

## 🌳 Basic Tree Structure

A simple tree can be represented as:

```text
              10
             /  \
            5    15
           / \   / \
          2   7 12  20
```

Here:

```text
10 → Root
5, 15 → Children of 10
2, 7 → Children of 5
12, 20 → Children of 15
```

---

## 🧩 Important Tree Terminology

### Root

The topmost node of a tree is called the **Root**.

Example:

```text
       10
      /  \
     5    15
```

Here:

```text
Root = 10
```

---

### Parent

A node that has one or more children is called a **Parent**.

Example:

```text
       10
      /  \
     5    15
```

Here:

```text
10 → Parent of 5 and 15
```

---

### Child

A node directly connected below another node is called a **Child**.

Example:

```text
       10
      /  \
     5    15
```

Here:

```text
5  → Child of 10
15 → Child of 10
```

---

### Leaf Node

A node that does not have any children is called a **Leaf Node**.

Example:

```text
              10
             /  \
            5    15
           / \   / \
          2   7 12  20
```

Leaf nodes:

```text
2, 7, 12, 20
```

---

### Internal Node

A node that has at least one child is called an **Internal Node**.

In the above example:

```text
10, 5, 15
```

are internal nodes.

---

### Edge

The connection between two nodes is called an **Edge**.

Example:

```text
       10
      /
     5
```

The connection between `10` and `5` is an edge.

---

### Subtree

A tree formed by a node and all of its descendants is called a **Subtree**.

Example:

```text
              10
             /  \
            5    15
           / \
          2   7
```

The subtree rooted at `5` is:

```text
        5
       / \
      2   7
```

---

## 📏 Tree Height

The **height** of a tree is the number of edges in the longest path from the root to a leaf.

Example:

```text
        10
       /
      5
     /
    2
```

The longest path is:

```text
10 → 5 → 2
```

Therefore:

```text
Height = 2
```

> Height definitions can vary by problem. Some problems count nodes instead of edges, so always check the given definition.

---

## 📍 Tree Depth

The **depth** of a node is the number of edges from the root to that node.

Example:

```text
              10
             /  \
            5    15
           /
          2
```

Depth:

```text
Depth(10) = 0
Depth(5)  = 1
Depth(15) = 1
Depth(2)  = 2
```

---

## 🌲 Types of Trees

Trees can be classified into different types based on their structure and properties.

### 1. General Tree

A node can have any number of children.

```text
             A
          /  |  \
         B   C   D
            / \
           E   F
```

---

### 2. Binary Tree

Each node can have at most **two children**.

The children are called:

```text
Left Child
Right Child
```

Example:

```text
          10
         /  \
        5    15
       / \
      2   7
```

---

### 3. Binary Search Tree

A Binary Search Tree follows the ordering property:

```text
Left Subtree < Root < Right Subtree
```

Example:

```text
             10
            /  \
           5    15
          / \   / \
         2   7 12 20
```

For every node:

```text
Left values  < Node
Right values > Node
```

---

### 4. Full Binary Tree

Every node has either:

- Zero children, or
- Exactly two children.

Example:

```text
          10
         /  \
        5    15
       / \
      2   7
```

---

### 5. Complete Binary Tree

All levels are completely filled except possibly the last level.

The last level is filled from **left to right**.

Example:

```text
          1
        /   \
       2     3
      / \   /
     4   5 6
```

---

### 6. Perfect Binary Tree

Every internal node has exactly two children and all leaf nodes are at the same level.

Example:

```text
           1
         /   \
        2     3
       / \   / \
      4   5 6   7
```

---

### 7. Balanced Binary Tree

A tree is considered balanced when the heights of the left and right subtrees remain within an acceptable difference.

A common condition is:

```text
|height(left) - height(right)| <= 1
```

---

### 8. Skewed Tree

A skewed tree has nodes mostly extending in one direction.

#### Left-Skewed

```text
        10
       /
      8
     /
    6
   /
  4
```

#### Right-Skewed

```text
10
  \
   12
     \
      15
        \
         20
```

A highly skewed Binary Search Tree can behave similarly to a linked list.

---

## 🔄 Tree Traversals

Tree traversal means visiting every node of a tree in a specific order.

The main traversal techniques are:

1. Preorder
2. Inorder
3. Postorder
4. Level Order

---

## 1️⃣ Preorder Traversal

The order is:

```text
Root → Left → Right
```

For:

```text
        10
       /  \
      5    15
     / \
    2   7
```

Preorder traversal:

```text
10 5 2 7 15
```

### Pattern

```text
Visit Root
    ↓
Traverse Left
    ↓
Traverse Right
```

---

## 2️⃣ Inorder Traversal

The order is:

```text
Left → Root → Right
```

For:

```text
        10
       /  \
      5    15
     / \
    2   7
```

Inorder traversal:

```text
2 5 7 10 15
```

### Important Property

For a **Binary Search Tree**, inorder traversal produces values in **ascending order**.

```text
BST
 ↓
Inorder
 ↓
Ascending Order
```

---

## 3️⃣ Postorder Traversal

The order is:

```text
Left → Right → Root
```

For:

```text
        10
       /  \
      5    15
     / \
    2   7
```

Postorder traversal:

```text
2 7 5 15 10
```

### Pattern

```text
Traverse Left
    ↓
Traverse Right
    ↓
Visit Root
```

---

## 4️⃣ Level Order Traversal

Level Order Traversal visits nodes level by level.

For:

```text
        10
       /  \
      5    15
     / \   / \
    2   7 12 20
```

Level order:

```text
10 5 15 2 7 12 20
```

It generally uses a **Queue**.

---

## 📊 Traversal Comparison

| Traversal | Order | Common Use |
|------------|-------|------------|
| Preorder | Root → Left → Right | Copying/serialization |
| Inorder | Left → Root → Right | BST sorted order |
| Postorder | Left → Right → Root | Deletion/evaluation |
| Level Order | Level by Level | Breadth-first processing |

---

## 🔁 Recursive Tree Traversal

Tree problems are naturally suited for recursion because every child can itself be treated as the root of a smaller subtree.

The general recursive structure is:

```text
Process current node
        ↓
Process left subtree
        ↓
Process right subtree
```

The base case is generally:

```text
node == null
```

This means there is no node to process.

---

## 🔎 Searching in a Binary Search Tree

For a Binary Search Tree:

```text
Left  < Root < Right
```

we can efficiently search for a value.

Suppose:

```text
          10
         /  \
        5    15
       / \
      2   7
```

Search for:

```text
7
```

Process:

```text
7 < 10
↓
Go Left

7 > 5
↓
Go Right

7 == 7
↓
Found
```

---

## ➕ Insertion in a Binary Search Tree

To insert a value:

1. Start from the root.
2. Compare the value with the current node.
3. If the value is smaller, move left.
4. If the value is larger, move right.
5. Continue until an empty position is found.
6. Insert the new node.

Example:

```text
Insert 8
```

into:

```text
        10
       /  \
      5    15
     / \
    2   7
```

Since:

```text
8 < 10
8 > 5
8 > 7
```

`8` is inserted as the right child of `7`.

---

## ❌ Deletion in a Binary Search Tree

Deleting a node from a BST has three major cases.

### Case 1: Leaf Node

The node has no children.

Simply remove it.

---

### Case 2: One Child

The node has exactly one child.

Connect the parent directly to the child.

---

### Case 3: Two Children

The node has two children.

Replace it using either:

- Inorder successor
- Inorder predecessor

The inorder successor is commonly the smallest value in the right subtree.

---

## 🔢 Minimum and Maximum Value in BST

### Minimum

The minimum value is found by continuously moving to the left.

```text
Root
 ↓
Left
 ↓
Left
 ↓
...
```

The leftmost node contains the minimum value.

---

### Maximum

The maximum value is found by continuously moving to the right.

```text
Root
 ↓
Right
 ↓
Right
 ↓
...
```

The rightmost node contains the maximum value.

---

## ➕ Sum of All Nodes

To calculate the sum of all nodes:

```text
Sum =
Current Node
+
Left Subtree Sum
+
Right Subtree Sum
```

For:

```text
        10
       /  \
      5    15
```

the sum is:

```text
10 + 5 + 15 = 30
```

---

## 🔢 Counting Nodes

The total number of nodes can be calculated recursively:

```text
Count =
1
+
Left Subtree Count
+
Right Subtree Count
```

The `1` represents the current node.

---

## 📈 Finding Maximum Value

For a general Binary Tree, the maximum value can be found by comparing:

```text
Current Node
Left Subtree Maximum
Right Subtree Maximum
```

For a Binary Search Tree, the maximum value is simply the **rightmost node**.

---

## 📉 Finding Minimum Value

For a general Binary Tree, compare:

```text
Current Node
Left Subtree Minimum
Right Subtree Minimum
```

For a Binary Search Tree, the minimum value is the **leftmost node**.

---

## 📏 Finding Tree Height

The height of a Binary Tree can be calculated recursively.

Conceptually:

```text
Height =
1 + max(Left Height, Right Height)
```

with an appropriate base case for an empty tree.

Example:

```text
        10
       /  \
      5    15
     /
    2
```

The longest path contains:

```text
10 → 5 → 2
```

Therefore, when height is measured in edges:

```text
Height = 2
```

---

## 🔄 Tree Traversal Complexity

For a tree containing `N` nodes:

| Operation | Time Complexity |
|-----------|-----------------|
| Preorder Traversal | O(N) |
| Inorder Traversal | O(N) |
| Postorder Traversal | O(N) |
| Level Order Traversal | O(N) |
| Count Nodes | O(N) |
| Sum Nodes | O(N) |
| Find Maximum | O(N) |
| Find Minimum | O(N) |
| Find Height | O(N) |

Every node may need to be visited.

---

## ⚡ Binary Search Tree Complexity

For a Binary Search Tree:

| Operation | Average | Worst Case |
|-----------|---------|------------|
| Search | O(log N) | O(N) |
| Insert | O(log N) | O(N) |
| Delete | O(log N) | O(N) |

The worst case occurs when the BST becomes highly skewed.

Example:

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

This behaves similarly to a linked list.

---

## 🚀 Balanced Trees

Balanced trees are designed to prevent the tree from becoming excessively skewed.

Examples include:

- AVL Tree
- Red-Black Tree

They maintain a controlled height, allowing operations such as search, insertion, and deletion to remain efficient.

---

## 🆚 Binary Tree vs Binary Search Tree

| Feature | Binary Tree | Binary Search Tree |
|---------|-------------|--------------------|
| Maximum children | 2 | 2 |
| Ordering rule | No required ordering | Left < Root < Right |
| Searching | Generally O(N) | Average O(log N) |
| Inorder traversal | Not necessarily sorted | Sorted order |
| Used for | Hierarchical structures | Efficient searching |

---

## 🆚 Tree vs Graph

| Feature | Tree | Graph |
|---------|------|-------|
| Cycles | No cycles | May contain cycles |
| Root | Usually one root | No required root |
| Path | Unique path between two nodes | Multiple paths may exist |
| Structure | Hierarchical | General network |
| Edges | N - 1 for N nodes | No fixed requirement |

---

## 🧠 Common Tree Problems

Some important Tree problems for DSA practice include:

### Basic Problems

- Tree Traversal
- Count Nodes
- Sum of Nodes
- Find Maximum
- Find Minimum
- Find Height
- Find Depth
- Count Leaf Nodes
- Count Internal Nodes

### Binary Tree Problems

- Inorder Traversal
- Preorder Traversal
- Postorder Traversal
- Level Order Traversal
- Maximum Depth
- Minimum Depth
- Invert Binary Tree
- Same Tree
- Symmetric Tree
- Diameter of Binary Tree
- Balanced Binary Tree
- Lowest Common Ancestor

### Binary Search Tree Problems

- Search in BST
- Insert into BST
- Delete Node in BST
- Validate BST
- Minimum in BST
- Maximum in BST
- Convert Sorted Array to BST
- Kth Smallest Element in BST
- Kth Largest Element in BST

---

## 🎓 Learning Outcomes

After completing Tree concepts, you should be able to:

- Understand hierarchical data structures.
- Create and represent tree nodes.
- Identify parents and children.
- Identify leaf nodes.
- Calculate tree height and depth.
- Perform all major tree traversals.
- Implement recursive tree operations.
- Search in a Binary Search Tree.
- Insert values into a BST.
- Delete values from a BST.
- Find minimum and maximum values.
- Calculate the sum of tree nodes.
- Count the number of nodes.
- Understand balanced and unbalanced trees.
- Analyze Tree and BST complexities.

---

## 💼 Interview Perspective

Tree questions are extremely common in technical interviews.

### Important Questions to Prepare

**1. What is a Tree?**

A tree is a non-linear hierarchical data structure consisting of nodes connected by edges.

**2. What is a Binary Tree?**

A tree where each node can have at most two children.

**3. What is a BST?**

A Binary Search Tree follows:

```text
Left < Root < Right
```

**4. Which traversal gives sorted values in a BST?**

```text
Inorder Traversal
```

**5. Which data structure is used for Level Order Traversal?**

```text
Queue
```

**6. What is the time complexity of tree traversal?**

```text
O(N)
```

**7. What happens when a BST becomes skewed?**

Its performance can degrade from:

```text
O(log N)
```

to:

```text
O(N)
```

**8. What is the difference between height and depth?**

```text
Depth → Distance from root to a node

Height → Longest distance from a node to a leaf
```

---

## 📌 Important Observations

- Trees are hierarchical non-linear data structures.
- The topmost node is called the root.
- Nodes connected below another node are its children.
- A node without children is a leaf node.
- A Binary Tree can have at most two children per node.
- A BST maintains an ordering relationship.
- Inorder traversal of a BST produces sorted values.
- Tree problems are commonly solved using recursion.
- Level Order Traversal generally uses a queue.
- Traversal of a tree takes `O(N)` time.
- An unbalanced BST can degrade to `O(N)` operations.
- Balanced trees provide better performance for dynamic searching.

---

## 🧠 Key Concepts

```text
Tree
 ├── Node
 ├── Edge
 ├── Root
 ├── Parent
 ├── Child
 ├── Leaf
 ├── Height
 ├── Depth
 └── Subtree
```

Important Tree types:

```text
Tree
 ├── General Tree
 ├── Binary Tree
 ├── Binary Search Tree
 ├── Full Binary Tree
 ├── Complete Binary Tree
 ├── Perfect Binary Tree
 ├── Balanced Tree
 └── Skewed Tree
```

Important traversals:

```text
Preorder
Inorder
Postorder
Level Order
```

---

## 🔖 Tags

- Tree
- Binary Tree
- Binary Search Tree
- BST
- Recursion
- Tree Traversal
- Preorder
- Inorder
- Postorder
- Level Order
- Data Structures
- DSA
- Java
- Problem Solving
- Algorithms

---

## 🏆 Key Takeaway

The most important Tree concepts can be summarized as:

```text
                 Tree
                   ↓
              Hierarchical
                   ↓
                 Nodes
                   ↓
          ┌────────┴────────┐
          ↓                 ↓
     Binary Tree           BST
          ↓                 ↓
     Traversals       Ordered Structure
          ↓                 ↓
 ┌────────┼────────┐    Efficient Search
 ↓        ↓        ↓
Pre     In      Post
order  order   order
          ↓
     Level Order
```

The most important concepts to master are:

```text
1. Tree Terminology
2. Binary Tree
3. Binary Search Tree
4. Recursion
5. Tree Traversals
6. Height and Depth
7. Searching
8. Insertion
9. Deletion
10. Tree Problems
```

Mastering these concepts provides a strong foundation for solving **Tree-based DSA problems and technical interview questions**.

---

### ⭐ If you found this explanation helpful, consider giving the repository a **Star**.
