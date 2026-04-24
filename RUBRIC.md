# Grading Rubric — Chapter 1: Breaking the Surface

**Total Points: 100**

---

## Task 1 – Variable Declarations and Assignments (25 pts)

| Criteria | Full Credit | Partial Credit | No Credit |
|---|---|---|---|
| `int x` declared and assigned `3` | 5 pts | — | 0 pts |
| `String name` declared and assigned `"Dirk"` | 5 pts | — | 0 pts |
| `x` multiplied by `17` and reassigned | 5 pts | — | 0 pts |
| `System.out.print("x is " + x)` produces correct output | 5 pts | 2 pts (prints but wrong format) | 0 pts |
| `double d` declared and assigned `Math.random()` | 3 pts | — | 0 pts |
| At least one single-line comment (`//`) present | 2 pts | — | 0 pts |

---

## Task 2 – Loops (30 pts)

| Criteria | Full Credit | Partial Credit | No Credit |
|---|---|---|---|
| `while` loop uses correct condition (`x > 12`) | 5 pts | 2 pts (loop present, wrong condition) | 0 pts |
| `while` loop correctly decrements `x` by 1 | 5 pts | 2 pts (loop body present, wrong operation) | 0 pts |
| `for` loop initializes `i = 0`, condition `i < 10`, increment `i = i + 1` | 10 pts | 5 pts (loop present, 1–2 parts incorrect) | 0 pts |
| `for` loop prints `"i is now " + i` with each value on its own line | 10 pts | 5 pts (prints but missing newline or wrong format) | 0 pts |

---

## Task 3 – Conditional Branching (30 pts)

| Criteria | Full Credit | Partial Credit | No Credit |
|---|---|---|---|
| `if/else` checks `x == 10` correctly | 5 pts | 2 pts (structure correct, condition wrong) | 0 pts |
| `if` branch prints `"x must be 10"` | 5 pts | 2 pts (prints something, wrong text) | 0 pts |
| `else` branch prints `"x isn't 10"` | 5 pts | 2 pts (prints something, wrong text) | 0 pts |
| Second `if` uses `&&` with `x < 3` and `name.equals("Dirk")` | 8 pts | 4 pts (logic present, uses `==` instead of `.equals()`) | 0 pts |
| `"this line runs no matter what"` printed outside all conditionals | 7 pts | 3 pts (printed but inside a conditional block) | 0 pts |

---

## Task 4 – Syntax Rules and Code Quality (15 pts)

| Criteria | Full Credit | Partial Credit | No Credit |
|---|---|---|---|
| Code compiles without errors | 5 pts | — | 0 pts |
| All statements end with semicolons | 4 pts | 2 pts (1–2 missing) | 0 pts |
| All curly braces are matched and properly closed | 3 pts | 1 pt (minor brace issue) | 0 pts |
| At least 3 comments (`//`) present throughout the code | 3 pts | 1 pt (1–2 comments present) | 0 pts |

---

## Grade Scale

| Score | Letter Grade |
|---|---|
| 90–100 | A |
| 80–89 | B |
| 70–79 | C |
| 60–69 | D |
| Below 60 | F |

---

## Instructor Notes

- **Compile check first:** If the file does not compile, Tasks 1–3 are automatically capped at 50% for any task that has code present (the student attempted it). A non-compiling submission still earns Task 4 compile credit of 0.
- **`.class` file submitted:** Do not deduct points, but remind the student that only the `.java` source file is needed.
- **Typos in string literals:** Minor spelling differences in print statements (e.g., `"x isnt 10"` vs `"x isn't 10"`) should receive partial credit (2/5) unless the output exactly matches.
- **Use of `==` for String comparison:** Award partial credit and leave a comment explaining why `.equals()` is preferred.
