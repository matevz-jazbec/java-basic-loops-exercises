# Java Basic Loop Patterns

A lightweight set of four beginner-friendly Java console exercises that draw simple console patterns using nested loops.
Each exercise is in its own folder with a short README and one `.java` file containing the solution.

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
│  └─ README.md           # task, example output, hints, run instructions
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
  *Solution:* `sandglass/Sandglass.java` · *Method:* `sandglass(int n)` · [README](sandglass/README.md)

- **Window** — rectangle with full border and a vertical bar in the center.  
  *Solution:* `window/Window.java` · *Method:* `window(int n)` (current demo uses `n = 3`) · [README](window/README.md)

- **Number Square** — `n × n` grid of numbers that increase from edges (uses `Math.min(row+1, col+1)`).  
  *Solution:* `number-square/NumberSquare.java` · *Method:* `numberSquare(int n)` · [README](number-square/README.md)

- **Labeled Pattern (code-to-output)** — read the given code, predict the output; shows a labeled `continue` and diagonal skip.  
  *Solution:* `labeled-pattern/LabeledPattern.java` · *Method:* `labeledPattern(int n)` · [README](labeled-pattern/README.md)

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

Each folder README explains the expected output and any notes (e.g., whether `n` is fixed in code or read from CLI arguments).
