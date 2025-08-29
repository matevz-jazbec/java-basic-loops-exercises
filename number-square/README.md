# Number Square

The solution is provided in the file: NumberSquare.java.  
Open it to see the Java implementation of the pattern.

This program prints an `n × n` square of numbers where each cell shows how far it is from the top/left edge,
producing a clear diagonal step pattern.

Concepts practiced: nested loops, 0-based vs 1-based indexing, `Math.min`, console output formatting.

---

## Task

Implement a method `numberSquare(int n)` that prints the following pattern:
- Values increase from left to right and from top to bottom.
- At each position `(row, col)`, print `min(row + 1, col + 1)`.
- When `n <= 0`, nothing should be printed (or print a short message).

---

## Example output

For `n = 7`:

```
1111111
1222222
1233333
1234444
1234555
1234566
1234567
```

---

## Hints

- Use 0-based indices for loops and convert to 1-based only when printing:
  ```java
  int value = Math.min(row + 1, col + 1);
  ```
- Print digits without spaces between them for a compact look.
- End each row with `System.out.println();`

---

## How to compile and run

From the `number-square` directory:

```bash
javac NumberSquare.java
java NumberSquare
```

In this implementation, the value of `n` may be fixed inside the code (e.g., `numberSquare(7)`).  
If you prefer, adjust `main` to read `n` from command-line arguments and run as `java NumberSquare <n>`.