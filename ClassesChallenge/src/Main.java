public class Main {
    public static void main(String[] args) {

//        BankAccount chadorsAccount = new BankAccount();
//        chadorsAccount.setNumber("12345");
//        chadorsAccount.setBalance(1000);
//        chadorsAccount.setCustomerName("Chador Wangchuk");
//        chadorsAccount.setCustomerEmail("chachuk1999@gmail.com");
//        chadorsAccount.setCustomerPhone("17923248");

//        chadorsAccount.withdrawFunds(100.0);
//        chadorsAccount.depositFunds(500.0);
//        chadorsAccount.withdrawFunds(100.0);
//        chadorsAccount.withdrawFunds(400.0);
//        chadorsAccount.depositFunds(500.55);
//        chadorsAccount.withdrawFunds(6000);

//        BankAccount chadorsAccountWithConstructors = new BankAccount("12345", 1000, "Chador Wangchuk",
//                "chachuk1999@gmail.com", "17923248");

        BankAccount chadorsAccountWithConstructors = new BankAccount();

        chadorsAccountWithConstructors.withdrawFunds(100.0);
        chadorsAccountWithConstructors.depositFunds(500.0);
        chadorsAccountWithConstructors.withdrawFunds(100.0);
        chadorsAccountWithConstructors.withdrawFunds(400.0);
        chadorsAccountWithConstructors.depositFunds(500.55);
        chadorsAccountWithConstructors.withdrawFunds(6000);

        System.out.println(chadorsAccountWithConstructors.getNumber());
        System.out.println(chadorsAccountWithConstructors.getBalance());

        BankAccount TimsAccount = new BankAccount("Tim", "Tim@gmail.com", "12345");
        System.out.println("AccountNumber: " + TimsAccount.getNumber() + "; name " + TimsAccount.getCustomerName());

    }

}
