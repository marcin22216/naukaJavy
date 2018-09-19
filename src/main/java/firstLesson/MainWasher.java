package firstLesson;

public class MainWasher {

    public static void main(String[] args) {

        Washer samsung = new Washer();
        samsung.setTemperature(70.5);
        System.out.println(samsung.getTemperature());
    }

}
