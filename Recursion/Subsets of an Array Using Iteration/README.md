# Generate All Subsets of an Array Using Iteration

---

## 📝 Problem Overview

Given an integer array, generate **all possible subsets** of the elements using an **iterative approach**.

For every element, there are two possibilities:

* Include the element
* Exclude the element

For example, given:

```text
[1, 2, 3]
```

the possible subsets are:

```text
[]
[1]
[2]
[1, 2]
[3]
[1, 3]
[2, 3]
[1, 2, 3]
```

The empty list represents the **empty subset**.

---

## 🎯 Objective

Generate all possible subsets of a given integer array using an **iterative subset expansion approach**.

The solution should:

* Generate every possible subset.
* Include the empty subset.
* Avoid recursion.
* Build new subsets from previously generated subsets.
* Store all generated subsets in a result list.

---

## 💡 Approach

The solution starts with an empty subset:

```text
[]
```

Then, each element of the array is processed one by one.

For every element, we take all the subsets that already exist and create new subsets by adding the current element.

For example:

```text
[1, 2, 3]
```

Initially:

```text
[]
```

After processing `1`:

```text
[]
[1]
```

After processing `2`:

```text
[]
[1]
[2]
[1, 2]
```

After processing `3`:

```text
[]
[1]
[2]
[1, 2]
[3]
[1, 3]
[2, 3]
[1, 2, 3]
```

The main idea is:

```text
Existing Subsets
       +
Existing Subsets + Current Element
       ↓
New Result
```

---

## 🔄 Algorithm

1. Create an empty result list.
2. Add an empty list to the result.
3. Traverse every element of the array.
4. Store the current size of the result list.
5. Iterate through only the subsets that existed before processing the current element.
6. Create a copy of each existing subset.
7. Add the current element to the copied subset.
8. Add the new subset to the result.
9. Continue until all elements are processed.
10. Return the complete list of subsets.

---

## 📖 Example 1

### Input

```text
[1, 2, 3]
```

### Output

```text
[[], [1], [2], [1, 2], [3], [1, 3], [2, 3], [1, 2, 3]]
```

### Explanation

Initially, the result contains:

```text
[]
```

When `1` is processed:

```text
[]
[1]
```

When `2` is processed:

```text
[]
[1]
[2]
[1, 2]
```

When `3` is processed:

```text
[]
[1]
[2]
[1, 2]
[3]
[1, 3]
[2, 3]
[1, 2, 3]
```

Therefore, the array contains:

```text
2^3 = 8
```

possible subsets.

---

## 📖 Example 2

### Input

```text
[1, 2]
```

### Output

```text
[[], [1], [2], [1, 2]]
```

There are:

```text
2^2 = 4
```

possible subsets.

---

## 📖 Example 3

### Input

```text
[1]
```

### Output

```text
[[], [1]]
```

There are:

```text
2^1 = 2
```

possible subsets.

---

## 📖 Example 4

### Input

```text
[]
```

### Output

```text
[[]]
```

The empty array has exactly one subset:

```text
[]
```

Therefore:

```text
2^0 = 1
```

---

## 🔍 Step-by-Step Example

Consider:

```text
[1, 2, 3]
```

### Initially

```text
[]
```

---

### Process `1`

Existing subset:

```text
[]
```

Add `1`:

```text
[1]
```

Result:

```text
[]
[1]
```

---

### Process `2`

Existing subsets:

```text
[]
[1]
```

Add `2` to each:

```text
[2]
[1, 2]
```

Result:

```text
[]
[1]
[2]
[1, 2]
```

---

### Process `3`

Existing subsets:

```text
[]
[1]
[2]
[1, 2]
```

Add `3` to each:

```text
[3]
[1, 3]
[2, 3]
[1, 2, 3]
```

Final result:

```text
[]
[1]
[2]
[1, 2]
[3]
[1, 3]
[2, 3]
[1, 2, 3]
```

---

## 🧠 Subset Expansion Pattern

The main idea behind this problem is the **Subset Expansion Pattern**.

For every new element:

```text
             Current Element
                    |
          ┌─────────┴─────────┐
          ↓                   ↓
     Keep Existing       Add Element
       Subsets            To Subsets
          ↓                   ↓
          └─────────┬─────────┘
                    ↓
              New Subsets
```

For example:

```text
Existing:

[]
[1]
[2]
[1,2]
```

When `3` is processed:

```text
[3]
[1,3]
[2,3]
[1,2,3]
```

The final result contains both the old and new subsets.

---

## 🛑 Why Store the Current Size?

Before processing every element, we store the current size of the result.

For example:

```text
result.size() = 4
```

before processing `3`.

The four existing subsets are:

```text
[]
[1]
[2]
[1,2]
```

We should only process these four subsets.

After generating:

```text
[3]
[1,3]
[2,3]
[1,2,3]
```

the newly created subsets should **not** be processed again during the same iteration.

Otherwise, the current element could be added multiple times.

Therefore, storing the original size is important.

---

## 🔄 Iterative Flow

```text
                    Start
                      ↓
                Add Empty Set
                      ↓
                Process Element
                      ↓
             Store Current Size
                      ↓
             Get Existing Subsets
                      ↓
            Add Current Element
                      ↓
              Create New Subset
                      ↓
               Add To Result
                      ↓
             More Elements?
                /          \
              Yes           No
               ↓             ↓
        Process Next      Return Result
```

