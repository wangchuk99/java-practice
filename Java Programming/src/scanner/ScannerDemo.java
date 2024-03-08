package scanner;

import java.util.Scanner;

public class ScannerDemo {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int firstNum, secondNum;
        System.out.println("Enter first number: ");
        firstNum = s.nextInt();
        System.out.println("Enter second number: ");
        secondNum = s.nextInt();

        System.out.println("The sum of the two numbers is: " + (firstNum + secondNum));

    }
}
