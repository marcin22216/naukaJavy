package algorytmDwa.Figure;

public class FigureMain {

    public static void main(String[] args) {

        Schoolboy schoolboy = new Schoolboy();

        schoolboy.setPoleFigury(new Trapeze(5, 7, 4));
        schoolboy.calculateTheField();
    }

}
