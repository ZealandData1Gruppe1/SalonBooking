public class Medarbejder {
    int ID;
    String navn;
    String kode;

    public Medarbejder() {
    }

    public Medarbejder(int ID, String navn, String kode) {
        this.ID = ID;
        this.navn = navn;
        this.kode = kode;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getNavn() {
        return navn;
    }

    public void setNavn(String navn) {
        this.navn = navn;
    }

    public String getKode() {
        return kode;
    }

    public void setKode(String kode) {
        this.kode = kode;
    }
}
