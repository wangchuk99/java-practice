public class Main {
    public static void main(String[] args) {

        Customer customer2 = new Customer("Dorji", 500, "dorji@g.com");
        System.out.println(customer2.getName());
        System.out.println(customer2.getCreditLimit());
        System.out.println(customer2.getEmailAddress());

        Customer customer1 = new Customer();
        System.out.println(customer1.getName());
        System.out.println(customer1.getCreditLimit());
        System.out.println(customer1.getEmailAddress());


        Customer customer3 = new Customer("Pema", "pema@email.com");
        System.out.println(customer3.getName());
        System.out.println(customer3.getCreditLimit());
        System.out.println(customer3.getEmailAddress());
    }
}
