package firstLesson;

import java.util.Date;

public class Formularz {

    private int rokUrodzenia;

    private boolean czyMaszObywatelstwoPolskie;

    private double twojaWaga;

    private float twojWzrost;

    private String twojeImie;

    private Date dataUrodzenia;

    public int getRokUrodzenia() {
        return rokUrodzenia;
    }

    public void setRokUrodzenia(int rokUrodzenia) {
        this.rokUrodzenia = rokUrodzenia;
    }

    public boolean isCzyMaszObywatelstwoPolskie() {
        return czyMaszObywatelstwoPolskie;
    }

    public void setCzyMaszObywatelstwoPolskie(boolean czyMaszObywatelstwoPolskie) {
        this.czyMaszObywatelstwoPolskie = czyMaszObywatelstwoPolskie;
    }

    public double getTwojaWaga() {
        return twojaWaga;
    }

    public void setTwojaWaga(double twojaWaga) {
        this.twojaWaga = twojaWaga;
    }

    public float getTwojWzrost() {
        return twojWzrost;
    }

    public void setTwojWzrost(float twojWzrost) {
        this.twojWzrost = twojWzrost;
    }

    public String getTwojeImie() {
        return twojeImie;
    }

    public void setTwojeImie(String twojeImie) {
        this.twojeImie = twojeImie;
    }

    public Date getDataUrodzenia() {
        return dataUrodzenia;
    }

    public void setDataUrodzenia(Date dataUrodzenia) {
        this.dataUrodzenia = dataUrodzenia;
    }
}
