import java.util.Scanner;

public class Number_Pyramid {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int m = sc.nextInt();
            for (int i = 1; i <= m; i++) {
                //Spaces...
                for (int j = 1; j <= m - i; j++) {
                    System.out.print(" ");
                }
                // Numbers -> Print row_No , Row_No times..
                for (int k = 1; k <= i; k++) {
                    System.out.print(i+" ");
                }
                System.out.println();
            }
        }
    }
}
