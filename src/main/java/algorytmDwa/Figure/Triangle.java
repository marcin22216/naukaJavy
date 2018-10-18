package algorytmDwa.Figure;

import algorytmDwa.interfejs.Teacher;

public class Triangle implements FlatFigure {

    private double field2;

    public double getField2() {
        return field2;
    }

    public void setField2(double field2) {
        this.field2 = field2;
    }

    private int wysokosc;
    private int bokTrojkata;

    public Triangle (int wysokosc, int bokTrojkata)
    {
        this.wysokosc = wysokosc;
        this.bokTrojkata = bokTrojkata;
    }

    public void calculateTheField()
    {
        this.field2 = 0.5*this.bokTrojkata*this.wysokosc;
        System.out.println("Pole trojkata wynosi:_" + this.field2);
    }



}
