package MakingCement;

public class MakingMain{

    public static void main(String[] args) {
        Builder builder = new Builder();
        Palette palette = new Palette();
        ConcreteMixer concreteMixer = new ConcreteMixer();
        Container container = new Container();
        palette.setCement(false);
        palette.setSand(true);
        palette.setWater(false);
        concreteMixer.setBuilder(builder);
        builder.setContainer(container);


        builder.setConcreteMixer(concreteMixer);
        builder.setPalette(palette);





        builder.startWorking();


    }

}
