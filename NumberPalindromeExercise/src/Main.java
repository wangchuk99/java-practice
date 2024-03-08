public class Main {
    public static void main(String[] args) {
        System.out.println(isPalindrome(-222));
    }

    public static boolean isPalindrome(int number) {
        int remainder, sum = 0, temp;

        temp = number;

        while (number != 0) {
            remainder = number % 10;
            sum = (sum * 10) + remainder;
            number = number / 10;
        }

        if (temp == sum) {
            return true;
        } else {
            return false;
        }
    }
}
