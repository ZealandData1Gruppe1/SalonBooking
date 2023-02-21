public class Behandling {
    int ID;
    String navn;
    int antalModuler;

    public Behandling() {
    }

    public Behandling(int ID, String navn, int antalModuler) {
        this.ID = ID;
        this.navn = navn;
        this.antalModuler = antalModuler;
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

    public int getAntalModuler() {
        return antalModuler;
    }

    public void setAntalModuler(int antalModuler) {
        this.antalModuler = antalModuler;
    }
}
