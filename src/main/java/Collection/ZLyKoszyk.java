package Collection;

public class ZLyKoszyk {

    private Jablko jablko;
    private Jablko apple;

    public ZLyKoszyk(Jablko jablko, Jablko apple) {
        this.jablko = jablko;
        this.apple = apple;
    }


    public Jablko getJablko() {
        return jablko;
    }

    public Jablko getApple() {
        return apple;
    }
}
