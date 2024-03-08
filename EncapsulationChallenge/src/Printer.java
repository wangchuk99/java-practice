public class Printer {
    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplex;

    public Printer(int tonerLevel, boolean duplex) {
        this.tonerLevel = (tonerLevel >= 0 && tonerLevel <= 100) ? tonerLevel : -1;
        this.duplex = duplex;
    }

    public int addToner(int tonerAmount) {
        tonerLevel += tonerAmount;
        if (tonerLevel < 0 || tonerLevel > 100) {
            return -1;
        }
        return tonerLevel;
    }

    public int printPages(int pagesToBePrinted) {
//        if (duplex) {
//            System.out.println("Duplex printer");
//            pagesPrinted = pagesToBePrinted / 2;
//            return pagesPrinted;
//        }
        int jobPages = (duplex) ? (pagesToBePrinted / 2) + (pagesToBePrinted % 2) : pagesToBePrinted;
        pagesPrinted += jobPages;
        return jobPages;
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }
}
