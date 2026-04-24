# Chapter 1: Breaking the Surface — Java Syntax Practice

**Course:** Introduction to Java Programming  
**Unit:** Module 1 – Java Basics and Control Flow  
**Based on:** *Head First Java, 3rd Edition*, Chapter 1  

---

## 📚 Learning Objectives

By the end of this unit, you will be able to:

1. Write and run a basic Java program with a `main` method.
2. Declare and use variables of types `int`, `String`, and `double`.
3. Write a `while` loop and a `for` loop to repeat actions.
4. Write `if/else` conditional statements to branch logic.
5. Use `System.out.print()` and `System.out.println()` to display output.
6. Follow proper Java syntax rules (semicolons, curly braces, comments).

---

## 📖 Reading

Complete the assigned reading **before** starting each activity. Links will be posted here by your instructor.

| Assignment | Reading |
|---|---|
| MyFirstApp – Java Syntax Practice | *Link coming soon* |
| Sharpen Your Pencil 1 – Easy Write Java | *Link coming soon* |
| Sharpen Your Pencil 2 – Conditional Branching | *Link coming soon* |
| BottleSong – Debug Activity | *Link coming soon* |
| PhraseOMatic – Coding Activity | *Link coming soon* |

---

## 📋 Assignments

This repository contains **5 assignments** for Chapter 1. Complete them in order.

| # | File | Type | Description | Points |
|---|---|---|---|---|
| 1 | [`MyFirstApp.java`](MyFirstApp.java) | Coding | Write a program using variables, loops, and conditionals from scratch using TODOs | 100 pts |
| 2 | [`113_Look-How-Easy-It-Is-To-Write-Java_SharpenPencil1.md`](113_Look-How-Easy-It-Is-To-Write-Java_SharpenPencil1.md) | Written | Read Java code snippets and explain in plain English what each line does | 20 pts |
| 3 | [`118_Conidtional-Branching_SharpenPencil2.md`](118_Conidtional-Branching_SharpenPencil2.md) | Written + Fill-in | Fill in missing values in the Doobee program and answer explanation questions | 20 pts |
| 4 | [`119_Coding-A-Serious-Business-Application_Activity.md`](119_Coding-A-Serious-Business-Application_Activity.md) + [`BottleSong.java`](BottleSong.java) | Debug + Written | Find and fix the flaw in the BottleSong program; answer reflection questions | 25 pts |
| 5 | [`PhraseOMatic.java`](PhraseOMatic.java) | Coding | Build the Phrase-O-Matic program step by step using guided TODOs | Ungraded / Practice |

**Total Graded Points: 165 pts**

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

## 📝 Assignment 1 – MyFirstApp Java Syntax Practice (100 pts)

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

#### Expected Output

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

> **Note:** `System.out.print()` does not add a newline. Only `System.out.println()` adds a newline.

See [`RUBRIC.md`](RUBRIC.md) for the full grading breakdown.

---

## ✏️ Assignment 2 – Sharpen Your Pencil 1: Easy Write Java (20 pts)

Open [`SharpenYourPencil.md`](SharpenYourPencil.md). For each Java code snippet, write a plain-English explanation of what the line does. Three answers are already filled in as examples. Replace every `___________` with your own explanation, then commit and push.

---

## ✏️ Assignment 3 – Sharpen Your Pencil 2: Conditional Branching (20 pts)

Open [`Chapter1-conditionalbranching-SharpenPencil2.md`](Chapter1-conditionalbranching-SharpenPencil2.md). Fill in the two missing values in the `Doobee` program so it produces the correct output, then answer the four explanation questions. Commit and push when done.

---

## 🐛 Assignment 4 – Debug Activity: BottleSong (25 pts)

Open [`BottleSong.java`](BottleSong.java) — it compiles and runs, but the output has a flaw. Open [`Chapter1-BottleSong-DebugActivity.md`](Chapter1-BottleSong-DebugActivity.md) and follow the three parts: spot the flaw, fix the code, and answer the reflection questions. Push both files when done.

---

## 💻 Assignment 5 – Coding Activity: PhraseOMatic (Practice)

Open [`PhraseOMatic.java`](PhraseOMatic.java). Follow the five guided TODO steps to build a program that randomly generates business buzzword phrases. This is an ungraded practice activity — focus on getting it to compile and run.

---

## 🚀 Getting Started

1. **Accept this assignment** via the GitHub Classroom link provided by your instructor.
2. **Clone your personal repository** to your local machine:
   ```bash
   git clone <your-repo-url>
   ```
3. Work through the assignments in order (1 → 5).
4. Compile and test any `.java` files:
   ```bash
   javac FileName.java
   java FileName
   ```
5. Commit and push your work regularly:
   ```bash
   git add .
   git commit -m "Your message here"
   git push
   ```

---

## 📁 Repository Contents

| File | Description |
|---|---|
| `MyFirstApp.java` | Assignment 1 starter file |
| `SharpenYourPencil.md` | Assignment 2 fill-in activity |
| `Chapter1-conditionalbranching-SharpenPencil2.md` | Assignment 3 fill-in activity |
| `Chapter1-BottleSong-DebugActivity.md` | Assignment 4 debug questions |
| `BottleSong.java` | Assignment 4 buggy starter file |
| `PhraseOMatic.java` | Assignment 5 guided coding starter |
| `RUBRIC.md` | Grading rubric for Assignment 1 |
| `README.md` | This file |

---

## ⚠️ Submission Requirements

- Push all completed files to your GitHub Classroom repo before the deadline.
- Do **not** submit compiled `.class` files — only `.java` and `.md` source files will be graded.
- All `.java` files must **compile without errors** to receive full coding credit.

---

## 💡 Hints

- Revisit the *Syntax Fun* box from Chapter 1 for a quick reference on rules.
- Use `String.equals()` instead of `==` when comparing Strings.
- `Math.random()` returns a `double` between `0.0` (inclusive) and `1.0` (exclusive).
- If you get a compile error, read the error message carefully — it will tell you the line number.

---

*Based on Head First Java, 3rd Edition by Kathy Sierra & Bert Bates (O'Reilly Media, 2022).*
