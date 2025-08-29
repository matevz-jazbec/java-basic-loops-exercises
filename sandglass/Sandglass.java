public class Sandglass {
    public static void drawSandglass(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == 1 || i == n || i == j || i + j == n + 1
                        || (j > i && j < n + 1 - i) || (j < i && j > n + 1 - i))
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        drawSandglass(7);
    }
}
