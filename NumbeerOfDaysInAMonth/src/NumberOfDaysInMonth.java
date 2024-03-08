public class NumberOfDaysInMonth {
    public static void main(String[] args) {
        System.out.println(getDaysInMonth(-2, 2018));
    }

    public static boolean isLeapYear(int year) {
        if (year >= 1 && year <= 9999) {
            return (year % 4 == 0 && year % 100 != 0) || year % 400 == 0;
        }
        return false;
    }

    public static int getDaysInMonth(int month, int year) {
        if ((month < 1 || month > 12) || (year < 1 || year > 9999)) {
            return -1;
        } else {
            if (isLeapYear(year)) {
                switch (month) {
                    case 1, 3, 5, 7, 8, 10, 12:
                        return 31;
                    case 2:
                        return 29;
                    default:
                        return 30;
                }
            }
        }
        switch (month) {
            case 1, 3, 5, 7, 8, 10, 12:
                return 31;
            case 2:
                return 28;
            default:
                return 30;
        }
    }
}
