package firstLesson;

public class MainSelector {

    public static void main(String[] args) {

        Selector selector = new Selector();

        Identity identity = new Identity();

        Identity sex = new Identity();

        identity.setHumanAge(20);
        identity.isMan();
        selector.letInTheClub(identity, sex);

    }

}
