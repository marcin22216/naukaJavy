package algorytmDwa.Figure;

public class FigureMain {

    public static void main(String[] args) {

        Schoolboy schoolboy = new Schoolboy();

        schoolboy.setPoleFigury(new Triangle(3, 4));
        schoolboy.calculateTheField();
    }

}
