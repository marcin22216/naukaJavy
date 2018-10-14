package MakingCement;

public class MakingMain{

    public static void main(String[] args) {
        Builder builder = new Builder();
        Palette palette = new Palette();
        ConcreteMixer concreteMixer = new ConcreteMixer();
        palette.setCement(true);
        palette.setSand(true);
        palette.setWater(false);

        builder.setConcreteMixer(concreteMixer);
        builder.setPalette(palette);





        builder.startWorking();


    }

}
