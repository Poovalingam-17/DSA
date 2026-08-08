# Print Reverse Triangle Pattern Using Recursion

---

## 📝 Problem Overview

Given a number of rows, print a **reverse right-angled triangle pattern** using recursion instead of traditional nested loops.

For the given input:

```text
rows = 4
```

the expected output is:

```text
* * * *
* * *
* *
*
```

The solution uses recursion with two parameters:

- `row` — represents the current row.
- `col` — represents the current column.

---

## 🎯 Objective

Print a reverse triangular star pattern using recursion with:

- Recursive row traversal
- Recursive column traversal
- No nested loops
- Proper base case
- Efficient recursive state management

---

## 💡 Approach

The recursive function processes the pattern one row at a time.

Unlike a normal triangle where the number of stars increases, this pattern starts with the maximum number of stars and decreases by one for every new row.

For each row:

1. Start the column from `0`.
2. Print `*` while `row > col`.
3. Recursively move to the next column.
4. When `row == col`, the current row is complete.
5. Move to the next row by decreasing `row`.
6. Reset `col` to `0`.
7. Stop when `row == 0`.

This approach demonstrates how nested loops can be replaced with recursive calls.

---

## 🔄 Algorithm

1. Start with:
   ```text
   row = 4
   col = 0
   ```
2. Check the base condition:
   ```text
   if row == 0
   ```
   Stop the recursion.
3. If:
   ```text
   row > col
   ```
   print a star.
4. Recursively increase the column:
   ```text
   col + 1
   ```
5. When:
   ```text
   row == col
   ```
   the current row is completed.
6. Move to the next row:
   ```text
   row - 1
   ```
7. Reset the column:
   ```text
   col = 0
   ```
8. Continue until all rows are printed.

---

## 🌳 Recursion Flow

For:

```text
rows = 4
```

the recursive execution can be visualized as:

```text
Row 4
├── Column 0 → *
├── Column 1 → *
├── Column 2 → *
└── Column 3 → *

Row 3
├── Column 0 → *
├── Column 1 → *
└── Column 2 → *

Row 2
├── Column 0 → *
└── Column 1 → *

Row 1
└── Column 0 → *

Row 0
└── Stop
```

The number of stars decreases after every completed row.

---

## 📖 Example 1

### Input

```text
rows = 4
```

### Output

```text
* * * *
* * *
* *
*
```

### Explanation

The first row contains `4` stars.

The second row contains `3` stars.

The third row contains `2` stars.

The fourth row contains `1` star.

Therefore, the final pattern is:

```text
* * * *
* * *
* *
*
```

---

## 📖 Example 2

### Input

```text
rows = 3
```

### Output

```text
* * *
* *
*
```

### Explanation

The number of stars decreases from `3` to `1`.

---

## 📖 Example 3

### Input

```text
rows = 1
```

### Output

```text
*
```

### Explanation

There is only one row, containing one star.

---

## 🔍 Understanding the Two Recursive Parameters

The recursive function uses two parameters:

```text
row
col
```

### `row`

The `row` parameter represents the number of stars that should be printed in the current row.

For example:

```text
row = 4
```

means the current row requires:

```text
* * * *
```

After completing the row, the value of `row` is decreased:

```text
row - 1
```

Therefore, the next row contains one fewer star.

---

### `col`

The `col` parameter represents the current position inside the row.

Initially:

```text
col = 0
```

For every star printed, the column increases:

```text
col + 1
```

When:

```text
row == col
```

the current row is complete.

The column is then reset to:

```text
col = 0
```

for the next row.

---

## 🧠 Decision Logic

### Case 1: Base Case

```text
row == 0
```

The recursion stops.

This means all rows have been processed.

---

### Case 2: Print Star

Condition:

```text
row > col
```

There are still stars remaining in the current row.

Therefore:

```text
Print "*"
```

and recursively move to the next column.

---

### Case 3: Move to the Next Row

Condition:

```text
row == col
```

The current row has printed the required number of stars.

The algorithm then:

1. Moves to the next line.
2. Decreases `row`.
3. Resets `col` to `0`.

