public class Main {
    public static void main(String[] args) {
        int count = 0;

        for (int i = 0; i <= 50 && count < 3; i++) {
            if (isPrime(i)) {
                count++;
                System.out.println("Number " + i + " is a prime number.");
            }

//            if (count == 3) {
//                System.out.println("Found 3 - Exiting for loop");
//                break;
//            }
        }
        System.out.println("There are " + count + " prime numbers");
    }

    public static boolean isPrime(int wholeNumber) {

        if (wholeNumber <= 2) {
            return (wholeNumber == 2);
        }
        for (int divisor = 2; divisor < wholeNumber; divisor++ ) {
            if (wholeNumber % divisor == 0) {
                return false;
            }
        }
        return true;
    }
}
