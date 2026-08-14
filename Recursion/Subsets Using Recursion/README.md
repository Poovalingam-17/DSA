# Subsets of a String Using Recursion

---

## 📝 Problem Overview

Given a string, generate **all possible subsets** of its characters using recursion.

A subset can be created by making a decision for every character:

```text
Include the character
        OR
Exclude the character
```

For example, for:

```text
abc
```

the possible subsets are:

```text
[a, b, c, ab, ac, bc, abc, ""]
```

The empty string represents the **empty subset**.

---

## 🎯 Objective

The objective is to generate all possible subsets of a given string using:

* Recursion
* Backtracking-style decision making
* Include/Exclude technique
* ArrayList
* String processing

For a string of length `N`, the total number of subsets is:

```text
2^N
```

---

## 💡 Approach

At every recursive step, the first character of the remaining string is considered.

There are two choices:

```text
1. Include the character
2. Exclude the character
```

For example, for:

```text
abc
```

the first character is:

```text
a
```

We create two recursive branches:

```text
Include a → abc
Exclude a → bc
```

The same process is repeated for every remaining character.

---

## 🔄 Algorithm

1. Start with an empty processed string.
2. Take the first character from the remaining string.
3. Create one recursive call by including the character.
4. Create another recursive call by excluding the character.
5. Continue until the remaining string becomes empty.
6. When the remaining string is empty, add the processed string to the result.
7. Combine the results from both recursive branches.
8. Return the complete list of subsets.

---

## 🌳 Recursion Tree

For:

```text
abc
```

the recursion tree can be represented as:

```text
                    abc
                   /   \
                include  exclude
                  /       \
                 a         ""
                / \       /  \
              ab   a     b    ""
             / \  / \   / \ 
           abc ab ac  a bc b c ""
```

A more conceptual representation is:

```text
                       ""
                    /      \
                  a          ""
                /   \       /  \
              ab     a     b    ""
             / \    / \   / \
           abc ab  ac  a bc  b
```

Every level represents a decision about one character.

---

## 🧠 Include / Exclude Pattern

The most important concept in this problem is the **Include/Exclude Pattern**.

For every character:

```text
              Character
              /       \
         Include      Exclude
```

For example:

```text
             a
           /   \
        take   skip
         a       ""
```

Then the same decision is made for the next character.

This creates a binary recursion tree.

---

## 📖 Example

### Input

```text
abc
```

### Output

```text
[abc, ab, ac, a, bc, b, c, ""]
```

The exact ordering may depend on the order in which the recursive branches are processed.

The important point is that every possible subset is generated exactly once.

---

## 📊 Number of Subsets

For a string containing `N` characters:

```text
Number of subsets = 2^N
```

### Examples

| Input Length | Number of Subsets |
| ------------ | ----------------- |
| 0            | 1                 |
| 1            | 2                 |
| 2            | 4                 |
| 3            | 8                 |
| 4            | 16                |
| 5            | 32                |
| N            | 2^N               |

For:

```text
abc
```

there are:

```text
2^3 = 8
```

subsets.

---

## 🔍 Why Are There 2^N Subsets?

Every character has exactly two choices:

```text
Include
Exclude
```

For `N` characters:

```text
2 × 2 × 2 × ... × 2
```

with `N` decisions.

Therefore:

```text
2^N
```

possible subsets are generated.

---

## 🛑 Base Case

The recursion stops when the remaining string becomes empty:

```text
up.isEmpty()
```

At this point, all characters have been considered.

The processed string represents one complete subset.

Therefore, it is added to the result list.

---

## 🔁 Recursive Flow

The complete recursive process can be visualized as:

```text
                Start
                  ↓
          Remaining String
                  ↓
          Is String Empty?
             /          \
           Yes           No
            ↓             ↓
       Add Subset      Get Character
                          ↓
                  ┌───────┴───────┐
                  ↓               ↓
               Include         Exclude
                  ↓               ↓
              Recursion       Recursion
                  ↓               ↓
                  └───────┬───────┘
                          ↓
                    Combine Results
```

---

## 🧩 Example With Two Characters

Consider:

```text
ab
```

The choices are:

```text
                 ""
               /    \
              a      ""
             / \    /  \
           ab   a  b   ""
```

Therefore:

```text
ab
a
b
""
```

There are:

```text
2^2 = 4
```

subsets.

---

## 📈 Complexity Analysis

Let:

```text
N = Length of the string
```

### Time Complexity

There are:

```text
2^N
```

