package scanner;

import java.util.Scanner;

public class MaximumCalculator {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Please enter two numbers to find the maximum from two of them: ");
        int num1 = s.nextInt();
        int num2 = s.nextInt();

        if(num1 > num2) {
            System.out.printf("Between %d and %d, maximum is %d", num1, num2, num1);
        }
        else {
            System.out.printf("Between %d and %d, maximum is %d", num1, num2, num2);
        }
    }
}
