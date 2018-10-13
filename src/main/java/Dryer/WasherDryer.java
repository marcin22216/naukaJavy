package Dryer;

public class WasherDryer {

    private Clothes ubraniaDoPrania;
    {
        this.ubraniaDoPrania = new Clothes();
    }


   public void washing(Clothes ubraniaDoPrania){
        if (ubraniaDoPrania.isDirty())
        {
            System.out.println("Zaczynam pranie");
            ubraniaDoPrania.setDirty(false);
            System.out.println();
            System.out.println("Pranie skonczone");
        }
        else
        {
            System.out.println("Nic nie robie");
        }

   }

}
