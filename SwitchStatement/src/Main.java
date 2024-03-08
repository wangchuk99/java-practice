public class Main {
    public static void main(String[] args) {
        int switchValue = 3;

        //Traditional switch
        switch (switchValue) {
            case 1:
                System.out.println("Value 1");
                break;

            case 2:
                System.out.println("Value 2");
                break;

            case 3:
            case 4:
            case 5:
                System.out.println("Was a 3, or 4, or 5");
                System.out.println("Actually it was " + switchValue);
                break;

            default:
                System.out.println("Default");
        }

        //Enhanced switch
        switch (switchValue) {
            case 1 -> System.out.println("Value 1");
            case 2 -> System.out.println("Value 2");
            case 3, 4, 5 -> {
                System.out.println("Was a 3, or 4, or 5");
                System.out.println("Actually it was " + switchValue);
            }
            default -> System.out.println("Default");
        }

        String month = "a";
        System.out.println(month + " is in the " + getQuarter(month) + " quarter");
    }

    public static String getQuarter(String month) {
        //Traditional switch
//        switch (month) {
//            case "JANUARY":
//            case "FEBRUARY":
//            case "MARCH":
//                return "1st";
//            case "APRIL":
//            case "MAY":
//            case "JUNE":
//                return "2nd";
//            case "JULY":
//            case "AUGUST":
//            case "SEPTEMBER":
//                return "3rd";
//            case "OCTOBER":
//            case "NOVEMBER":
//            case "DECEMBER":
//                return "4th";
//        }
//        return "bad";

        //Enhanced switch
        return switch (month) {
            case "JANUARY", "FEBRUARY", "MARCH" -> {yield "1st";}
            case "APRIL", "MAY", "JUNE" -> "2nd";
            case "JULY", "AUGUST", "SEPTEMBER" -> "3rd";
            case "OCTOBER", "NOVEMBER", "DECEMBER" -> "4th";
            default -> {
                String badResponse = "not valid";
                yield badResponse;
            }
        };
    }
}
