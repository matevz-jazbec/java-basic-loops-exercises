public class Window {
    public static void drawWindow(int n) {
        for (int i = 1; i <= n + 2; i++) {
            for (int j = 1; j <= n * 3; j++) {
                if (i == 1 || i == n + 2 || j == 1 || j == n * 3 || j == (n * 3 / 2 + 1)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args 5) {
        drawWindow(3);
    }
}
