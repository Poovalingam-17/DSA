# Find All Occurrences of an Element Using Recursion

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-brightgreen)
![Topic](https://img.shields.io/badge/Topic-Recursion-success)
![Status](https://img.shields.io/badge/Status-Solved-brightgreen)

---

## 📝 Problem Overview

Given an integer array and a target element, find the **indices of all occurrences** of the target using recursion.

Unlike a normal Linear Search that returns only the first occurrence, this approach continues searching through the entire array and stores every index where the target appears.

---

## 🎯 Objective

Recursively traverse the array and return a list containing the indices of every occurrence of the target element.

---

## 💡 Approach

The solution uses recursion to process one array element at a time.

For each index:

1. Create a list to store matching indices.
2. Check whether the current element is equal to the target.
3. If it matches, add the current index to the list.
4. Recursively search the remaining part of the array.
5. Combine the indices returned by the recursive call with the current list.
6. Return the final list.

---

## 🔄 Algorithm

1. Start from index `0`.
2. If the index reaches the end of the array, return an empty list.
3. Create a list for the current recursive call.
4. Check whether `arr[ind]` equals the target.
5. If it matches, add `ind` to the list.
6. Recursively search from `ind + 1`.
7. Add all indices returned by the recursive call to the current list.
8. Return the list containing all matching indices.

---

## 🌳 Recursion Flow

### Input

```text
arr = [1, 2, 3, 1, 4]

target = 1
```

The recursive calls process the array as follows:

```text
Index     Value     Match?
  0         1        ✓
  1         2        ✗
  2         3        ✗
  3         1        ✓
  4         4        ✗
```

The matching indices are:

```text
[0, 3]
```

---

## 📖 Example 1

### Input

```text
arr = [1, 2, 3, 1, 4]

target = 1
```

### Output

```text
[0, 3]
```

### Explanation

The target `1` occurs at:

```text
Index 0 → 1
Index 3 → 1
```

Therefore, the result is:

```text
[0, 3]
```

---

## 📖 Example 2

### Input

```text
arr = [5, 2, 7, 9]

target = 3
```

### Output

```text
[]
```

### Explanation

The target `3` does not occur anywhere in the array, so an empty list is returned.

---

## 📖 Example 3

### Input

```text
arr = [2, 2, 2, 2]

target = 2
```

### Output

```text
[0, 1, 2, 3]
```

### Explanation

Every element matches the target, so all indices are included.

---

## 📊 Complexity Analysis

Let `N` be the size of the array and `K` be the number of occurrences of the target.

| Complexity | Value |
|------------|-------|
| **Time Complexity** | **O(N + K)** |
| **Space Complexity** | **O(N + K)** |

### Time Complexity

Every element is visited exactly once.

Additionally, matching indices are added to the result.

```text
Time Complexity = O(N + K)
```

Since `K ≤ N`, this can be simplified to:

```text
O(N)
```

---

### Space Complexity

The solution uses:

- Recursion stack of up to `O(N)`.
- Lists created during recursive calls.
- Result storage for `K` matching indices.

Therefore, the overall auxiliary/output-related space can grow up to:

```text
O(N + K)
```

---

## 🧠 Key Concepts

- Recursion
- Linear Search
- Array Traversal
- ArrayList
- Multiple Occurrences
- Recursive Result Combination

---

## 📌 Important Observations

- The recursion does not stop after finding the first match.
- Every index is checked.
- Each recursive call returns the matching indices from the remaining portion of the array.
- `addAll()` combines the results from deeper recursive calls.
- If there are no matching elements, an empty `ArrayList` is returned.

---

## 🔍 How the Result is Built

For:

```text
arr = [1, 2, 3, 1, 4]
target = 1
```

The recursion eventually reaches the end:

```text
[]
```

Then results are built while returning:

```text
Index 4 → []
Index 3 → [3]
Index 2 → [3]
Index 1 → [3]
Index 0 → [0, 3]
```

Final result:

```text
[0, 3]
```

---

## 🚀 Optimization

The current approach is useful for understanding how recursive results can be built and combined.

A more memory-efficient recursive approach can pass a single result list through the recursive calls instead of creating a new `ArrayList` at every level.

### Current Approach

- Creates a new list at each recursive call.
- Combines lists using `addAll()`.

### Optimized Recursive Approach

- Use one shared result list.
- Add matching indices directly to it.
- Avoid repeated list creation and merging.

Both approaches have **O(N)** traversal time, but the optimized version reduces unnecessary memory operations.

---

## 🎓 Learning Outcomes

After solving this problem, you will understand:

- How to find multiple occurrences recursively.
- How recursive calls can return collections of results.
- How to combine results using `ArrayList`.
- How recursion processes an array from left to right.
- The difference between finding the first occurrence and finding all occurrences.

---

## 🔖 Tags

- Recursion
- Linear Search
- Arrays
- ArrayList
- Searching
- Multiple Occurrences

---

### ⭐ If you found this explanation helpful, consider giving the repository a **Star**.
