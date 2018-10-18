package algorytmDwa.Figure;

public class Trapeze implements FlatFigure{

    private double field3;

    private int bok1;
    private int bok2;
    private int wysokoscTrapezu;

    public Trapeze (int bok1, int bok2, int wysokoscTrapezu)
    {
        this.bok1 = bok1;
        this.bok2 = bok2;
        this.wysokoscTrapezu = wysokoscTrapezu;
    }

    public void calculateTheField()
    {
        this.field3 = ((this.bok1 + this.bok2)*0.5)/this.wysokoscTrapezu;
        System.out.println("Pole trapezu wynosi:_" + this.field3);
    }

    public double getField3() {
        return field3;
    }

    public void setField3(double field3) {
        this.field3 = field3;
    }
}
