import java.util.Scanner;

public class Fibonacci {
    public static void printFibonacci(int n) {
        int a = 0, b = 1;
        System.out.print(a + " ");
        for (int i = 2; i <= n; i++) {
            System.out.print(b + " ");
            int temp = b;
            b = a + b;
            a = temp;
        }
        System.out.println();
        return;
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            printFibonacci(n);
        }
    }
}
