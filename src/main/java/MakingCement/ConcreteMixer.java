package MakingCement;

public class ConcreteMixer {

    private Builder builder;

    private Palette palette;

    public void makeConcrete(Palette buildingMaterials)
    {
        if (buildingMaterials.isSand() == false && buildingMaterials.isCement() == false && buildingMaterials.isWater() == false)
        {
            System.out.println("Nie mam czego mieszac");
        }
        else
        {
            System.out.println("Zaczyman Prace");
            System.out.println("");
            System.out.println("Skonczone, mozna wyladowac");
            builder.loadContainer();
        }

    }


}
