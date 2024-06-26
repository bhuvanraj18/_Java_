public class StringsRev {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("TANJIRO");
        for (int i = 0; i < sb.length() / 2; i++) {
            int front = i;
            int back = sb.length() - 1 - i; // 6-1-0 = 5 --> index at last

            char frontChar = sb.charAt(front);
            char backChar = sb.charAt(back);

            sb.setCharAt(front, backChar);
            sb.setCharAt(back, frontChar);
        }
        System.out.println(sb);
    }
}
