package firstLesson;

public class MainForm {
    public static void main(String[] args) {

        Form formularz = new Form();
        formularz.setAge(24);
        formularz.setAreYouPolish(true);
        formularz.setGrowth(181.3);
        formularz.setSurname("Spytkowski");
        System.out.println(formularz.getAge());
        System.out.println(formularz.getSurname());
        System.out.println(formularz.getGrowth());


    }





}
