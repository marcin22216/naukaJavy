package school;

public class Teacher {

    public Teacher() {
        this.dziennik = new Dziennik();
    }

    private Dziennik dziennik;

    public Dziennik getDziennik() {
        return dziennik;
    }
}
