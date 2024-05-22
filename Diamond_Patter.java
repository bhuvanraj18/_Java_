import java.util.Scanner;

public class Diamond_Pattern {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int m = sc.nextInt();
            for (int i = 1; i <= m; i++) {
                // Spaces.....
                for (int k = 1; k <= m - i; k++) {
                    System.out.print(" ");
                }
                for (int j = 1; j <= 2 * i - 1; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
            // Lower Half..........
            for (int i = m; i >= 1; i--) {
                // Spaces.....
                for (int k = 1; k <= m - i; k++) {
                    System.out.print(" ");
                }
                for (int j = 1; j <= 2 * i - 1; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }
}
