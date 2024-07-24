public class Subsequence_String {
    public static void subSequence(String str, int idx, String newString) {
        if (idx == str.length()) {
            System.out.println(newString);
            return;
        }
        char currChar = str.charAt(idx);
        // To be in string
        subSequence(str, idx + 1, newString + currChar);
        // Not to be
        subSequence(str, idx + 1, newString);
    }

    public static void main(String[] args) {
        String str = "abc";
        subSequence(str, 0, "");
    }
}
