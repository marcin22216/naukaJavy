package firstLesson;

public class Main {

    //psvm
    public static void main(String[] args) {

        new BankAccount();
        BankAccount dupa = new BankAccount();
        BankAccount bankAccount = new BankAccount();

        dupa.setBalance(1500);

        double balance = dupa.getBalance();

        //sout
//        System.out.println(balance);


        System.out.println(bankAccount.getBalance());


    }
}
