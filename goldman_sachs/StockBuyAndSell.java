package revisewitharsh.goldman_sachs;

import java.util.ArrayList;
import java.util.List;

public class StockBuyAndSell {

    public static void main(String[] args) {
        System.out.println(stockBuyAndSell(
                new int[]{100, 180, 260, 310, 40, 535, 695}, 7
        ));
    }

    public static List<List<Integer>> stockBuyAndSell(int[] array, int N) {
        List<List<Integer>> result = new ArrayList<>();
        for (int i = 1; i < array.length; i++) {
            List<Integer> list = new ArrayList<>();
            if (array[i - 1] < array[i]) {
                list.add(i - 1);
                list.add(i);
                result.add(list);
            }
        }
        return result;
    }
}
