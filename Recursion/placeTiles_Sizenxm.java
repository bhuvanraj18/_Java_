public class placeTiles_Sizenxm {
    public static int placeTiles(int n, int m) {
        if (n == m) {
            return 2;
        }
        if (n < m) {
            return 1;
        }
        // vertical placement
        int verticalPlacements = placeTiles(n - m, m);

        // horizontal placement
        int horizontalPlacements = placeTiles(n - 1, m);

        return verticalPlacements + horizontalPlacements;
    }

    public static void main(String[] args) {
        int n = 4, m = 2;
        System.out.println("The total ways are " + placeTiles(n, m));
    }
}
