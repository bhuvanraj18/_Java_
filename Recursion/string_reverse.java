import java.util.Scanner;

public class string_reverse {
    public static void reverseStr(String str, int idx) {
        if (idx == 0) {
            System.out.println(str.charAt(idx));
            return;
        }

        System.out.println(str.charAt(idx));
        reverseStr(str, idx - 1);
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String str = sc.next();
            reverseStr(str, str.length() - 1);
        }
    }

}
