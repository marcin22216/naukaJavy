package MakingCement;

public class Builder {

    private Palette palette;

    private Container container;

    private ConcreteMixer concreteMixer;

    public void startWorking()
    {
        concreteMixer.makeConcrete(palette);
    }

    public Builder()
    { this.palette = new Palette(); }



    public void loadContainer()
    {
        this.container.setConcrete(true);
    }


    public void setConcreteMixer(ConcreteMixer concreteMixer) {
        this.concreteMixer = concreteMixer;
    }

    public void setPalette(Palette palette)
    {
        this.palette = palette;
    }

    public void setContainer(Container container) {
        this.container = container;
    }
}
