import java.util.Scanner;

public class ReadingUserInputChallenge {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int count = 1;
        int sum = 0;
        do {
            try {
                System.out.println("Enter number #" + count + ": ");
                String number = scanner.nextLine();
                int numberInt = Integer.parseInt(number);
                sum += numberInt;
                count++;
            } catch (NumberFormatException badUserData) {
                System.out.println("Characters are not allowed. Try again!");
            }

        } while (count <= 5);

        System.out.println("The sum of the 5 numbers are " + sum);
    }

}
