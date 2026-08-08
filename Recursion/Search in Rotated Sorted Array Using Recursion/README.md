# Search in Rotated Sorted Array Using Recursion

---

## 📝 Problem Overview

Given a sorted array that has been rotated at an unknown position, find the index of a target element.

For example, a sorted array:

```text
[1, 2, 3, 4, 5, 6, 7, 8]
```

can be rotated to:

```text
[5, 6, 7, 8, 1, 2, 3, 4]
```

The goal is to efficiently locate the target using **Recursive Binary Search**.

If the target does not exist, return `-1`.

---

## 🎯 Objective

Find the target element in a rotated sorted array with:

- **O(log N)** time complexity
- Recursive Binary Search
- No need to restore the array to sorted order

---

## 💡 Approach

The main observation is that even though the entire array is rotated, **at least one half of the current search range will always be sorted**.

For every recursive call:

1. Calculate the middle index.
2. Check whether the middle element is the target.
3. Determine which half is sorted.
4. Check whether the target lies within the sorted half.
5. Recursively search the appropriate half.

This allows us to eliminate half of the search space at every step.

---

## 🔄 Algorithm

1. If `start > end`, return `-1`.
2. Calculate the middle index.
3. If `arr[mid] == target`, return `mid`.
4. Check whether the left half is sorted:
   ```text
   arr[start] <= arr[mid]
   ```
5. If the left half is sorted:
   - If the target is smaller than `arr[mid]`, search the left half.
   - Otherwise, search the right half.
6. If the left half is not sorted, the right half is sorted.
7. If the target is greater than `arr[mid]`, search the right half.
8. Otherwise, search the left half.
9. Continue recursively until the target is found or the search range becomes invalid.

---

## 🌳 Example

### Input

```text
arr = [5, 6, 7, 8, 1, 2, 3, 4]

target = 8
```

### Search Process

```text
[5, 6, 7, 8, 1, 2, 3, 4]
 ↑           ↑           ↑
start       mid         end

mid = 3
arr[mid] = 8
```

Since:

```text
arr[mid] == target
```

the target is found immediately.

### Output

```text
3
```

---

## 📖 Example 1

### Input

```text
arr = [5, 6, 7, 8, 1, 2, 3, 4]

target = 8
```

### Output

```text
3
```

### Explanation

The target `8` is present at index `3`.

---

## 📖 Example 2

### Input

```text
arr = [5, 6, 7, 8, 1, 2, 3, 4]

target = 2
```

### Output

```text
5
```

The algorithm identifies the sorted half and recursively searches the appropriate portion.

---

## 📖 Example 3

### Input

```text
arr = [5, 6, 7, 8, 1, 2, 3, 4]

target = 10
```

### Output

```text
-1
```

The target does not exist, so eventually:

```text
start > end
```

and `-1` is returned.

---

## 🔍 Identifying the Sorted Half

Consider:

```text
[5, 6, 7, 8, 1, 2, 3, 4]
```

Suppose:

```text
start = 0
mid = 3
```

Then:

```text
arr[start] = 5
arr[mid]   = 8
```

Since:

```text
5 <= 8
```

the left half is sorted:

```text
[5, 6, 7, 8]
```

The other half is:

```text
[1, 2, 3, 4]
```

The algorithm uses this information to determine which side can contain the target.

---

## 🧠 Decision Logic

### Case 1: Left Half is Sorted

Condition:

```text
arr[start] <= arr[mid]
```

Then determine whether the target belongs to the left half.

If it does:

```text
search(start, mid - 1)
```

Otherwise:

```text
search(mid + 1, end)
```

---

### Case 2: Right Half is Sorted

If the left half is not sorted, the right half must be sorted.

If:

```text
target > arr[mid]
```

search the right half.

Otherwise:

```text
search(start, mid - 1)
```

---

## 📊 Complexity Analysis

| Complexity | Value |
|------------|-------|
| **Time Complexity** | **O(log N)** |
| **Space Complexity** | **O(log N)** |

### Time Complexity

The search range is divided approximately in half at every recursive call.

```text
N → N/2 → N/4 → N/8 → ...
```

Therefore:

```text
O(log N)
```

### Space Complexity

Because recursion is used, the call stack can grow up to logarithmic depth.

```text
O(log N)
```

---

## 🚀 Optimization

### Linear Search

Check every element one by one.

```text
Time: O(N)
Space: O(1)
```

### Recursive Rotated Binary Search

Uses the sorted-half property.

```text
Time: O(log N)
Space: O(log N)
```

### Iterative Rotated Binary Search

The same logic can be implemented using a loop.

```text
Time: O(log N)
Space: O(1)
```

The iterative version is more memory efficient because it does not use the recursion stack.

---

## 📌 Important Observations

- The input array must be a rotated version of a sorted array.
- At least one half of the current search range is sorted.
- The condition `arr[start] <= arr[mid]` identifies a sorted left half.
- The algorithm does not need to physically rotate or sort the array.
- The search space is reduced after every recursive call.

> **Note:** This implementation assumes the array contains distinct elements. Duplicate values require additional handling because it may become impossible to determine the sorted half unambiguously.

---

## 🧠 Key Concepts

- Recursion
- Binary Search
- Rotated Sorted Array
- Divide and Conquer
- Search Space Reduction
- Sorted Half Detection

---

## 🎓 Learning Outcomes

After solving this problem, you will understand:

- How Binary Search works on rotated arrays.
- How to identify a sorted portion of an array.
- How to choose the correct search range.
- How recursion reduces the search space.
- How to achieve logarithmic search complexity.

---

## 🔖 Tags

- Binary Search
- Recursion
- Arrays
- Rotated Array
- Searching
- Divide and Conquer

---

### ⭐ If you found this explanation helpful, consider giving the repository a **Star**.
