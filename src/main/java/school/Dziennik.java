package school;

import java.util.ArrayList;
import java.util.List;

public class Dziennik {

    private List<Child> dziennik;

    public Dziennik() {

        this.dziennik = new ArrayList<Child>();

    }


    public List<Child> getDziennik() {
        return dziennik;
    }
}
