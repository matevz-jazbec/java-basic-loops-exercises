# Java Pattern Printing Exercises

A set of beginner-friendly Java console exercises that draw simple console patterns using loops. These are study exercises from university coursework. Solutions implemented by me as part of coursework.

## Purpose

This repository is intended for **learning and practice**. Each exercise folder contains a short README with the original assignment. **Read the assignment first and try to solve it yourself**, then compare your approach with the provided Java solution. 

**What you'll practice**
- Nested `for` loops and iteration order
- Working with row/column indices
- Diagonals in grids (`i == j`, `i + j == n - 1`)
- Parameterizing size with `n`
- Clean console output

---

## Exercises (overview)

- **Sandglass** — symmetric hourglass of `*` with spaces elsewhere.  
  *Solution:* `sandglass/Sandglass.java` · [README](sandglass/README.md)

- **Window** — rectangle with full border and a vertical bar in the center.  
  *Solution:* `window/Window.java` · [README](window/README.md)

- **Number Square** — `n × n` grid of numbers that increase from edges (uses `Math.min(row+1, col+1)`).  
  *Solution:* `number-square/NumberSquare.java` · [README](number-square/README.md)

- **Labeled Pattern (code-to-output)** — read the given code, predict the output; shows a labeled `continue` and diagonal skip.  
  *Solution:* `labeled-pattern/LabeledPattern.java` · [README](labeled-pattern/README.md)

- **Chessboard** — prints an `n × n` chessboard, where each square is 2×2 characters.  
  *Solutions:* `chessboard/Chessboard1.java`, `chessboard/Chessboard2.java` · [README](chessboard/README.md)

---

## Quick start

Make sure you have Java installed (Java 17 or newer).  
Compile and run each exercise from its folder:

```bash
# Example: Sandglass
cd sandglass
javac Sandglass.java
java Sandglass
```

## Notes

- Each folder README contains the expected output and other notes.
- Each exercise is independent and does not use Java packages, so you can compile and run it directly from its folder.
