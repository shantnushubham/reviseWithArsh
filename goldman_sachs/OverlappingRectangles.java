package revisewitharsh.goldman_sachs;

public class OverlappingRectangles {

    public static void main(String[] args) {
        System.out.println(doOverlap(
                new int[]{0, 10}, new int[]{10, 0}, new int[]{5, 5}, new int[]{15, 0}
        ));
        System.out.println(doOverlap(
                new int[]{0, 2}, new int[]{1, 1}, new int[]{-2, -3}, new int[]{0, 2}
        ));
    }

    public static int doOverlap(int L1[], int R1[], int L2[], int R2[]) {
        if (L1[0] > R2[0] || L2[0] > R1[0]) {
            return 0;
        }
        if (L1[1] < R2[1] || L2[1] < R1[1]) {
            return 0;
        }
        return 1;
    }
}
