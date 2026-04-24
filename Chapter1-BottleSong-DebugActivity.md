# 🐛 Debug Activity — Coding a Serious Business Application

**Chapter 1 | Head First Java, 3rd Edition**  
**Points:** 25

---

## Background

Below is a Java program that sings the classic children's song **"10 Green Bottles."**  
The code **compiles and runs without errors** — but the output is not 100% correct.

Your job is to:
1. Read the code carefully
2. Identify the flaw in the output
3. Fix the code in `BottleSong.java`
4. Answer the explanation questions below

---

## The Code

```java
public class BottleSong {
    public static void main(String[] args) {
        int bottlesNum = 10;
        String word = "bottles";

        while (bottlesNum > 0) {

            if (bottlesNum == 1) {
                word = "bottle"; // singular, as in ONE bottle.
            }

            System.out.println(bottlesNum + " green " + word + ", hanging on the wall");
            System.out.println(bottlesNum + " green " + word + ", hanging on the wall");
            System.out.println("And if one green bottle should accidentally fall,");
            bottlesNum = bottlesNum - 1;

            if (bottlesNum > 0) {
                System.out.println("There'll be " + bottlesNum +
                    " green " + word + ", hanging on the wall");
            } else {
                System.out.println("There'll be no green bottles, hanging on the wall");
            } // end else
        } // end while loop
    } // end main method
} // end class
```

---

## 🔍 Part 1 — Spot the Flaw (10 pts)

**Question 1** — Describe what the output flaw is. What line of output is incorrect, and what does it say vs. what it *should* say?  
> ___________

**Question 2** — Which specific line(s) of code are responsible for the flaw? Copy them here.  
> ___________

**Question 3** — Explain *why* the flaw happens. Think about the order in which the code runs.  
> ___________

---

## 🛠️ Part 2 — Fix It (10 pts)

Open the file `BottleSong.java` in this repo. Fix the code so the output is 100% correct, then commit and push your change.

**Hint:** Think carefully about *when* the `word` variable needs to be updated relative to when it is printed.

> **Describe your fix here** — what did you change and why?  
> ___________

---

## 🧠 Part 3 — Reflection Questions (5 pts)

**Question 4** — The code uses both a `while` loop and `if/else` statements. In one or two sentences, explain what each one is responsible for in this program.  
> ___________

**Question 5** — What is the difference between using `System.out.println()` and `System.out.print()` in this program? Would the song output change if you swapped them? Why or why not?  
> ___________

---

## Submission Checklist

- [ ] Part 1: All three questions answered in this file
- [ ] Part 2: `BottleSong.java` is fixed, committed, and pushed; fix described above
- [ ] Part 3: Both reflection questions answered
- [ ] All changes pushed to your GitHub Classroom repo before the deadline

---

## Grading Breakdown (25 pts)

| Item | Criteria | Points |
|---|---|---|
| Q1 — Describe the flaw | Correctly identifies the incorrect output line | 3 pts |
| Q2 — Identify the responsible code | Correct line(s) quoted | 3 pts |
| Q3 — Explain why the flaw occurs | Correct reasoning about code execution order | 4 pts |
| Code fix in `BottleSong.java` | Code compiles, runs, and produces correct output | 7 pts |
| Fix description | Accurately describes what was changed and why | 3 pts |
| Q4 — `while` vs `if/else` roles | Clear, correct explanation of both | 3 pts |
| Q5 — `print` vs `println` | Accurate description of difference and effect | 2 pts |
| **Total** | | **25 pts** |

> **Note:** If `BottleSong.java` compiles but still produces incorrect output, the code fix earns a maximum of 3/7.

---

*Based on Head First Java, 3rd Edition by Kathy Sierra & Bert Bates (O'Reilly Media, 2022), Chapter 1, p. 16.*
