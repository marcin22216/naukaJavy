package algorytmDwa.Figure;

public class Square implements FlatFigure{

    private int field;

    private int bokKwadratu;

    public Square (int bokKwadratu)
    {
        this.bokKwadratu = bokKwadratu;
    }

    public void calculateTheField()
    {
        this.field = this.bokKwadratu*this.bokKwadratu;

        System.out.println("Pole wynosi:_" + this.field );
    }


    public int getField() {
        return field;
    }

    public void setField(int field) {
        this.field = field;
    }
}



