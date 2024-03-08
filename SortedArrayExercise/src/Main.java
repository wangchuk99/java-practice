import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        System.out.println(Arrays.toString(getIntegers(5)));

        int[] unsortedArray = getIntegers(5);
        System.out.println(Arrays.toString(unsortedArray));

        int[] sortedArray = sortIntegers(unsortedArray);
        System.out.println(Arrays.toString(sortedArray));

        printArray(sortedArray);

    }

    public static int[] getIntegers(int size) {
        Scanner s = new Scanner(System.in);
        int[] myArray = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.println("Please enter the integer for the " + i + " position index of your array: ");
            myArray[i] = s.nextInt();
        }

        return myArray;
    }

    public static int[] sortIntegers(int[] unsortedArray) {

        int[] sortedArray = Arrays.copyOf(unsortedArray, unsortedArray.length);
        boolean flag = true;
        int temp;

        while (flag) {
            flag = false;
            for (int i = 0; i < sortedArray.length -1; i++) {
                if (sortedArray[i] < sortedArray[i + 1]) {
                    temp = sortedArray[i];
                    sortedArray[i] = sortedArray[i + 1];
                    sortedArray[i + 1] = temp;
                    flag = true;
                }
            }
        }

        return sortedArray;
    }

    public static void printArray(int[] sortedArray) {
        int[] printArray = Arrays.copyOf(sortedArray, sortedArray.length);

        for (int i = 0; i < printArray.length; i++) {
            System.out.println("Element " + i + " contents " + printArray[i]);
        }
    }
}
