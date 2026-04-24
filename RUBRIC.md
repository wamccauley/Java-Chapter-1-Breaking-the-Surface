# Grading Rubric — Chapter 1: Breaking the Surface

**Total Graded Points: 165 pts**

| # | Assignment | File(s) | Points |
|---|---|---|---|
| 1 | Java Syntax Practice | `MyFirstApp.java` | 100 pts |
| 2 | Sharpen Your Pencil 1 | `Chapter1-easywritejava-SharpenPencil1.md` | 20 pts |
| 3 | Sharpen Your Pencil 2 | `Chapter1-conditionalbranching-SharpenPencil2.md` | 20 pts |
| 4 | Debug Activity: BottleSong | `Chapter1-BottleSong-DebugActivity.md` + `BottleSong.java` | 25 pts |
| 5 | Coding Activity: PhraseOMatic | `PhraseOMatic.java` | Practice (ungraded) |

---

## Assignment 1 — Java Syntax Practice (100 pts)

### Task 1 – Variable Declarations and Assignments (25 pts)

| Criteria | Full Credit | Partial Credit | No Credit |
|---|---|---|---|
| `int x` declared and assigned `3` | 5 pts | — | 0 pts |
| `String name` declared and assigned `"Dirk"` | 5 pts | — | 0 pts |
| `x` multiplied by `17` and reassigned | 5 pts | — | 0 pts |
| `System.out.print("x is " + x)` produces correct output | 5 pts | 2 pts (prints but wrong format) | 0 pts |
| `double d` declared and assigned `Math.random()` | 3 pts | — | 0 pts |
| At least one single-line comment (`//`) present | 2 pts | — | 0 pts |

### Task 2 – Loops (30 pts)

| Criteria | Full Credit | Partial Credit | No Credit |
|---|---|---|---|
| `while` loop uses correct condition (`x > 12`) | 5 pts | 2 pts (loop present, wrong condition) | 0 pts |
| `while` loop correctly decrements `x` by 1 | 5 pts | 2 pts (loop body present, wrong operation) | 0 pts |
| `for` loop initializes `i = 0`, condition `i < 10`, increment `i = i + 1` | 10 pts | 5 pts (loop present, 1–2 parts incorrect) | 0 pts |
| `for` loop prints `"i is now " + i` with each value on its own line | 10 pts | 5 pts (prints but missing newline or wrong format) | 0 pts |

### Task 3 – Conditional Branching (30 pts)

| Criteria | Full Credit | Partial Credit | No Credit |
|---|---|---|---|
| `if/else` checks `x == 10` correctly | 5 pts | 2 pts (structure correct, condition wrong) | 0 pts |
| `if` branch prints `"x must be 10"` | 5 pts | 2 pts (prints something, wrong text) | 0 pts |
| `else` branch prints `"x isn't 10"` | 5 pts | 2 pts (prints something, wrong text) | 0 pts |
| Second `if` uses `&&` with `x < 3` and `name.equals("Dirk")` | 8 pts | 4 pts (logic present, uses `==` instead of `.equals()`) | 0 pts |
| `"this line runs no matter what"` printed outside all conditionals | 7 pts | 3 pts (printed but inside a conditional block) | 0 pts |

### Task 4 – Syntax Rules and Code Quality (15 pts)

| Criteria | Full Credit | Partial Credit | No Credit |
|---|---|---|---|
| Code compiles without errors | 5 pts | — | 0 pts |
| All statements end with semicolons | 4 pts | 2 pts (1–2 missing) | 0 pts |
| All curly braces are matched and properly closed | 3 pts | 1 pt (minor brace issue) | 0 pts |
| At least 3 comments (`//`) present throughout the code | 3 pts | 1 pt (1–2 comments present) | 0 pts |

#### Instructor Notes — Assignment 1
- **Compile check first:** If the file does not compile, Tasks 1–3 are automatically capped at 50% for any task that has code present. A non-compiling submission earns 0 for the Task 4 compile criterion.
- **`.class` file submitted:** Do not deduct points, but remind the student that only `.java` is needed.
- **Typos in string literals:** Minor spelling differences should receive partial credit (2/5) unless output exactly matches.
- **Use of `==` for String comparison:** Award partial credit and leave a comment explaining why `.equals()` is preferred.

---

## Assignment 2 — Sharpen Your Pencil 1: Easy Write Java (20 pts)

