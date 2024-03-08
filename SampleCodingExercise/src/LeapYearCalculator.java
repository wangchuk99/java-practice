public class LeapYearCalculator {
    public static void main(String[] args) {
        System.out.println(isLeapYear(2017));
    }

    public static boolean isLeapYear(int year) {
        boolean result = false;
        if ((year >= 1) && (year <= 9999)) {
            if ((year % 4 == 0) && (year % 100 != 0)) {
                result = true;
            }

            if ((year % 4 == 0) && (year % 100 == 0) && (year % 400 == 0)) {
                result = true;
            }
        }

        return result;
    }
}
