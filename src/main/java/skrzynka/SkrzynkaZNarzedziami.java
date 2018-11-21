package skrzynka;

import java.util.ArrayList;
import java.util.List;

public class SkrzynkaZNarzedziami {

    private List<Narzedzie> toolList;

    public SkrzynkaZNarzedziami()
    {
        this.toolList = new ArrayList<Narzedzie>();
    }

    public List<Narzedzie> getToolList() {
        return toolList;
    }
}
