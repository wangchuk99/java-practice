public class Main {
    public static void main(String[] args) {
        System.out.println(hasSharedDigit(9, 99));
    }

    public static boolean hasSharedDigit(int number1, int number2) {

        if (number1 < 10 || number1 > 99 || number2 < 10 || number2 > 99) {
            return false;
        }

        int numberOneFirstDigit = number1 / 10;
        int numberTwoFirstDigit = number2 / 10;
        int numberOneLastDigit = number1 % 10;
        int numberTwoLastDigit = number2 % 10;

        if (
                numberOneFirstDigit == numberTwoFirstDigit ||
                        numberOneFirstDigit == numberTwoLastDigit ||
                        numberOneLastDigit == numberTwoFirstDigit ||
                        numberOneLastDigit == numberTwoLastDigit
        ) {
            return true;
        } else {
            return false;
        }
    }
}
