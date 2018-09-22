package firstLesson;

import java.util.Date;

public class FormularzMain {

    public static void main(String[] args) {

        Formularz formularz = new Formularz();

        formularz.setCzyMaszObywatelstwoPolskie(false);
        formularz.setDataUrodzenia(new Date(1989, 9, 15));

        System.out.println(formularz.getDataUrodzenia());
    }
}
