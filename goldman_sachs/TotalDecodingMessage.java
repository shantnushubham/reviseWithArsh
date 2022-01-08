package revisewitharsh.goldman_sachs;

public class TotalDecodingMessage {

    public static void main(String[] args) {
        System.out.println(countWays("1123"));
        System.out.println(countWays("27"));
    }

    public static int countWays(String str) {
        char[] digits = str.toCharArray();
        int n = digits.length;
        int[] count = new int[n + 1];
        count[0] = 1;
        count[1] = 1;
        if (digits[0] == '0') {
            return 0;
        }
        for (int i = 2; i <= n; i++) {
            if (digits[i - 1] > '0') {
                count[i] = count[i - 1];
            }
            if (digits[i - 2] == '1'
                    || (digits[i - 2] == '2' && digits[i - 1] < '7')) {
                count[i] += count[i - 2];
            }
        }
        return count[n];
    }
}
