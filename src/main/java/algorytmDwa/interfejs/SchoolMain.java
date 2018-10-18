package algorytmDwa.interfejs;

public class SchoolMain {

    public static void main(String[] args) {

        School school = new School();

        school.setNauczyciel(new TeacherBad());
//        school.setNauczyciel(new TeacherGood());

        school.teach();
    }

}
