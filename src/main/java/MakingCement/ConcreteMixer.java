package MakingCement;

public class ConcreteMixer {

    private Builder builder;

    private Palette palette;

    public Builder getBuilder() {
        return builder;
    }

    public void makeConcrete(Palette buildingMaterials)
    {
        if (buildingMaterials.isSand()&&buildingMaterials.isCement()&&buildingMaterials.isWater())
        {
            System.out.println("Zaczyman Prace");
            System.out.println("");
            System.out.println("Skonczone, mozna wyladowac");
            builder.loadContainer();
        }
        else
        {
            System.out.println("Nie mam czego mieszac");
        }

    }


    public void setBuilder(Builder builder) {
        this.builder = builder;
    }
}
