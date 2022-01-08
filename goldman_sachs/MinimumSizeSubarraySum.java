package revisewitharsh.goldman_sachs;

public class MinimumSizeSubarraySum {

    public static void main(String[] args) {
        System.out.println(minSubArrayLen(7, new int[]{2, 3, 1, 2, 4, 3}));
    }

    public static int minSubArrayLen(int target, int[] nums) {
        int length = nums.length;
        int answer = Integer.MAX_VALUE;
        int left = 0;
        int sum = 0;
        for (int i = 0; i < length; i++) {
            sum += nums[i];
            while (sum >= target) {
                answer = Math.min(answer, i + 1 - left);
                sum -= nums[left++];
            }
        }
        return answer != Integer.MAX_VALUE ? answer : 0;
    }
}
