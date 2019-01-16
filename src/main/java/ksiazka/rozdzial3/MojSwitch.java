package ksiazka.rozdzial3;

public class MojSwitch {
    public static void main(String[] args) {
        int i;

        for (i = 0; i < 5; i++) {
            switch (i) {
                case 0:
                    System.out.println("chuj");
                case 1:
                case 2:
                    break;
                case 3:
                    System.out.println("i jest równe 3");
                    break;
                case 4:
                    System.out.println("i jest równe 4");
                    break;
            }
        }
    }
}
