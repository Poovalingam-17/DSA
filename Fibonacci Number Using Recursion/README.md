# Fibonacci Number Using Recursion

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-brightgreen)
![Topic](https://img.shields.io/badge/Topic-Recursion-success)
![Status](https://img.shields.io/badge/Status-Solved-brightgreen)

---

## 📝 Problem Overview

The **Fibonacci Sequence** is a series of numbers where each number is the sum of the two preceding numbers.

The sequence begins as:

```text
0, 1, 1, 2, 3, 5, 8, 13, ...
```

Given an integer `n`, return the **n-th Fibonacci number** using recursion.

---

## 🎯 Objective

Compute the Fibonacci number at index `n` by recursively breaking the problem into smaller subproblems.

---

## 💡 Approach

The recursive approach is based on the mathematical definition of the Fibonacci sequence.

### Base Cases

- If `n = 0`, return `0`.
- If `n = 1`, return `1`.

### Recursive Case

For any value greater than `1`:

```text
F(n) = F(n-1) + F(n-2)
```

The function repeatedly calls itself until it reaches one of the base cases.

---

## 🔄 Algorithm

1. Read the input value `n`.
2. If `n` is less than `2`, return `n`.
3. Otherwise:
   - Compute `F(n-1)`.
   - Compute `F(n-2)`.
4. Return the sum of both values.
5. Continue until all recursive calls finish.

---

## 🌳 Recursion Tree

### Example

```text
n = 5
```

```text
                    F(5)
                 /       \
             F(4)         F(3)
            /   \        /   \
         F(3)  F(2)   F(2)  F(1)
         / \    / \    / \
      F(2)F(1)F(1)F(0)F(1)F(0)
      / \
   F(1) F(0)
```

Each node represents a recursive function call.

Notice that the same Fibonacci values are calculated multiple times.

---

## 📖 Example

### Input

```text
n = 5
```

### Output

```text
5
```

### Explanation

```text
F(5)

= F(4) + F(3)

= (3) + (2)

= 5
```

---

## 📊 Complexity Analysis

| Complexity | Value |
|------------|-------|
| **Time Complexity** | **O(2ⁿ)** |
| **Space Complexity** | **O(n)** |

### Time Complexity

Each function call generates two more recursive calls.

This creates an exponential number of calls.

```text
Time Complexity = O(2ⁿ)
```

---

### Space Complexity

The maximum depth of the recursion stack is equal to `n`.

```text
Space Complexity = O(n)
```

---

## 🧠 Key Concepts

- Recursion
- Recursive Tree
- Base Case
- Divide and Conquer
- Mathematical Recurrence

---

## 📌 Important Observations

- Every Fibonacci number depends on the previous two numbers.
- The recursive solution is simple but inefficient.
- Many recursive calls compute the same value repeatedly.
- This overlapping computation makes the recursive approach slow for large values of `n`.

---

## 🚀 Optimization

### Recursive Approach

- Easy to understand.
- Repeated calculations.
- Exponential time complexity.

**Time Complexity:** `O(2ⁿ)`

---

### Memoization (Top-Down DP)

- Store previously computed Fibonacci values.
- Avoid repeated recursive calls.

**Time Complexity:** `O(n)`

**Space Complexity:** `O(n)`

---

### Tabulation (Bottom-Up DP)

- Compute Fibonacci values iteratively.
- No recursion required.

**Time Complexity:** `O(n)`

**Space Complexity:** `O(n)`

---

### Space Optimized Approach

- Keep only the previous two Fibonacci numbers.

**Time Complexity:** `O(n)`

**Space Complexity:** `O(1)`

---

## 🎓 Learning Outcomes

After solving this problem, you will understand:

- How recursion works.
- The importance of defining base cases.
- How recursive problems are broken into smaller subproblems.
- Why overlapping subproblems lead to inefficiency.
- How Dynamic Programming improves recursive solutions.

---

## 🔖 Tags

- Recursion
- Dynamic Programming
- Memoization
- Mathematics
- Divide and Conquer

---

### ⭐ If you found this explanation helpful, consider giving the repository a **Star**.
