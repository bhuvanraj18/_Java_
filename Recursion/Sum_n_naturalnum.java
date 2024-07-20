import java.util.Scanner;

public class Recursion3 {
    public static void printSum(int i, int n, int sum) {
        if (i == n) {
            sum += i;
            System.out.println(sum);
            return;
        }
        sum += i;
        printSum(i + 1, n, sum);
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int i = sc.nextInt();
            int n = sc.nextInt();
            printSum(i, n, 0);
        }
    }
}
