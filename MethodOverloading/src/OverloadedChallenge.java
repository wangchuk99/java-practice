public class OverloadedChallenge {
    public static void main(String[] args) {
        System.out.println("Height in centimeters is " + convertToCentimeters(68));
        System.out.println("Height in centimeters is " + convertToCentimeters(5, 8));
    }

    public static double convertToCentimeters(int heightInInches) {
        return heightInInches * 2.54;
    }

    public static double convertToCentimeters(int heightInFeet, int remainingHeightInInches) {
        int totalInches = heightInFeet * 12 + remainingHeightInInches;
        return convertToCentimeters(totalInches);
    }
}
