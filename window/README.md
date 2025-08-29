# Window

The solution is provided in the file Window.java.  
Open it to see the Java implementation of the pattern.

This program draws a rectangular "window" with a full border and a vertical bar in the center.  
The figure uses `*` for the border and the center bar, and spaces elsewhere.

Concepts practiced: nested loops, parameterized dimensions, borders, center column, console output.

---

## Task

Implement a method `window(int n)` that prints a window pattern with:
- Height = `n + 2`
- Width  = `3 * n`
- Top and bottom rows are a full border of `*`.
- Interior rows have `*` at the first and last column, and a `*` at the center column.
- All other positions are spaces.

When `n <= 0`, nothing should be printed (or print a short message).

---

## Example output

For `n = 3` (width = 9, height = 5):

```
*********
*   *   *
*   *   *
*   *   *
*********
```

> Tip: This README uses spaces for empty cells to keep the pattern clean. If you need to debug alignment, temporarily replace spaces with a visible character (e.g., `·`).

---

## Hints

- Compute dimensions first: `int width = 3 * n; int height = n + 2;`
- A cell `(row, col)` is on the border if `row == 0 || row == height - 1 || col == 0 || col == width - 1`.
- The center column is `int center = width / 2;` (integer division).
- For each row:
  - If the cell is border → print `*`.
  - Else if `col == center` → print `*`.
  - Else → print a space.
- End each row with `System.out.println();`

---

## How to compile and run

From the `window` directory:

```bash
javac Window.java
java Window
```

In this implementation, the value of `n` is fixed to 3 inside the code.