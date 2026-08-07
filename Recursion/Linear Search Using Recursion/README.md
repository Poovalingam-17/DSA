# Linear Search Using Recursion

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-brightgreen)
![Topic](https://img.shields.io/badge/Topic-Recursion-success)
![Status](https://img.shields.io/badge/Status-Solved-brightgreen)

---

## 📝 Problem Overview

Given an integer array and a target element, find the **index** of the target using **Linear Search with Recursion**.

If the target element exists in the array, return its index; otherwise, return `-1`.

Unlike Binary Search, the array **does not need to be sorted**.

---

## 🎯 Objective

Search for the target element by recursively checking each element of the array from left to right until the element is found or the array ends.

---

## 💡 Approach

The recursive solution examines one element at a time.

### Base Case

- If the current index reaches the length of the array, the target is not present.
- Return `-1`.

### Recursive Case

- Compare the current element with the target.
- If they are equal, return the current index.
- Otherwise, recursively search the next index.

The recursion stops immediately once the target is found.

---

## 🔄 Algorithm

1. Start searching from index `0`.
2. If the current index reaches the end of the array, return `-1`.
3. Compare the current element with the target.
4. If they are equal, return the current index.
5. Otherwise, recursively search the next index.
6. Return the result.

---

## 🌳 Recursion Flow

### Input

```text
arr = [1, 2, 3, 4, 5, 6]

target = 5
```

```text
LinearSearch(0)

arr[0] = 1

1 != 5
      |
      ▼
LinearSearch(1)

arr[1] = 2

2 != 5
      |
      ▼
LinearSearch(2)

arr[2] = 3

3 != 5
      |
      ▼
LinearSearch(3)

arr[3] = 4

4 != 5
      |
      ▼
LinearSearch(4)

arr[4] = 5

Target Found ✔

Return 4
```

---

## 📖 Example 1

### Input

```text
arr = [1, 2, 3, 4, 5, 6]

target = 5
```

### Output

```text
4
```

### Explanation

The target element `5` is found at index `4`.

---

## 📖 Example 2

### Input

```text
arr = [1, 2, 3, 4, 5, 6]

target = 10
```

### Output

```text
-1
```

### Explanation

The target element is not present in the array.

---

## 📊 Complexity Analysis

| Complexity | Value |
|------------|-------|
| **Time Complexity** | **O(N)** |
| **Space Complexity** | **O(N)** |

### Time Complexity

In the worst case, every element is checked once.

```text
Time Complexity = O(N)
```

---

### Space Complexity

The recursion stack grows by one level for each recursive call.

```text
Space Complexity = O(N)
```

---

## 🧠 Key Concepts

- Recursion
- Linear Search
- Array Traversal
- Base Case
- Recursive Function

---

## 📌 Important Observations

- Linear Search works on both **sorted** and **unsorted** arrays.
- The search stops immediately when the target is found.
- If the target is absent, the recursion continues until the end of the array.
- Recursive Linear Search is simple but uses additional stack space.
- An iterative implementation is generally more memory efficient.

---

## 🚀 Optimization

### Recursive Linear Search

- Easy to understand.
- Uses recursive function calls.

**Time Complexity:** `O(N)`

**Space Complexity:** `O(N)`

---

### Iterative Linear Search

- Traverse the array using a loop.
- Avoids recursive call overhead.

**Time Complexity:** `O(N)`

**Space Complexity:** `O(1)`

---

## 🎓 Learning Outcomes

After solving this problem, you will understand:

- How recursion can be applied to searching algorithms.
- The importance of defining a proper base case.
- How recursive calls progress through an array.
- The difference between recursive and iterative Linear Search.
- When Linear Search is preferred over Binary Search.

---

## 🔖 Tags

- Recursion
- Linear Search
- Arrays
- Searching
- Basic Programming

---

### ⭐ If you found this explanation helpful, consider giving the repository a **Star**.
