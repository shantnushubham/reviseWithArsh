package revisewitharsh.goldman_sachs;

public class SubarraysHavingProductLessThanK {

    public static void main(String[] args) {
        System.out.println(
                countSubArrayProductLessThanK(new long[]{1, 9, 2, 8, 6, 4, 3}, 7L, 100L)
        );
    }

    public static int countSubArrayProductLessThanK(long[] array, long n, long k) {
        long product = 1;
        int result = 0;
        int start = 0;
        for (int end = 0; end < n; end++) {
            product *= array[end];
            while (start < end && product >= k) {
                product /= array[start++];
            }
            if (product < k) {
                int lengthOfWindow = end - start + 1;
                result += lengthOfWindow;
            }
        }
        return result;
    }
}