possible subsets.

Additionally, constructing and storing each subset can take up to `O(N)` time.

Therefore, the total complexity can be considered:

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

Each subset can contain up to `N` characters.

Therefore, the output space is:

```text
O(N × 2^N)
```

The recursion depth is:

```text
O(N)
```

---

## 📊 Complexity Summary

| Complexity      | Value      |
| --------------- | ---------- |
| Time            | O(N × 2^N) |
| Output Space    | O(N × 2^N) |
| Recursion Depth | O(N)       |

---

## 🧠 Key Concepts

* Recursion
* Backtracking
* Subsets
* Include/Exclude Pattern
* Recursion Tree
* Binary Decision Tree
* String Manipulation
* ArrayList
* Divide and Conquer

---

## 📌 Important Observations

* Every character has two possible decisions.
* One branch includes the character.
* The other branch excludes the character.
* The recursion continues until all characters are processed.
* The empty string is also a valid subset.
* A string with `N` characters has `2^N` subsets.
* The recursion tree has approximately `2^N` leaf nodes.
* The solution does not require generating permutations.
* Subsets do not depend on the order of the selected characters.

---

## 🆚 Subsets vs Substrings vs Subsequences

These concepts are often confused.

### Subset

A subset selects elements without requiring them to be contiguous.

For:

```text
abc
```

Examples:

```text
ac
bc
abc
```

---

### Substring

A substring must contain **contiguous** characters.

For:

```text
abc
```

Examples:

```text
a
b
c
ab
bc
abc
```

But:

```text
ac
```

is not a substring because `a` and `c` are not adjacent.

---

### Subsequence

A subsequence maintains the original relative order but does not require characters to be contiguous.

For:

```text
abc
```

Examples:

```text
a
b
c
ab
ac
bc
abc
```

Therefore:

```text
Subset → Order does not matter
Subsequence → Relative order is maintained
Substring → Characters must be contiguous
```

---

## 🔄 Recursion Pattern

This problem introduces a very important recursion pattern:

```text
                 Problem
                    |
              Make a Choice
               /         \
           Choice 1     Choice 2
              |             |
          Recursion     Recursion
              |             |
              └──────┬──────┘
                     ↓
                  Result
```

This pattern appears in many DSA problems involving:

* Subsets
* Subsequences
* Combinations
* Permutations
* Backtracking
* Decision problems

---

## 🎓 Learning Outcomes

After solving this problem, you will understand:

* How recursion can generate all possible combinations.
* How the Include/Exclude technique works.
* How recursion trees represent decisions.
* Why `2^N` subsets are possible.
* How to define a recursive base case.
* How to combine results from recursive calls.
* The difference between subsets, subsequences, and substrings.
* How to analyze exponential algorithms.

---

## 💼 Interview Perspective

The Include/Exclude technique is a fundamental pattern in DSA interviews.

### Common Interview Questions

**1. How many subsets does a set of N elements have?**

```text
2^N
```

---

**2. Why are there two recursive calls?**

Because each character has two choices:

```text
Include
Exclude
```

---

**3. What is the base case?**

When all characters have been processed:

```text
Remaining String = ""
```

---

**4. Is the empty subset valid?**

Yes.

The empty subset is always considered a valid subset.

---

**5. What is the time complexity?**

Approximately:

```text
O(N × 2^N)
```

when the cost of constructing each subset is included.

---

**6. What is the recursion depth?**

```text
O(N)
```

---

**7. Which DSA pattern is used?**

```text
Include / Exclude
```

This is a fundamental recursion and backtracking pattern.

---

## 🏆 Key Takeaway

The most important idea is:

```text
For every character:

        Include
           OR
        Exclude
```

For example:

```text
                    abc
                   /   \
              Include  Exclude
                 a        ""
                / \      /  \
             Include Exclude...
```

This decision process continues for every character.

Therefore:

```text
N characters
      ↓
2 choices per character
      ↓
2^N subsets
```

Understanding this pattern provides a strong foundation for solving:

* Subset problems
* Subsequence problems
* Combination problems
* Permutation problems
* Backtracking problems
* Recursion problems
* Dynamic Programming decision problems

---

## 🔖 Tags

* Recursion
* Backtracking
* Subsets
* Include Exclude
* Subsequence
* Recursion Tree
* String
* ArrayList
* Java
* Data Structures
* Algorithms
* DSA
* Problem Solving

---

### ⭐ If you found this explanation helpful, consider giving the repository a **Star**.
