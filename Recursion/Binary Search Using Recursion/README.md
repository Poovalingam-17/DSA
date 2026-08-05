# Binary Search Using Recursion

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-brightgreen)
![Topic](https://img.shields.io/badge/Topic-Binary%20Search-success)
![Status](https://img.shields.io/badge/Status-Solved-brightgreen)

---

## 📝 Problem Overview

Given a **sorted array** of integers and a target value, find the index of the target using the **Binary Search** algorithm.

If the target exists in the array, return its index; otherwise, return `-1`.

---

## 🎯 Objective

Efficiently search for a target element in a sorted array by repeatedly dividing the search space into two halves.

---

## 💡 Approach

Binary Search works by comparing the target element with the middle element of the current search range.

- If the middle element is equal to the target, return its index.
- If the target is smaller, continue searching in the left half.
- If the target is larger, continue searching in the right half.

The recursive process continues until either the target is found or the search range becomes empty.

---

## 🔄 Algorithm

1. Initialize the search range using the first and last indices.
2. Find the middle index.
3. Compare the middle element with the target.
4. If they are equal, return the index.
5. If the target is smaller, recursively search the left half.
6. If the target is larger, recursively search the right half.
7. If the search range becomes invalid (`start > end`), return `-1`.

---

## 🌳 Recursion Tree

### Example

```text
Array = [1, 2, 3, 4, 5]
Target = 5
```

```text
                 [1,2,3,4,5]
                 start=0 end=4
                      |
                   mid = 2
                   value = 3
                      |
               Target > 3
                      |
                 Search Right
                      |
                  [4,5]
               start=3 end=4
                      |
                   mid = 3
                   value = 4
                      |
               Target > 4
                      |
                  Search Right
                      |
                    [5]
               start=4 end=4
                      |
                   mid = 4
                   value = 5
                      |
                  Target Found
```

---

## 📖 Example

### Input

```text
Array = [1, 2, 3, 4, 5]

Target = 5
```

### Output

```text
4
```

### Explanation

The target value `5` is found at index `4`.

---

## 📊 Complexity Analysis

| Complexity | Value |
|------------|-------|
| **Time Complexity** | **O(log N)** |
| **Space Complexity** | **O(log N)** |

### Time Complexity

At each recursive call, the search space is reduced by half.

```text
N → N/2 → N/4 → N/8 → ...
```

Therefore,

```text
Time Complexity = O(log N)
```

---

### Space Complexity

Since recursion is used, the call stack grows with the height of the recursion tree.

```text
Space Complexity = O(log N)
```

---

## 🧠 Key Concepts

- Binary Search
- Recursion
- Divide and Conquer
- Sorted Array
- Logarithmic Search

---

## 📌 Important Observations

- Binary Search only works on **sorted arrays**.
- The search space is halved after every comparison.
- Recursive Binary Search uses the call stack to manage subproblems.
- If the array is not sorted, the algorithm does not produce correct results.

---

## 🚀 Optimization

### Linear Search

- Check every element one by one.

**Time Complexity:** `O(N)`

---

### Recursive Binary Search

- Divide the search space into halves.
- Continue recursively until the target is found.

**Time Complexity:** `O(log N)`

**Space Complexity:** `O(log N)`

---

### Iterative Binary Search

- Uses a loop instead of recursion.
- Eliminates recursive call stack.

**Time Complexity:** `O(log N)`

**Space Complexity:** `O(1)`

---

## 🎓 Learning Outcomes

After solving this problem, you will understand:

- How the Divide and Conquer strategy works.
- Why Binary Search is significantly faster than Linear Search.
- How recursion can simplify Binary Search implementation.
- The importance of maintaining valid search boundaries.
- The difference between recursive and iterative Binary Search.

---

## 🔖 Tags

- Binary Search
- Recursion
- Divide and Conquer
- Searching
- Arrays

---

### ⭐ If you found this explanation helpful, consider giving the repository a **Star**.
