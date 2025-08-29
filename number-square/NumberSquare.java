public class NumberSquare {
    public static void numberSquare(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (j <= i) {
                    System.out.print(j);
                } else {
                    System.out.print(i);
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        numberSquare(7);
    }
}