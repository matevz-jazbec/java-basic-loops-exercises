# Labeled Pattern: Code-to-Output Exercise

The code is provided in the file: LabeledPattern.java. Your task is to read the code and predict what it prints for a given `n`, then run it to confirm your reasoning.

This exercise demonstrates a labeled loop and a diagonal skip: printing happens only to the left of the main diagonal; when the diagonal is reached, the program immediately moves to the next row.

Concepts practiced: reading code to infer behavior, labeled `continue`, nested loops, diagonal logic, parity, console output.

---

## What to do

1) Open `LabeledPattern.java` and carefully read the nested loops.  
2) For a tiny size (e.g., `n = 3`), hand-trace the loops and write down what would be printed on each row.  
3) Predict the output for `n = 7`.  
4) Run the program and compare your prediction with the actual output.  
5) In your own words, explain why the first printed line is empty and how the alternating characters are chosen.

---

## (Optional) Spoiler — sample output for `n = 7`

<details>
<summary>Show output (click to expand)</summary>

```
 
1
*2
3*3
*4*4
5*5*5
*6*6*6
```
</details>

---

## How to compile and run

From the `labeled-pattern` directory:

```bash
javac LabeledPattern.java
java LabeledPattern
```

In this implementation, the value of `n` may be fixed inside the code (e.g., `labeledPattern(7)`).  
If you prefer, adjust `main` to read `n` from command-line arguments and run as `java LabeledPattern <n>`.
