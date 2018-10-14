package Dryer;

public class WasherDryer {

    private boolean isOpen;
    private boolean isOn;


    public boolean isOpen()
    { return isOpen; }
    public void setOpen(boolean open)
    { this.isOpen = open; }

    public boolean isOn()
    { return isOn; }
    public void setOn(boolean on)
    { this.isOn = on; }

    //TODO: dodac dwa pola: isOpen i isOn

    //TODO: metodka otworzPralke, zalaczProalke, wylaczProalke, zamknijProalke

    //TODO: add method 'putClothesIntoWashingMachine'


   public void washingAndCheckingbeforeStart(Clothes ubraniaDoPrania)
   {
       if (isOn)
       {
           System.out.println("Pralka wylaczona, wlacz pralke");
       }
       else
       {
           System.out.println("Kontunuuje prace");;
       }
       if (isOpen)
       {
           System.out.println("Zamknij pralke");

       }
       else
       {
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

       //TODO: add logic with 'isON' or 'isOpen'

   }


}
