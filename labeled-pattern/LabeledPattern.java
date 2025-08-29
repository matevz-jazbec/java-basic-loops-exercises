class LabeledPattern {

    private static void labeledPattern(int n) {
        rowLoop: for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j) {
                    System.out.println();
                    continue rowLoop;
                }
                if ((i % 2 == 0 && j % 2 == 1) || (i % 2 == 1 && j % 2 == 0)) {
                    System.out.print(i);
                } else {
                    System.out.print("*");
                }
            }
        }
    }

    public static void main(String[] args) {
        labeledPattern(7);
    }
}
