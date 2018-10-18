package algorytmDwa.interfejs;

public class School {

    private Teacher nauczyciel;
//    private TeacherBad nauczyciel;

//    public void setNauczyciel(TeacherBad nauczyciel) {
//        this.nauczyciel = nauczyciel;
//    }

        public void setNauczyciel(Teacher nauczyciel) {
        this.nauczyciel = nauczyciel;
    }

    public void teach()
    {
        this.nauczyciel.teach();
//        this.nauczyciel.krzycz();
    }


}
