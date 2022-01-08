package revisewitharsh.goldman_sachs;

public class ReverseWordsInAString {

    public static void main(String[] args) {
        System.out.println(reverseWords("I.Like.You"));
    }

    public static String reverseWords(String S) {
        StringBuilder sb = new StringBuilder();
        String[] words = S.trim().split("\\.");
        for (int i = words.length - 1; i >= 0; i--) {
            sb.append(words[i]);
            if (i > 0) {
                sb.append(".");
            }
        }
        return sb.toString();
    }
}
