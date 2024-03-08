package dataInputStream;

import java.io.DataInputStream;

public class DemoClass {
    public static void main(String[] args) {  //Instead of try and catch, we can also use throws Exception on the main method
        float principalAmount = 0;
        float rateOfInterest = 0;
        int numberOfYears = 0;

        try {
            DataInputStream in = new DataInputStream(System.in);
            String tempString;
            System.out.print("Enter principal amount: ");
            System.out.flush();
            tempString = in.readLine();
            principalAmount = Float.valueOf(tempString);

            System.out.print("Enter rate of interest: ");
            System.out.flush();
            tempString = in.readLine();
            rateOfInterest = Float.valueOf(tempString);

            System.out.print("Enter number of years: ");
            System.out.flush();
            tempString = in.readLine();
            numberOfYears = Integer.parseInt(tempString);

            float interestTotal = principalAmount * rateOfInterest * numberOfYears;
            System.out.println("Total interest: " + interestTotal);
        }
        catch(Exception e) {

        }

    }
}
