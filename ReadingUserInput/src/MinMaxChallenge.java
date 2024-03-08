import java.util.Scanner;

public class MinMaxChallenge {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double minNumber = 0;
        double maxNumber = 0;
        int loopCount = 0;

        while (true) {
            System.out.println("Enter a number OR any character to exit: ");
            String nextEntry = scanner.nextLine();
            try {
                double validNum = Double.parseDouble(nextEntry);
                if (loopCount == 0 || validNum < minNumber) {
                    minNumber = validNum;
                }
                if (loopCount == 0 || validNum > maxNumber) {
                    maxNumber = validNum;
                }
                loopCount++;
            } catch (NumberFormatException e) {
                break;
            }
        }

        if (loopCount > 0) {
            System.out.println("Min = " + minNumber + " and Max = " + maxNumber);
        } else {
            System.out.println("No valid data entered");
        }

    }
}
