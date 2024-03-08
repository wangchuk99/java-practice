public class MiniChallenge {
    public static void main(String[] args) {
        calculateInterest(100);
    }

    public static void calculateInterest(double amount) {
        for (double rate = 7.5; rate <= 10; rate += 0.25) {
            if (rate > 8.5) {
                break;
            }
            System.out.println("100 at an interest of " + rate + "% is " + (amount * (rate / 100)));
        }
    }
}
