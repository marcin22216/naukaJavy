package Collection;

import java.util.List;

public class KoszykMain {

    public static void main(String[] args) {
//        ZLyKoszyk ZLyKoszyk = new ZLyKoszyk(new Jablko("zolty"), new Jablko("czerwony"));
//
//        System.out.println("W koszyku mam jablko koloru:" + ZLyKoszyk.getJablko().getKolorJablka());
//        System.out.println("W koszyku mam jablko koloru:" + ZLyKoszyk.getApple().getKolorJablka());


        DobryKoszyk dobryKoszyk = new DobryKoszyk();

        List<Jablko> jablkoList = dobryKoszyk.getJablkoList();

        jablkoList.add(new Jablko("zolte"));
        jablkoList.add(new Jablko("zielone"));
        jablkoList.add(new Jablko("czerwone"));


        //petla for each

        //for(int i = 0; i< 20; i++)
//        {}
        for (Jablko jablko : jablkoList) {

            System.out.println("kolor jablka w koszyku to: " + jablko.getKolorJablka());
        }

//        System.out.println(dobryKoszyk.getJablkoList().get(0).getKolorJablka());
//        System.out.println(dobryKoszyk.getJablkoList().get(1).getKolorJablka());
//        System.out.println(dobryKoszyk.getJablkoList().get(2).getKolorJablka());
//        System.out.println(dobryKoszyk.getJablkoList().get(3).getKolorJablka());

    }

}
