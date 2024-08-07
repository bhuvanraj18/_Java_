public class allPermutations_Str {
    public static void printPerm(String str, String permutation) {
        if (str.length() == 0) {
            System.out.println(permutation);
            return;
        }
        for (int i = 0; i < str.length(); i++) {
            char currChar = str.charAt(i);
            // "abc" --> "ab"
            String newstr = str.substring(0, i) + str.substring(i + 1);
            printPerm(newstr, permutation + currChar);
        }
        // printPerm("abc", "")
        // printPerm("bc", "a")
        // printPerm("c", "ab")
        // printPerm("", "abc") // Base case: Print "abc"

        // printPerm("b", "ac")
        // printPerm("", "acb") // Base case: Print "acb"

    }

    public static void main(String[] args) {
        String str = "abc";
        printPerm(str, "");
    }

}
