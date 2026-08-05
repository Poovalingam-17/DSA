# Factorial of a Number Using Recursion

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-brightgreen)
![Topic](https://img.shields.io/badge/Topic-Recursion-success)
![Status](https://img.shields.io/badge/Status-Solved-brightgreen)

---

## 📝 Problem Overview

The **factorial** of a positive integer `n` is the product of all positive integers from `1` to `n`.

Mathematically,

```text
n! = n × (n - 1) × (n - 2) × ... × 2 × 1
```

Factorial is widely used in mathematics, combinatorics, probability, and algorithm design.

---

## 🎯 Objective

Calculate the factorial of a given positive integer using the **Recursive** approach.

---

## 💡 Approach

The recursive solution is based on the mathematical recurrence relation.

### Base Case

If `n` is `1`, the factorial is `1`.

```text
factorial(1) = 1
```

### Recursive Case

For any value greater than `1`,

```text
factorial(n) = n × factorial(n - 1)
```

The recursion continues until it reaches the base case.

---

## 🔄 Algorithm

1. Read the input value `n`.
2. If `n` equals `1`, return `1`.
3. Otherwise:
   - Multiply `n` with `factorial(n - 1)`.
4. Continue recursively until the base case is reached.
5. Return the computed factorial.

---

## 🌳 Recursion Tree

### Input

```text
n = 5
```

```text
factorial(5)
      |
      ▼
5 × factorial(4)
      |
      ▼
4 × factorial(3)
      |
      ▼
3 × factorial(2)
      |
      ▼
2 × factorial(1)
      |
      ▼
1
```

### Returning Phase

```text
factorial(1) = 1

factorial(2) = 2 × 1 = 2

factorial(3) = 3 × 2 = 6

factorial(4) = 4 × 6 = 24

factorial(5) = 5 × 24 = 120
```

---

## 📖 Example

### Input

```text
n = 5
```

### Output

```text
120
```

### Explanation

```text
5!
= 5 × 4 × 3 × 2 × 1
= 120
```

---

## 📊 Complexity Analysis

| Complexity | Value |
|------------|-------|
| **Time Complexity** | **O(N)** |
| **Space Complexity** | **O(N)** |

### Time Complexity

Each recursive call reduces the value of `n` by `1`.

```text
n → n-1 → n-2 → ... → 1
```

Therefore,

```text
Time Complexity = O(N)
```

---

### Space Complexity

The recursion stack stores one function call for each value of `n`.

```text
Space Complexity = O(N)
```

---

## 🧠 Key Concepts

- Recursion
- Base Case
- Recursive Function
- Mathematical Recurrence
- Call Stack

---

## 📌 Important Observations

- Every recursive function must have a **base case** to prevent infinite recursion.
- The recursive solution closely follows the mathematical definition of factorial.
- The function calls are executed from top to bottom but return from bottom to top.
- Recursion is simple to implement but consumes stack memory.

---

## 🚀 Optimization

### Recursive Approach

- Easy to understand.
- Uses the call stack.
- Suitable for learning recursion.

**Time Complexity:** `O(N)`

**Space Complexity:** `O(N)`

---

### Iterative Approach

- Uses a loop instead of recursion.
- No recursive call stack.
- More memory efficient.

**Time Complexity:** `O(N)`

**Space Complexity:** `O(1)`

---

## 🎓 Learning Outcomes

After solving this problem, you will understand:

- How recursive functions work.
- The importance of defining a base case.
- How recursive calls are executed and returned.
- The difference between recursive and iterative implementations.
- How recursion utilizes the function call stack.

---

## 🔖 Tags

- Recursion
- Mathematics
- Call Stack
- Functions
- Basic Programming

---

### ⭐ If you found this explanation helpful, consider giving the repository a **Star**.
