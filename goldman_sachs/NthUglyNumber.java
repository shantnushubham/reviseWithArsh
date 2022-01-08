package revisewitharsh.goldman_sachs;

public class NthUglyNumber {

    public static void main(String[] args) {
        System.out.println(nthUglyNumber(10));
    }

    public static int nthUglyNumber(int n) {
        int[] uglyNumbers = new int[n];
        uglyNumbers[0] = 1;
        int index2 = 0;
        int index3 = 0;
        int index5 = 0;
        int factor2 = 2;
        int factor3 = 3;
        int factor5 = 5;
        for (int i = 1; i < n; i++) {
            int min = Math.min(Math.min(factor2, factor3), factor5);
            uglyNumbers[i] = min;
            if (factor2 == min) {
                factor2 = 2 * uglyNumbers[++index2];
            }
            if (factor3 == min) {
                factor3 = 3 * uglyNumbers[++index3];
            }
            if (factor5 == min) {
                factor5 = 5 * uglyNumbers[++index5];
            }
        }
        return uglyNumbers[n - 1];
    }
}
