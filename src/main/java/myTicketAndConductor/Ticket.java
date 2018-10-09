package myTicketAndConductor;

public class Ticket {

    private boolean isValidate;

    private double price;

    public Ticket(double price) {
        this.price = price;
    }

    public boolean isValidate() {
        return isValidate;
    }


    public void setValidate(boolean validate) {
        isValidate = validate;
    }

    public double getPrice() {
        return price;
    }

}