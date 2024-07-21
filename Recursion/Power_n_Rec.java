import java.util.Scanner;

public class Power_n_Rec {
    public static int calcPower(int x, int n) {
        if (n == 0) {
            return 1; // base case 1
        }
        if (x == 0) {
            return 0; // base case 2
        }
        int xpownM1 = calcPower(x, n - 1);
        int xpown = x * xpownM1; // x*pow(x-1)
        return xpown;

    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int x = sc.nextInt();
            int n = sc.nextInt();
            int ans = calcPower(x, n);
            System.out.println(ans);
        }
    }
}
// Stack height = n in this method....