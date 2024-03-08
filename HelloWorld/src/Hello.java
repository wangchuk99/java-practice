public class Hello {
    public static void main(String[] args) {
        System.out.println("Hello Chador");

        boolean isAlien = false;
        if (isAlien == false) {
            System.out.println("It is not an alien");
            System.out.println("Scared of aliens");
        }

        int topScore = 80;
        if (topScore != 100) {
            System.out.println("You got the high score!!!");
        }

        int secondTopScore = 95;
        if ((topScore > secondTopScore) && (topScore < 100)) {
            System.out.println("Greater than second top score and less than 100");
        }

        if ((topScore > 90) || (secondTopScore <= 90)) {
            System.out.println("Either or both of the conditions are true");
        }

        boolean isCar = false;
        if (!isCar) {
            System.out.println("Car is true");
        }

        String makeOfCar = "Volkswagen";
        boolean isDomestic = (makeOfCar == "Volkswagen") ? false : true;

        if (isDomestic) {
            System.out.println("This car is domestic to our country");
        }

        String s = (isDomestic) ? "This car is domestic" : "This car is not domestic";
        System.out.println(s);

        double num1 = 20.00d, num2 = 80.00d;
        double total = (num1 + num2) * 100.00d;
        double remainder = total % 40.00d;
        System.out.println(remainder);
        boolean isNoRemainder = (remainder == 0.00d) ? true : false;
        System.out.println(isNoRemainder);

        if(!isNoRemainder) {
            System.out.println("Got some remainder");
        }

    }
}
