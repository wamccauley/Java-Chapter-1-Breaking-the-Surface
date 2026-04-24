# ✏️ Sharpen Your Pencil — Look How Easy It Is to Write Java

**Chapter 1 | Head First Java, 3rd Edition**  
**Points:** 20  

---

## Instructions

Below is a series of Java code snippets. **Your job is to write what each line of code is doing in plain English.**  
Some answers have already been filled in for you as examples — complete the rest of the blanks.

Edit this file, replace every `___________` with your explanation, then commit and push your changes.

---

## The Code

```java
int size = 27;
```
**What is this line doing?**  
✅ *Already answered:* `Declare an integer variable named 'size' and give it the value 27`

---

```java
String name = "Fido";
```
**What is this line doing?**  
> ___________

---

```java
Dog myDog = new Dog(name, size);
```
**What is this line doing?**  
> ___________

---

```java
x = size - 5;
```
**What is this line doing?**  
> ___________

---

```java
if (x < 15) myDog.bark(8);
```
**What is this line doing?**  
✅ *Already answered:* `If x (value of 22) is less than 15, tell the dog to bark 8 times`

---

```java
while (x > 3) {
    myDog.play();
}
```
**What is this block doing?**  
> ___________

---

```java
int[] numList = {2, 4, 6, 8};
```
**What is this line doing?**  
> ___________

---

```java
System.out.print("Hello");
```
**What is this line doing?**  
✅ *Already answered:* `Print out "Hello"... probably at the command line`

---

```java
System.out.print("Dog: " + name);
```
**What is this line doing?**  
> ___________

---

```java
String num = "8";
int z = Integer.parseInt(num);
```
**What are these two lines doing together?**  
> ___________

---

```java
try {
    readTheFile("myFile.txt");
} catch (FileNotFoundException ex) {
    System.out.print("File not found.");
}
```
**What is this block doing?**  
> ___________

---

## Submission Checklist

- [ ] All blanks (`___________`) have been replaced with your own explanation
- [ ] Explanations are written in plain English (no need to copy Java syntax)
- [ ] File is saved, committed, and pushed to your GitHub Classroom repo

---

## Grading Breakdown (20 pts)

| # | Code Snippet | Points |
|---|---|---|
| 1 | `String name = "Fido";` | 2 pts |
| 2 | `Dog myDog = new Dog(name, size);` | 2 pts |
| 3 | `x = size - 5;` | 2 pts |
| 4 | `while (x > 3) { myDog.play(); }` | 2 pts |
| 5 | `int[] numList = {2, 4, 6, 8};` | 2 pts |
| 6 | `System.out.print("Dog: " + name);` | 2 pts |
| 7 | `String num = "8"; int z = Integer.parseInt(num);` | 4 pts |
| 8 | `try/catch` block | 4 pts |
| **Total** | | **20 pts** |

> **Grading note:** Full credit requires a correct, plain-English explanation. Partial credit (1 pt) is awarded for answers that show understanding but are incomplete or imprecise.

---

*Based on Head First Java, 3rd Edition by Kathy Sierra & Bert Bates (O'Reilly Media, 2022), Chapter 1, p. 5.*
