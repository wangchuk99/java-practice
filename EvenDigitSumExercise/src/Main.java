public class Main {
    public static void main(String[] args) {
        System.out.println(getEvenDigitSum(1234));
    }

    public static int getEvenDigitSum(int number) {
        int lastDigit = 0;
        int evenDigitSum = 0;

        if (number < 0) {
            return -1;
        }

        while (number != 0) {
            lastDigit = number % 10;

            if (lastDigit % 2 == 0) {
                evenDigitSum += lastDigit;
            }

            number /= 10;
        }
        return evenDigitSum;
    }

}
