import java.util.Scanner;

public class Gcd {
    public static void FindGcd(int a, int b) {
        int m;
        for (int i = 1; i <= b; i++) {
            m = a * i;
            if (m % b == 0) {
                int res = (a*b)/m;
                System.out.println(res);
                break;
            }
        }
        return;

    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            FindGcd(a, b);
        }
    }

}
