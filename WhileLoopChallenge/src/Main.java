public class Main {
    public static void main(String[] args) {

//        int i = 5;
//        while (i <= 20) {
//            if (isEvenNumber(i)) {
//                System.out.println(i + " is an even number");
//            }
//            i++;
//        }

        int number = 4;
        int finishedNumber = 20;
        int evenCount = 0;
        int oddCount = 0;
        while (number <= finishedNumber) {
            number++;
            if (!isEvenNumber(number)) {
                oddCount++;
                continue;
            }
            System.out.println(number + " is an even number");
            evenCount++;
            if (evenCount == 5) {
                break;
            }
        }
        System.out.println(evenCount + " are even numbers");
        System.out.println( oddCount + " are odd numbers");
    }

    public static boolean isEvenNumber(int number) {
        if (number % 2 == 0) {
            return true;
        }
        return false;
    }
}
