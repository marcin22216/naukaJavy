package obiad;

public class Patelnia {

    public void usmazKotleta(Schabowy kotletDoUsmazenia) {
        if (kotletDoUsmazenia.isUbity()) {
            kotletDoUsmazenia.setUsmazony(true);
        }
    }
}
