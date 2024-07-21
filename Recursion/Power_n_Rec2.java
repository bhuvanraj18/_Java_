import java.util.Scanner;

public class Power_n_Rec2 {
    public static int calcPower(int x, int n) {
        if (n == 0) { //base case 1
            return 1;
        }
        if (x == 0) { // base case 2
            return 0;
        }
        if (n % 2 == 0) { // n is even case
            return calcPower(x, n / 2) * calcPower(x, n / 2);
        } else { // n is odd case
            return calcPower(x, n / 2) * calcPower(x, n / 2) * x;
        }
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
