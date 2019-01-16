package ksiazka.rozdzial3;
//Demonstruję użycie instrukcji switch
public class SwitchDemo {
    public static void main(String[] args) {
        int i;

        for (i = 0; i < 10; i++)
            switch (i) {
                case 0:
                    System.out.println("i równe zero");
                    break;
                case 1:
                    System.out.println("i równe jeden");
                    break;
                case 2:
                    System.out.println("i równe dwa");
                    break;
                case 3:
                    System.out.println("i równe trzy");
                    break;
                case 4:
                    System.out.println("i równe cztery");
                    break;
                default:
                    System.out.println("i równe pięć lub więcej");
            }
    }
}