| # | Code Snippet | Full Credit | Partial Credit | No Credit |
|---|---|---|---|---|
| 1 | `String name = "Fido";` | 2 pts | 1 pt (partially correct) | 0 pts |
| 2 | `Dog myDog = new Dog(name, size);` | 2 pts | 1 pt (partially correct) | 0 pts |
| 3 | `x = size - 5;` | 2 pts | 1 pt (partially correct) | 0 pts |
| 4 | `while (x > 3) { myDog.play(); }` | 2 pts | 1 pt (partially correct) | 0 pts |
| 5 | `int[] numList = {2, 4, 6, 8};` | 2 pts | 1 pt (partially correct) | 0 pts |
| 6 | `System.out.print("Dog: " + name);` | 2 pts | 1 pt (partially correct) | 0 pts |
| 7 | `String num = "8"; int z = Integer.parseInt(num);` | 4 pts | 2 pts (one line explained correctly) | 0 pts |
| 8 | `try/catch` block | 4 pts | 2 pts (partial understanding shown) | 0 pts |

#### Instructor Notes — Assignment 2
- Answers must be in plain English. Copying Java syntax as the answer earns no credit.
- Accept reasonable paraphrasing; exact wording is not required.
- The three pre-filled answers (`int size`, `if myDog.bark`, `System.out.print("Hello")`) are not graded.

---

## Assignment 3 — Sharpen Your Pencil 2: Conditional Branching (20 pts)

| Item | Criteria | Full Credit | Partial Credit | No Credit |
|---|---|---|---|---|
| Blank 1 — `while (x < ____)` | Correct value entered | 4 pts | — | 0 pts |
| Blank 2 — `if (x == ____)` | Correct value entered | 4 pts | — | 0 pts |
| Q1 — Loop iteration count + reasoning | Correct count with explanation | 3 pts | 1 pt (correct count, no reasoning) | 0 pts |
| Q2 — Why extra "Do" prints | Correct explanation of `if` after loop | 3 pts | 1 pt (partially correct) | 0 pts |
| Q3 — `println` vs `print` output difference | Accurate description of newline difference | 3 pts | 1 pt (partially correct) | 0 pts |
| Q4 — Value of `x` at `if` + reasoning | Correct value with explanation | 3 pts | 1 pt (correct value, no reasoning) | 0 pts |

#### Instructor Notes — Assignment 3
- **Blank 1 answer:** `3` (loop runs while x < 3, so x = 1 and x = 2 → 2 iterations)
- **Blank 2 answer:** `3` (after the loop, x == 3, so the if fires and prints the final "Do")
- Partial credit for blanks: not applicable — the value is either right or wrong.
- Partial credit for explanation questions awarded when correct reasoning is shown but the answer is incomplete.

---

## Assignment 4 — Debug Activity: BottleSong (25 pts)

| Item | Criteria | Full Credit | Partial Credit | No Credit |
|---|---|---|---|---|
| Q1 — Describe the flaw | Correctly identifies the incorrect output line | 3 pts | 1 pt (vague or incomplete) | 0 pts |
| Q2 — Identify the responsible code | Correct line(s) quoted | 3 pts | 1 pt (identifies area but not specific line) | 0 pts |
| Q3 — Explain why the flaw occurs | Correct reasoning about execution order | 4 pts | 2 pts (partially correct reasoning) | 0 pts |
| Code fix in `BottleSong.java` | Compiles, runs, and produces correct output | 7 pts | 3 pts (compiles but output still wrong) | 0 pts |
| Fix description | Accurately describes what was changed and why | 3 pts | 1 pt (describes change but not why) | 0 pts |
| Q4 — `while` vs `if/else` roles | Clear, correct explanation of both | 3 pts | 1 pt (explains one correctly) | 0 pts |
| Q5 — `print` vs `println` difference | Accurate description and effect on output | 2 pts | 1 pt (partially correct) | 0 pts |

#### Instructor Notes — Assignment 4
- **The flaw:** When `bottlesNum` decrements from `2` to `1`, the final `println` in the `if (bottlesNum > 0)` block prints `"There'll be 1 green bottles"` (plural) because `word` is not updated to `"bottle"` until the next loop iteration.
- **The fix:** Add `if (bottlesNum == 1) { word = "bottle"; }` before the final `println` inside the `if (bottlesNum > 0)` block.
- Award full code fix credit only if the output is completely correct for all verses.

---

## Assignment 5 — PhraseOMatic (Ungraded Practice)

This activity is ungraded. Students should attempt all 5 steps and get the program to compile and run. Instructors may optionally check for completion and award participation credit at their discretion.

---

## Grade Scale

| Score (% of total) | Letter Grade |
|---|---|
| 90–100% | A |
| 80–89% | B |
| 70–79% | C |
| 60–69% | D |
| Below 60% | F |

---

*Rubric covers Head First Java, 3rd Edition by Kathy Sierra & Bert Bates (O'Reilly Media, 2022), Chapter 1.*
