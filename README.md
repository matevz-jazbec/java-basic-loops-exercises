# Java Basic Loop Patterns

A lightweight set of four beginner-friendly Java console exercises that draw simple console patterns using nested loops.
Each exercise is in its own folder with a short README and one `.java` file containing the solution.
These are study exercises from university coursework. Solutions implemented by me as part of coursework.

**What you'll practice**
- Nested `for` loops and iteration order
- Working with row/column indices
- Diagonals in grids (`i == j`, `i + j == n - 1`)
- Parameterizing size with `n`
- Clean console output

---

## Repository structure

```
/
├─ sandglass/
│  ├─ Sandglass.java      # solution
│  └─ README.md           # task, example output, run instructions
├─ window/
│  ├─ Window.java
│  └─ README.md
├─ number-square/
│  ├─ NumberSquare.java
│  └─ README.md
├─ labeled-pattern/
│  ├─ LabeledPattern.java
│  └─ README.md
├─ LICENSE
├─ .gitignore
└─ README.md              # (this file)
```

Each exercise is independent and does not use Java packages, so you can compile and run it directly from its folder.

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

Each folder README contains the expected output and other notes.
