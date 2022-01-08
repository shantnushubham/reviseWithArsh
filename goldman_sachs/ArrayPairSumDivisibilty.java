package revisewitharsh.goldman_sachs;

public class ArrayPairSumDivisibilty {

    public static void main(String[] args) {
        System.out.println(canPair(new int[]{9, 5, 7, 3}, 6));
        System.out.println(canPair(new int[]{2, 4, 1, 3}, 4));
    }

    public static boolean canPair(int[] nums, int k) {
        int[] remainderArray = new int[k];
        for (int el : nums) {
            remainderArray[el % k]++;
        }
        if (remainderArray[0] % 2 != 0) {
            return false;
        }
        int i = 1;
        int j = k - 1;
        while (i < j) {
            if (remainderArray[i++] != remainderArray[j--]) {
                return false;
            }
        }
        return i != j || remainderArray[i] % 2 != 1;
    }
}
