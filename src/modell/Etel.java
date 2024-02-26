package modell;

public class Etel {

    private String nev;
    private int ar;

    public Etel(String sor) {

        String[] separated = sor.split(";");
        System.out.println(separated[0]);
       System.out.println(separated[1]);

    }

    public String getNev() {
        return nev;
    }

    public int getAr() {
        return ar;
    }

}