---

## 📊 Number of Subsets

For an array containing `N` elements:

```text
Number of Subsets = 2^N
```

| Number of Elements | Number of Subsets |
| -----------------: | ----------------: |
|                  0 |                 1 |
|                  1 |                 2 |
|                  2 |                 4 |
|                  3 |                 8 |
|                  4 |                16 |
|                  5 |                32 |
|                 10 |              1024 |
|                  N |               2^N |

---

## 🔢 Why Are There `2^N` Subsets?

Every element has exactly two choices:

```text
Include
Exclude
```

For example, for three elements:

```text
Element 1 → 2 choices
Element 2 → 2 choices
Element 3 → 2 choices
```

Therefore:

```text
2 × 2 × 2 = 8
```

In general:

```text
2^N
```

possible subsets are generated.

---

## 📈 Complexity Analysis

Let:

```text
N = Number of elements in the array
```

### Time Complexity

There are:

```text
2^N
```

possible subsets.

Each subset can contain up to `N` elements, and copying a subset can take up to `O(N)` time.

Therefore:

```text
O(N × 2^N)
```

---

### Space Complexity

The result contains:

```text
2^N
```

subsets.

Each subset can contain up to `N` elements.

Therefore:

```text
O(N × 2^N)
```

space is required for storing the output.

The iterative approach does not require a recursion stack.

---

## 📊 Complexity Summary

| Complexity                     | Value          |
| ------------------------------ | -------------- |
| **Time Complexity**            | **O(N × 2^N)** |
| **Output Space**               | **O(N × 2^N)** |
| **Additional Iterative Space** | **O(N)**       |

---

## 🆚 Iterative vs Recursive Approach

| Feature         | Recursive Approach | Iterative Approach     |
| --------------- | ------------------ | ---------------------- |
| Technique       | Include / Exclude  | Subset Expansion       |
| Recursion       | Yes                | No                     |
| Recursion Stack | O(N)               | O(1)                   |
| Time Complexity | O(N × 2^N)         | O(N × 2^N)             |
| Output Space    | O(N × 2^N)         | O(N × 2^N)             |
| Main Idea       | Decision Tree      | Build Existing Subsets |

Both approaches generate:

```text
2^N
```

subsets.

---

## 📌 Important Observations

* The empty subset is added initially.
* Every new element doubles the number of subsets.
* Existing subsets are preserved.
* A new copy is created before adding the current element.
* The current result size must be stored before generating new subsets.
* There are `2^N` subsets for `N` elements.
* The solution does not require recursion.
* The result is constructed incrementally.
* The order of subsets depends on the order in which elements are processed.

---

## 🧩 Important DSA Pattern

This problem demonstrates the **Subset Expansion Pattern**.

The general idea is:

```text
Existing Result
       +
Existing Result with Current Element
       ↓
Updated Result
```

This pattern is useful for:

* Subsets
* Combinations
* Backtracking
* Combinatorial problems
* Bitmasking
* Decision-making problems

---

## 🎓 Learning Outcomes

After solving this problem, you will understand:

* How to generate subsets using iteration.
* How to build new subsets from existing subsets.
* Why the number of subsets is `2^N`.
* Why a copy of each subset is required.
* Why the current result size must be stored.
* How iterative subset generation works.
* How exponential output affects time and space complexity.
* How `ArrayList` can be used to dynamically construct subsets.
* The difference between recursive and iterative subset generation.

---

## 💼 Interview Perspective

This problem is useful for understanding **subset generation and combinatorial algorithms**.

### Common Interview Questions

**1. How many subsets does an array with `N` elements have?**

```text
2^N
```

---

**2. Why is the empty subset added initially?**

Because the empty subset is the starting point for generating all other subsets.

---

**3. Why do we store the current result size?**

To ensure that only the subsets that existed before processing the current element are used.

---

**4. Why do we create a new list?**

To avoid modifying an already existing subset.

---

**5. What happens after adding one new element?**

The number of subsets doubles:

```text
K → 2K
```

---

**6. What is the time complexity?**

```text
O(N × 2^N)
```

---

**7. What is the space complexity?**

```text
O(N × 2^N)
```

because all generated subsets are stored.

---

**8. Does this approach use recursion?**

No.

The solution uses an iterative subset expansion technique.

---

## 🏆 Key Takeaway

The core idea is:

```text
Start with:

[]

For every element:

Existing Subsets
        +
Existing Subsets + Current Element
        ↓
New Result
```

For example:

```text
[]
 ↓
[] [1]
 ↓
[] [1] [2] [1,2]
 ↓
[] [1] [2] [1,2] [3] [1,3] [2,3] [1,2,3]
```

Therefore:

```text
N Elements
     ↓
2^N Subsets
```

Understanding this technique gives you a strong foundation for:

* Subset problems
* Combination problems
* Backtracking
* Recursive subset generation
* Bitmasking
* Combinatorial problems
* DSA problem solving

---

## 🔖 Tags

* Arrays
* Subsets
* Iteration
* ArrayList
* Combinations
* Backtracking
* Java
* Data Structures
* Algorithms
* DSA
* Problem Solving

---

### ⭐ If you found this explanation helpful, consider giving the repository a **Star**.
