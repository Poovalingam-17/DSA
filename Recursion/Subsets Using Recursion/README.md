# Generate All Subsets of a String Using Recursion

---

## 📝 Problem Overview

Given a string, generate all possible subsets of the characters using **recursion**.

For every character, we have two choices:

- Include the character
- Exclude the character

For example, given:

```text
abc
```

the possible subsets are:

```text
abc
ab
ac
a
bc
b
c
""
```

The empty string represents the **empty subset**.

---

## 🎯 Objective

Generate all possible subsets of a given string using a recursive **Include/Exclude** approach.

The solution should:

- Generate every possible subset.
- Include the empty subset.
- Use recursion to explore all possibilities.
- Store the generated subsets in a list.

---

## 💡 Approach

The solution uses two strings:

```text
p  → Processed characters
up → Unprocessed characters
```

Initially:

```text
p  = ""
up = "abc"
```

At every recursive call, the first character of `up` is considered.

There are two possibilities:

```text
1. Include the character
2. Exclude the character
```

For example, if the current character is `a`:

```text
                 a
               /   \
          Include  Exclude
             |        |
             a        ""
```

Both possibilities are recursively explored.

---

## 🔄 Algorithm

1. Start with:
   ```text
   p = ""
   up = input string
   ```

2. Check whether `up` is empty.

3. If `up` is empty:
   - Add `p` to the result.
   - Return the result.

4. Take the first character from `up`.

5. Create the **include** branch by adding the character to `p`.

6. Create the **exclude** branch without adding the character.

7. Recursively process the remaining characters.

8. Combine the results from both recursive calls.

9. Return the complete list of subsets.

---

## 🌳 Recursion Tree

For the input:

```text
abc
```

the recursion tree can be represented as:

```text
                         ""
                      /      \
                     a        ""
                   /   \     /   \
                 ab     a   b     ""
                / \    / \ / \
             abc  ab  ac  a bc  b
```

Each level represents one character.

At every level, we make two decisions:

```text
             Character
             /       \
        Include      Exclude
```

This continues until all characters have been processed.

---

## 📖 Example 1

### Input

```text
abc
```

### Output

```text
[abc, ab, ac, a, bc, b, c, ""]
```

### Explanation

For each character, we either include it or exclude it.

There are 3 characters:

```text
N = 3
```

Therefore, the total number of subsets is:

```text
2^3 = 8
```

---

## 📖 Example 2

### Input

```text
ab
```

### Output

```text
[ab, a, b, ""]
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
a
```

### Output

```text
[a, ""]
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
""
```

### Output

```text
[""]
```

The empty string has exactly one subset: the empty subset.

Therefore:

```text
2^0 = 1
```

---

## 🔍 Step-by-Step Example

Consider:

```text
abc
```

Initially:

```text
p  = ""
up = "abc"
```

The first character is:

```text
a
```

We have two choices:

```text
Include a → p = "a"
Exclude a → p = ""
```

Now process `b`.

From `"a"`:

```text
ab
a
```

From `""`:

```text
b
""
```

Now process `c`.

The final subsets are:

```text
abc
ab
ac
a
bc
b
c
""
```

---

## 🧠 Include / Exclude Pattern

The main idea behind this problem is the **Include/Exclude Pattern**.

For every character:

```text
                Character
                 /      \
                /        \
           Include      Exclude
              |            |
          Take it       Skip it
```

This pattern creates a binary recursion tree.

For `N` characters:

```text
2 choices
    ↓
for every character
    ↓
2^N possibilities
```

---

## 🛑 Base Case

The recursion stops when:

```text
up.isEmpty()
```

This means there are no more characters left to process.

At this point:

```text
p
```

contains one complete subset.

Therefore, it is added to the result list.

---

## 🔄 Recursive Flow

```text
                    Start
                      ↓
                Process String
                      ↓
              Is String Empty?
                 /          \
               Yes           No
                ↓             ↓
          Add Current      Get Character
             Subset             ↓
                         ┌──────┴──────┐
                         ↓             ↓
                      Include       Exclude
                         ↓             ↓
                     Recursion     Recursion
                         ↓             ↓
                         └──────┬──────┘
                                ↓
                         Combine Results
```

---

## 📊 Number of Subsets

For a string containing `N` characters:

```text
Number of Subsets = 2^N
```

