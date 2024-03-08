package arrays;

public class Main {
    public static void main(String[] args) {
        int array[] = {10, 20, 30, 40, 50};
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

        float average = 0;
        float sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
            average = sum / array.length;
        }
        System.out.println("Average is " + average);

    }
}