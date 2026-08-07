# Check if an Array is Sorted Using Recursion

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-brightgreen)
![Topic](https://img.shields.io/badge/Topic-Recursion-success)
![Status](https://img.shields.io/badge/Status-Solved-brightgreen)

---

## 📝 Problem Overview

Given an integer array, determine whether it is **strictly sorted in ascending order** using recursion.

An array is considered sorted if every element is smaller than the element immediately following it.

```text
arr[i] < arr[i + 1]
```

Return:

- `true` if the array is sorted.
- `false` otherwise.

---

## 🎯 Objective

Verify whether the given array is sorted by recursively comparing adjacent elements.

---

## 💡 Approach

The recursive approach checks one pair of adjacent elements at a time.

### Base Case

If the current index reaches the last element of the array, it means all previous comparisons were successful, so the array is sorted.

### Recursive Case

For each index:

- Compare the current element with the next element.
- If the current element is smaller, recursively check the remaining array.
- If not, immediately return `false`.

This process continues until either an unsorted pair is found or the end of the array is reached.

---

## 🔄 Algorithm

1. Start checking from index `0`.
2. If the current index is the last index, return `true`.
3. Compare the current element with the next element.
4. If the current element is smaller:
   - Recursively check the remaining elements.
5. Otherwise:
   - Return `false`.
6. Return the final result.

---

## 🌳 Recursion Flow

### Input

```text
arr = [1, 2, 3, 4, 5, 6]
```

```text
sorted(0)

1 < 2 ✔
      |
      ▼
sorted(1)

2 < 3 ✔
      |
      ▼
sorted(2)

3 < 4 ✔
      |
      ▼
sorted(3)

4 < 5 ✔
      |
      ▼
sorted(4)

5 < 6 ✔
      |
      ▼
sorted(5)

Reached Last Index

Return true
```

---

## 📖 Example 1

### Input

```text
arr = [1, 2, 3, 4, 5, 6]
```

### Output

```text
true
```

### Explanation

Every adjacent pair satisfies:

```text
1 < 2 < 3 < 4 < 5 < 6
```

Hence, the array is sorted.

---

## 📖 Example 2

### Input

```text
arr = [1, 3, 2, 4, 5]
```

### Output

```text
false
```

### Explanation

The comparison:

```text
3 < 2
```

is false, so the recursion terminates immediately.

---

## 📊 Complexity Analysis

| Complexity | Value |
|------------|-------|
| **Time Complexity** | **O(N)** |
| **Space Complexity** | **O(N)** |

### Time Complexity

Each element is compared exactly once.

```text
Time Complexity = O(N)
```

---

### Space Complexity

The recursion stack grows with the number of elements.

```text
Space Complexity = O(N)
```

---

## 🧠 Key Concepts

- Recursion
- Array Traversal
- Base Case
- Recursive Function
- Boolean Recursion

---

## 📌 Important Observations

- The algorithm stops immediately when an unsorted pair is found.
- Only adjacent elements are compared.
- The recursion depth is equal to the number of array elements.
- This implementation checks for **strictly increasing** order because it uses the `<` operator.
- To allow duplicate values (non-decreasing order), use `<=` instead of `<`.

---

## 🚀 Optimization

### Recursive Approach

- Simple and easy to understand.
- Uses the recursion call stack.

**Time Complexity:** `O(N)`

**Space Complexity:** `O(N)`

---

### Iterative Approach

- Traverse the array using a loop.
- Compare adjacent elements.

**Time Complexity:** `O(N)`

**Space Complexity:** `O(1)`

---

## 🎓 Learning Outcomes

After solving this problem, you will understand:

- How recursion can be used for array traversal.
- The importance of defining a proper base case.
- How recursive boolean conditions work.
- The difference between recursive and iterative solutions.
- How early termination improves efficiency when an unsorted pair is found.

---

## 🔖 Tags

- Recursion
- Arrays
- Traversal
- Boolean Logic
- Basic Programming

---

### ⭐ If you found this explanation helpful, consider giving the repository a **Star**.
