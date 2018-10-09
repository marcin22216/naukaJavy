package Piggybank;

public class Child {


    public void checkAndAddCash(PiggyBank piggyBank, Mother mother)
    {
        System.out.println("Mam w skarbonce:" + piggyBank.getCash());



        System.out.println("wrzucam pieniadze");

        piggyBank.takeCash();


        System.out.println("teraz mam:" + piggyBank.getCash());
    }

}
