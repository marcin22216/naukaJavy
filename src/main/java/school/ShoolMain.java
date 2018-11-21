package school;

import java.util.List;

public class ShoolMain {

    public static void main(String[] args) {

        Teacher teacher = new Teacher();

        Dziennik dziennik = teacher.getDziennik();

        List<Child> dziennikList = dziennik.getDziennik();

        dziennikList.add(new Child("Marcin"));
        dziennikList.add(new Child("Szymon"));

        for (Child child : dziennikList) {
            System.out.println(child.getName());
        }

    }
}
