public class Main {
    public static void main(String[] args) {
        System.out.println(sumFirstAndLastDigit(252));
    }

    public static int sumFirstAndLastDigit(int number) {
        int sum = 0, firstDigit = 0, lastDigit;

        lastDigit = number % 10;

        while (number >= 10) {
            number = number / 10;
        }

        firstDigit = number;

        if (number < 0) {
            return -1;
        } else {
            return firstDigit + lastDigit;
        }

    }
}
