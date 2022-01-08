package revisewitharsh.goldman_sachs;

public class KidWithDamagedToy {

    public static void main(String[] args) {
        System.out.println(kidWithDamagedToy(5, 8, 2));
    }

    public static int kidWithDamagedToy(int sizeOfCircle, int numberOfToys, int startingPosition) {
        int currentPosition = startingPosition;
        while (numberOfToys > 1) {
            currentPosition = (currentPosition + 1) % sizeOfCircle;
            numberOfToys--;
        }
        return currentPosition;
    }
}
