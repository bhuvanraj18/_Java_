import java.util.Scanner;

public class Palindromic_Pattern {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int m = sc.nextInt();
            // 1st Half........
            for (int i = 1; i <= m; i++) {
                // Spaces......
                for (int k = 1; k <= m - i; k++) {
                    System.out.print(" ");
                }
                for (int j = i; j >= 1; j--) {
                    System.out.print(j);
                }
                // 2nd Half......
                for (int j = 2; j <= i; j++) {
                    System.out.print(j);
                }
                System.out.println();
            }
        }
    }
}
