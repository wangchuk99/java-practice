package scanner;

import java.util.ArrayList;
import java.util.Scanner;

public class SimpleArrayList {
    public static void main(String[] args) {
        int sum = 0;
        float avg;
        ArrayList<Integer> l = new ArrayList<>();
        System.out.println("Enter the input: ");
        Scanner input = new Scanner(System.in);
        while(input.hasNextInt()) {
            l.add(input.nextInt());
        }
        for(int i = 0; i < l.size(); i++) {
            sum += l.get(i); //OR sum = sum + l.get(i);
        }
        avg = sum/l.size();
        System.out.println("Average: " + avg);
    }
}
