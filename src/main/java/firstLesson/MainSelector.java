package firstLesson;

public class MainSelector {

    public static void main(String[] args) {

        Selector selector = new Selector();

        Identity identity = new Identity();


        identity.setHumanAge(30);
        identity.setMan(true);
        selector.letInTheClub(identity);

    }

}