Conceptually:

```text
row--
col = 0
```

---

## 🔍 Pattern Structure

For `N = 4`, the number of stars printed in each row is:

```text
4
3
2
1
```

This can be represented as:

```text
N
N - 1
N - 2
...
1
```

Therefore, the total number of stars is:

```text
N + (N - 1) + (N - 2) + ... + 1
```

---

## 📊 Complexity Analysis

Let `N` be the number of rows.

The total number of stars printed is:

```text
N + (N - 1) + (N - 2) + ... + 1
```

Using the summation formula:

```text
N(N + 1) / 2
```

Therefore, the number of operations grows quadratically.

### Time Complexity

```text
O(N²)
```

### Space Complexity

The recursive function creates recursive calls for processing the columns and rows.

The maximum recursion depth can grow proportionally to the total number of pattern elements.

Therefore:

```text
O(N²)
```

---

## 🚀 Optimization

The recursive approach is primarily useful for understanding recursion and learning how nested loops can be replaced with recursive calls.

### Recursive Approach

```text
Time Complexity  : O(N²)
Space Complexity : O(N²)
```

### Iterative Approach

Using nested loops:

```text
Time Complexity  : O(N²)
Space Complexity : O(1)
```

The iterative approach is more memory efficient because it does not require recursive stack space.

However, the recursive solution provides better practice for understanding:

- Base cases
- Recursive calls
- Multiple parameters
- State management
- Nested recursion

---

## 📌 Important Observations

- The pattern contains exactly `N` rows.
- The first row contains `N` stars.
- Every subsequent row contains one fewer star.
- The final row contains exactly `1` star.
- `row` controls the number of stars required in the current row.
- `col` tracks the current star position.
- When `row > col`, a star is printed.
- When `row == col`, the current row is completed.
- The column is reset to `0` before processing the next row.
- The `row == 0` condition acts as the base case.
- No nested loops are required.

---

## 🧠 Key Concepts

- Recursion
- Pattern Printing
- Recursive Traversal
- Base Case
- Row and Column Processing
- Multiple Recursive Parameters
- State Management
- Nested Recursion

---

## 🎓 Learning Outcomes

After solving this problem, you will understand:

- How to print a pattern using recursion.
- How to print a reverse triangle recursively.
- How to use multiple parameters in a recursive function.
- How to control rows and columns using recursion.
- How to define a proper base case.
- How nested loops can be represented using recursive calls.
- How to analyze the time and space complexity of recursive pattern problems.

---

## 💼 Interview Perspective

This type of problem is useful for understanding the fundamentals of recursion.

### Common Interview Questions

**1. What is the base case?**

```text
row == 0
```

The recursion stops when there are no more rows to process.

---

**2. What does `row` represent?**

`row` represents the number of stars that need to be printed in the current row.

---

**3. What does `col` represent?**

`col` represents the current position within the row.

---

**4. Why is `col` reset to `0`?**

After completing one row, the next row must start from its first column.

---

**5. What is the time complexity?**

```text
O(N²)
```

because the total number of stars printed is approximately:

```text
N(N + 1) / 2
```

---

**6. Can this problem be solved without recursion?**

Yes. Nested loops can solve the problem iteratively with:

```text
Time Complexity  : O(N²)
Space Complexity : O(1)
```

---

## 🏆 Key Takeaway

The main idea behind this recursive pattern is:

```text
Start with N stars
       ↓
Print stars recursively
       ↓
Complete the current row
       ↓
Decrease the row size
       ↓
Reset column
       ↓
Repeat
       ↓
Stop when row becomes 0
```

For `N = 4`:

```text
* * * *
* * *
* *
*
```

This problem is a good foundation for understanding how recursion can replace nested loops and how multiple parameters can be used to maintain recursive state.

---

## 🔖 Tags

- Recursion
- Pattern Printing
- Java
- Recursive Traversal
- Problem Solving
- Beginner
- Recursion Practice
- Star Pattern

---

### ⭐ If you found this explanation helpful, consider giving the repository a **Star**.
