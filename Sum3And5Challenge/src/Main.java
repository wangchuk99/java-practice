public class Main {
    public static void main(String[] args) {
        int numbersSum = 0;
        int counter = 0;

        for (int i = 1; i <= 1000; i++) {

            if (i % 3 == 0 && i % 5 == 0) {
                numbersSum += i;
                counter++;
                System.out.println("Found a match = " + i);
            }

            if (counter == 5) {
                break;
            }
        }
            System.out.println("Sum of the first 5 numbers divisible by 3 and 5 are " + numbersSum);
    }
}
