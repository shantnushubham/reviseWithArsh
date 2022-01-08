package revisewitharsh.goldman_sachs;

public class EncodeString {

    public static void main(String[] args) {
        System.out.println(encode("abbbcdddd"));
    }

    public static String encode(String string) {
        int count = 1;
        char[] charArray = string.toCharArray();
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < string.length() - 1; i++) {
            if (charArray[i] == charArray[i + 1]) {
                count++;
            } else {
                stringBuilder.append(charArray[i]).append(count);
                count = 1;
            }
        }
        stringBuilder.append(charArray[charArray.length - 1]).append(count);
        return stringBuilder.toString();
    }
}
