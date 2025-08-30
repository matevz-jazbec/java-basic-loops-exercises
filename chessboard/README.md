# Chessboard

This program prints an `n × n` chessboard pattern to the console, where
each square is `2 × 2` characters in size.
The filled area is shown with `*`, and empty squares are printed as
spaces.

**Solutions provided:** `Chessboard1.java` and `Chessboard2.java`.

Concepts practiced: nested loops, parity checks, working with indices,
console output formatting.

------------------------------------------------------------------------

## Task

Implement a method `drawChessboard(int n)` that prints an `n × n`
chessboard.

Each board cell should be represented by a `2 × 2` block of characters.

-   The method should accept any integer `n > 0`.
-   Use spaces for empty cells and `*` for filled cells.
-   Keep printing on one line with `System.out.print(...)` and end each
    row with `System.out.println()`.

------------------------------------------------------------------------

## Example output

For `n = 4`:

    **    ** 
    **    **
       **    **
       **    **
    **    **
    **    **
       **    **
       **    **

> Tip: If your viewer makes spaces hard to see, temporarily replace
> spaces with a visible placeholder (e.g., `·`) to inspect alignment.

------------------------------------------------------------------------

## How to compile and run

From the `chessboard` directory:

``` bash
# Option 1: run the first solution
javac Chessboard1.java
java Chessboard1

# Option 2: run the second solution
javac Chessboard2.java
java Chessboard2
```