| Number of Characters | Number of Subsets |
|---------------------:|------------------:|
| 0 | 1 |
| 1 | 2 |
| 2 | 4 |
| 3 | 8 |
| 4 | 16 |
| 5 | 32 |
| 10 | 1024 |
| N | 2^N |

---

## 🔢 Why Are There `2^N` Subsets?

Every character has exactly two choices:

```text
Include
Exclude
```

For example, for three characters:

```text
Character 1 → 2 choices
Character 2 → 2 choices
Character 3 → 2 choices
```

Therefore:

```text
2 × 2 × 2 = 8
```

In general:

```text
2^N
```

---

## 📈 Complexity Analysis

Let:

```text
N = Length of the input string
```

### Time Complexity

There are:

```text
2^N
```

possible subsets.

Each subset can contain up to `N` characters.

Therefore, considering the cost of creating and storing the subsets:

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

Therefore:

```text
O(N × 2^N)
```

space is required for the output.

The recursion stack requires:

```text
O(N)
```

additional space.

---

## 📊 Complexity Summary

| Complexity | Value |
|------------|-------|
| **Time Complexity** | **O(N × 2^N)** |
| **Output Space** | **O(N × 2^N)** |
| **Recursion Stack** | **O(N)** |

---

## 🆚 Subset vs Subsequence vs Substring

These three concepts are often confused.

### Subset

A subset selects elements without requiring them to be contiguous.

For:

```text
abc
```

examples include:

```text
ac
bc
abc
```

---

### Subsequence

A subsequence maintains the original relative order but does not require characters to be adjacent.

For:

```text
abc
```

`ac` is a valid subsequence.

---

### Substring

A substring must contain contiguous characters.

For:

```text
abc
```

valid substrings include:

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

is not a substring.

---

## 📌 Important Observations

- Every character has exactly two choices.
- One branch includes the character.
- The other branch excludes the character.
- The recursion continues until all characters are processed.
- The empty string is a valid subset.
- A string of length `N` has `2^N` subsets.
- The recursion tree is a binary tree.
- Every leaf of the recursion tree represents one subset.
- The solution uses the **Include/Exclude** recursion pattern.
- The original order of characters is maintained in the generated subsets.

---

## 🧩 Important Recursion Pattern

This problem demonstrates a fundamental recursion pattern:

```text
                    Problem
                       ↓
                  Make a Choice
                   /         \
                  /           \
             Choice 1       Choice 2
                ↓               ↓
            Recursion       Recursion
                ↓               ↓
                └───────┬───────┘
                        ↓
                     Combine
```

This pattern is widely used in:

- Subsets
- Subsequences
- Combinations
- Permutations
- Backtracking
- Decision problems

---

## 🎓 Learning Outcomes

After solving this problem, you will understand:

- How to generate subsets using recursion.
- How the Include/Exclude technique works.
- How to construct a recursion tree.
- Why the number of subsets is `2^N`.
- How to define a recursive base case.
- How to combine results from multiple recursive calls.
- How exponential algorithms work.
- The difference between subsets, subsequences, and substrings.
- How recursion is used in backtracking problems.

---

## 💼 Interview Perspective

This problem is useful for understanding recursion and is a common foundation for more advanced backtracking problems.

### Common Interview Questions

**1. How many subsets does a string with `N` characters have?**

```text
2^N
```

---

**2. Why are there two recursive calls?**

Because every character has two choices:

```text
Include
Exclude
```

---

**3. What is the base case?**

When the remaining string becomes empty:

```text
up = ""
```

---

**4. Is the empty subset valid?**

Yes.

The empty subset is always a valid subset.

---

**5. What is the time complexity?**

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

**7. Which important DSA pattern is used?**

```text
Include / Exclude
```

---

## 🏆 Key Takeaway

The core idea is:

```text
For every character:

        Include
           OR
        Exclude
```

Therefore:

```text
N Characters
      ↓
2 Choices for Each Character
      ↓
2^N Subsets
```

Understanding the **Include/Exclude** pattern gives you a strong foundation for:

- Subset problems
- Subsequence problems
- Combination problems
- Permutation problems
- Backtracking
- Recursive decision problems
- Dynamic Programming

---

## 🔖 Tags

- Recursion
- Backtracking
- Subsets
- Include Exclude
- Recursion Tree
- String
- ArrayList
- Java
- Data Structures
- Algorithms
- DSA
- Problem Solving

---

### ⭐ If you found this explanation helpful, consider giving the repository a **Star**.
