package revisewitharsh.goldman_sachs;

public class SquaresInNxNChessboard {

    public static void main(String[] args) {
        System.out.println(squaresInChessboard(1L));
        System.out.println(squaresInChessboard(2L));
    }

    public static Long squaresInChessboard(Long n) {
        return (n * (n + 1) * (2 * n + 1)) / 6;
    }
}
