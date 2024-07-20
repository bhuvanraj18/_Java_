import java.util.Scanner;
public class Recursion4 {
    public static int calcFactorial(int n){
        if(n==1 || n==0){
            return 1;
        }
    int fact = calcFactorial(n-1);
    int result = n*fact;
    return result;
    }
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int ans = calcFactorial(n);
            System.out.println(ans);
        }
    }
}
