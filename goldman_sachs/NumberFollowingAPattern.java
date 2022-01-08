package revisewitharsh.goldman_sachs;

public class NumberFollowingAPattern {

    public static void main(String[] args) {
        System.out.println(printMinimumNumberForPattern("D"));
        System.out.println(printMinimumNumberForPattern("IIDDD"));
    }

    public static String printMinimumNumberForPattern(String string) {
        char[] charArray = string.toCharArray();
        StringBuilder stringBuilder = new StringBuilder();
        int i = 0;
        int j = 0;
        int count = 1;
        while (i <= charArray.length) {
            if (i == charArray.length || charArray[i] == 'I') {
                while (count >= 1) {
                    if (count <= j) {
                        break;
                    }
                    char ch = String.valueOf(count).charAt(0);
                    stringBuilder.append(ch);
                    count--;
                }
                j = i + 1;
                count = i + 1;
            }
            count++;
            i++;
        }
        return stringBuilder.toString();
    }
}
