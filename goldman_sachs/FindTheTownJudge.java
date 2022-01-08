package revisewitharsh.goldman_sachs;

public class FindTheTownJudge {

    public static void main(String[] args) {
        System.out.println(findJudge(2, new int[][]{
                new int[]{1, 2}
        }));
        System.out.println(findJudge(3, new int[][]{
                new int[]{1, 3}, new int[]{2, 3}
        }));
        System.out.println(findJudge(3, new int[][]{
                new int[]{1, 3}, new int[]{2, 3}, new int[]{3, 1}
        }));
    }

    public static int findJudge(int n, int[][] trust) {
        int[] trusted = new int[n];
        int[] trusts = new int[n];
        for (int[] trustInstance: trust) {
            trusts[trustInstance[0] - 1]++;
            trusted[trustInstance[1] - 1]++;
        }
        for (int i = 0; i < n; i++) {
            if (trusts[i] == 0 && trusted[i] == n - 1) {
                return i + 1;
            }
        }
        return -1;
    }
}
