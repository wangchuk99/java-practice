public class Main {
    public static void main(String[] args) {
        Employee tim = new Employee("Tim", "11/11/1999",  "01/01/2020");
        System.out.println(tim);
        System.out.println("Age = " + tim.getAge());
        System.out.println("Pay = " + tim.collectPay());

        SalariedEmployee joe = new SalariedEmployee("Joe", "11/11/1990", "01/01/2021", 35000);
        System.out.println(joe);
        System.out.println("Age = " + joe.getAge());
        System.out.println("Pay = " + joe.collectPay());

        joe.retire();
        System.out.println("Joe's pension check = " + joe.collectPay());

        HourlyEmployee mary = new HourlyEmployee("Mary", "05/06/1970", "01/01/2012", 15);
        System.out.println(mary);
        System.out.println("Mary's paycheck = " + mary.collectPay());
        System.out.println("Mary's holiday pay = " + mary.getDoublePay());
    }
}
