package modell;

public class Etel {

    private String nev;
    private int ar;

    public Etel(String sor) {

        String[] separated = sor.split(";");
        nev = separated[0];
        ar = Integer.parseInt(separated[1]);
    }

    public String getNev() {
        return nev;
    }

    public int getAr() {
        return ar;
    }

}
