package revisewitharsh.goldman_sachs;

public class FindMissingAndRepeating {

    public static void main(String[] args) {
        int[] ans1 = findTwoElements(new int[]{2, 2}, 2);
//        int[] ans2 = findTwoElements(new int[]{1, 3, 3}, 3);
        System.out.println(ans1[0] + " " + ans1[1]);
//        System.out.println(ans2[0] + " " + ans2[1]);
    }

    public static int[] findTwoElements(int[] arr, int n) {
        int[] frequencyArray = new int[n];
        int[] ans = new int[2];
        for (int el : arr) {
            frequencyArray[el - 1]++;
            if (frequencyArray[el - 1] >= 2) {
                ans[0] = el;
            }
        }
        for (int i = 0; i < n; i++) {
            if (frequencyArray[i] == 0) {
                ans[1] = i + 1;
                break;
            }
        }
        return ans;
    }
}
