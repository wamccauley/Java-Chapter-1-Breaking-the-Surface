# Chapter 1: Breaking the Surface — Java Syntax Practice

**Course:** Introduction to Java Programming  
**Unit:** Module 1 – Java Basics and Control Flow  
**Based on:** *Head First Java, 3rd Edition*, Chapter 1  
**Points:** 100

---

## 📚 Learning Objectives

By the end of this assignment, you will be able to:

1. Write and run a basic Java program with a `main` method.
2. Declare and use variables of types `int`, `String`, and `double`.
3. Write a `while` loop and a `for` loop to repeat actions.
4. Write `if/else` conditional statements to branch logic.
5. Use `System.out.print()` and `System.out.println()` to display output.
6. Follow proper Java syntax rules (semicolons, curly braces, comments).

---

## 🗺️ Background

In Chapter 1 of *Head First Java*, you learned that your code can tell the JVM to do three things:

| # | What it does | Syntax used |
|---|---|---|
| 1 | **Do something** | Declarations, assignments, method calls |
| 2 | **Do something again and again** | `while` loops, `for` loops |
| 3 | **Do something under a condition** | `if/else` statements |

Every Java statement ends with a semicolon (`;`). Classes and methods are wrapped in curly braces `{ }`. Comments start with `//`.

---

## 📝 Assignment Instructions

You have been given a **starter file** — `MyFirstApp.java` — that contains the class structure and `TODO` comments. Your job is to fill in the code so that the program compiles and produces the correct output.

### Tasks

**Task 1 – Variable Declarations and Assignments (25 pts)**  
Inside the `main` method, declare and assign the following variables:
- An `int` named `x` with a value of `3`
- A `String` named `name` with a value of `"Dirk"`
- Multiply `x` by `17` and store the result back in `x`
- Print `"x is "` followed by the value of `x` using `System.out.print()`
- Declare a `double` named `d` and assign it a random number using `Math.random()`
- Add at least one single-line comment (`//`) explaining what one of your lines does

**Task 2 – Loops (30 pts)**  
- Write a `while` loop that subtracts `1` from `x` as long as `x` is greater than `12`
- Write a `for` loop that starts `i` at `0`, runs while `i` is less than `10`, and increments `i` by `1` each time
  - Inside the `for` loop, print `"i is now "` followed by the value of `i` on its own line

**Task 3 – Conditional Branching (30 pts)**  
- Write an `if/else` statement that:
  - Prints `"x must be 10"` if `x` equals `10`
  - Prints `"x isn't 10"` otherwise
- Write a second `if` statement that prints `"Gently"` if `x` is less than `3` **AND** `name` equals `"Dirk"` (use `.equals()` for String comparison)
- After both conditionals, print `"this line runs no matter what"`

**Task 4 – Syntax Rules (15 pts)**  
Review your code and make sure:
- Every statement ends with a semicolon
- All blocks are closed with matching curly braces
- You have added at least **three comments** total across your code explaining what different sections do
- Your code compiles and runs without errors

---

## ✅ Expected Output

When your program runs, it should produce output similar to this (the random number will vary):

```
x is 51i is now 0
i is now 1
i is now 2
i is now 3
i is now 4
i is now 5
i is now 6
i is now 7
i is now 8
i is now 9
x isn't 10this line runs no matter what
```

> **Note:** `System.out.print()` does not add a newline automatically. Only `System.out.println()` adds a newline. Your output spacing will match the example above.

---

## 🚀 Getting Started

1. **Accept this assignment** via the GitHub Classroom link provided by your instructor.
2. **Clone your personal repository** to your local machine:
   ```bash
   git clone <your-repo-url>
   ```
3. Open `MyFirstApp.java` in your IDE (VS Code, IntelliJ, etc.).
4. Read the `TODO` comments and complete each task.
5. Compile and test your program:
   ```bash
   javac MyFirstApp.java
   java MyFirstApp
   ```
6. Once it works, commit and push your changes:
   ```bash
   git add MyFirstApp.java
   git commit -m "Complete Chapter 1 syntax assignment"
   git push
   ```

---

## 📁 Repository Contents

| File | Description |
|---|---|
| `MyFirstApp.java` | Your starter file — **edit this file only** |
| `README.md` | Assignment instructions (this file) |
| `RUBRIC.md` | Detailed point breakdown and grading criteria |

---

## ⚠️ Submission Requirements

- Push your completed `MyFirstApp.java` to your GitHub Classroom repo before the deadline.
- Do **not** submit the compiled `.class` file — only your `.java` source file will be graded.
- Your code must **compile without errors** to receive full credit on Tasks 1–3.

---

## 💡 Hints

- Revisit the *Syntax Fun* box from Chapter 1 (your PDF handout) for a quick reference on rules.
- Use `String.equals()` instead of `==` when comparing Strings.
- `Math.random()` returns a `double` between `0.0` (inclusive) and `1.0` (exclusive).
- If you get a compile error, read the error message carefully — it will tell you the line number.

---

*Assignment based on Head First Java, 3rd Edition by Kathy Sierra & Bert Bates (O'Reilly Media, 2022).*
