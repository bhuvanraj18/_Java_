import java.util.Scanner;

public class Butterfly_Pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        // UPPER HALF......
        for (int i = 1; i <= m; i++) {
            // 1st Part
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            //Spaces..
            for (int k = 1; k <= 2 * (m - i); k++) {
                System.out.print(" ");
            }
            // 2nd Part
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        //Lower Half...(Reverse of Upper Half)
        for (int i = m; i >= 1; i--) {
            // 1st Part
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            //Spaces..
            for (int k = 1; k <= 2 * (m - i); k++) {
                System.out.print(" ");
            }
            // 2nd Part
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
