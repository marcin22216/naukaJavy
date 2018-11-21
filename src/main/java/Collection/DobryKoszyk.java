package Collection;

import java.util.ArrayList;
import java.util.List;

public class DobryKoszyk {

    private List<Jablko> jablkoList;

    public DobryKoszyk() {
        this.jablkoList = new ArrayList<Jablko>();
    }

    public List<Jablko> getJablkoList() {
        return jablkoList;
    }
}
