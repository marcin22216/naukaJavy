package algorytmDwa.interfejs;

public class TeacherBad implements Teacher {

    @Override
    public void teach() {
        System.out.println("Ucze zle bo mowie niewyraznie");

    }

    public void krzycz()
    {
        System.out.println("Krzyucze");
    }
}
