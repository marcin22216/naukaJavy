package wycenaAut;

public class Mietek {


    public double wycenaAuta(Auto auto)
    {
        double cena = 0;

        if(auto instanceof Audi)
        {
            cena = 20000;
        }
        if(auto instanceof Opel)
        {
            cena = 10000;
        }

        if(auto.isAlu())
        {
            cena = cena + 200;
        }
        if(auto.getRocznik() > 2015)
        {
            cena = cena*1.5;
        }


        return cena;

    }
}
