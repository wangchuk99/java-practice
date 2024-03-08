package printfUsage;

public class DemoClass {
    public static void main(String[] args) {
        int x = 100;
        System.out.printf("Printing simple integer: x = %5d \n", x); //d for integer type

        //Print up to 2 decimal places
        System.out.printf("Formatted with precision: PI = %.2f \n", Math.PI); //f for float and double type

        float n = 5.2f;
        //Automatically appends zero to the right most part of decimal
        System.out.printf("Formatted to specific width: n = %.3f \n", n);

        n = 2324435.3f;
        //Number is formatted from right margin and occupies a width of 20 characters
        System.out.printf("Formatted to right margin: %4.4f \n", n);

        String c = "Chador";
        System.out.printf("Printing string: %s \n", c);
        System.out.printf("Printing string: %.3s \n", c); //Only prints 3 places to the right from initial character i.e Cha
    }
}
