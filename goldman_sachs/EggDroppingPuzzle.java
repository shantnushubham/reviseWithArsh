package revisewitharsh.goldman_sachs;

public class EggDroppingPuzzle {

    public static void main(String[] args) {
        System.out.println(eggDrop(2, 10));
    }

    public static int eggDrop(int n, int k) {
        if (n == 1) {
            return k;
        }
        if (k == 1) {
            return 1;
        }
        int mid = (k + 1) / 2;
        if (k - mid > mid - 1) {
            return 1 + eggDrop(n, k - mid);
        } else {
            return 1 + eggDrop(n - 1, mid - 1);
        }
    }
}
