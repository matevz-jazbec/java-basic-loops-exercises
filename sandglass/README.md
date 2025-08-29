# Sandglass

This program draws a symmetric sandglass (hourglass) pattern of size `n × n`.
The filled area is shown with `*`, and empty spaces are printed as **spaces** for a cleaner look.

The solution is provided in the file: Sandglass.java.  
Open it to see the Java implementation of the pattern.

Concepts practiced: nested loops, symmetry, working with indices, console output formatting.

---

## Task

Implement a method `drawSandglass(int n)` that prints a sandglass.

- For odd `n` the figure is perfectly symmetric.
- Even `n` is also accepted but produces a “double middle” row.
- When `n <= 0`, nothing should be printed.

---

## Example output

For `n = 7`:

```
*******
 ***** 
  ***  
   *   
  ***  
 ***** 
*******
```

> Note: If your viewer collapses spaces, temporarily replace spaces with a visible character (e.g., `·`) to inspect alignment.

---

## Hints

- Index rows `0..n-1` and columns `0..n-1`.
- **Top half** (including the middle when `n` is odd): for row `i`, print `i` leading spaces, then `n - 2*i` stars.
- **Bottom half**: mirror the top — iterate `i` from `n/2 - 1` down to `0` and reuse the same spacing/stars logic.
- Guard early for invalid input: return immediately when `n <= 0`.
- Keep printing on a single line with `System.out.print(...)`; end each row with `System.out.println()`.

---

## How to compile and run

From the `sandglass` directory:

```bash
javac Sandglass.java
java Sandglass
```