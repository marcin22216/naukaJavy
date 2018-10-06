package TicketAndConductor;

public class Ticket {

    //jak pisalem w mainie potrzebuje pola, ktore bedzie trzymac stan skasowania biletu.
    // Jedna uwaga na marginesie - dla mnie isValidate znaczy tyle samo co po polsku: czyJestSkasowany
    // Oto to pole:
    private boolean isValidate;

    private int numberOfPenalties;


    // to jest getter, ktory bedzie uzywany przez obiekt typu Conducotr do sprawdzenia stanu biletu
    public boolean isValidate() {
        return isValidate;
    }

    // to jest setter, ktory bedzie uzywany przez obiekt typu Conducotr do zmiany (fizycznego skasowania) stanu biletu
    public void setValidate(boolean validate) {
        isValidate = validate;
    }

    public int getNumberOfPenalties()
    { return numberOfPenalties; }

    public void setNumberOfPenalties(int numberOfPenalties)
    { this.numberOfPenalties = numberOfPenalties; }



    // przejdz teraz spowrotem do maina czyli klasy TicketAndConductorMain
}
