package wycenaAut;

public class AutoMain {

    public static void main(String[] args) {

        Mietek mietek = new Mietek();

        Audi audi = new Audi(2018, false);
        Opel opel = new Opel(2005, true);

//        double wycenaAuta = mietek.wycenaAuta(audi);
        double wycenaAuta = mietek.wycenaAuta(opel);

        System.out.println(wycenaAuta);


    }

}
