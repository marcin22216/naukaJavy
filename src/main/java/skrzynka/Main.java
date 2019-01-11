package skrzynka;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        Mechanik mechanik = new Mechanik();

        SkrzynkaZNarzedziami skrzynkaZNarzedziami = mechanik.getSkrzynkaZNarzedziami();

        List<Narzedzie> toolList = skrzynkaZNarzedziami.getToolList();

        toolList.add(new Narzedzie("Mlotek"));
        toolList.add(new Narzedzie("kombinerki"));
        toolList.add(new Narzedzie("Wiertarka"));


        for (Narzedzie narzedzie : toolList)
        {
            System.out.println(narzedzie.getTool());
        }

        

    }


}
