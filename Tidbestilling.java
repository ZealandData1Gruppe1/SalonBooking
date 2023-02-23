import java.sql.Date;
import java.time.LocalDate;

public class Tidbestilling {
    int ID;
    int behandlingsID;
    int medarbejderID;
    String kundenavn;
    String kundeTLF;
    LocalDate dato;
    int startModul;

    public Tidbestilling() {
        this.kundenavn = "";
    }

    public Tidbestilling(int ID, int behandlingsID, int medarbejderID, String kundenavn, String kundeTLF, LocalDate dato, int startModul) {
        this.ID = ID;
        behandlingsID = behandlingsID;
        medarbejderID = medarbejderID;
        kundenavn = kundenavn;
        kundeTLF = kundeTLF;
        this.dato = dato;
        this.startModul = startModul;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getBehandlingsID() {
        return behandlingsID;
    }

    public void setBehandlingsID(int behandlingsID) {
        this.behandlingsID = behandlingsID;
    }

    public int getMedarbejderID() {
        return medarbejderID;
    }

    public void setMedarbejderID(int medarbejderID) {
        this.medarbejderID = medarbejderID;
    }

    public String getKundenavn() {
        return kundenavn;
    }

    public void setKundenavn(String kundenavn) {
        this.kundenavn = kundenavn;
    }

    public String getKundeTLF() {
        return kundeTLF;
    }

    public void setKundeTLF(String kundeTLF) {
        this.kundeTLF = kundeTLF;
    }

    public LocalDate getDato() {
        return dato;
    }

    public void setDato(LocalDate dato) {
        this.dato = dato;
    }

    public int getStartModul() {
        return startModul;
    }

    public void setStartModul(int startModul) {
        this.startModul = startModul;
    }

    @Override
    public String toString() {
        return "Tidbestilling{" +
                "ID=" + ID +
                ", behandlingsID=" + behandlingsID +
                ", medarbejderID=" + medarbejderID +
                ", kundenavn='" + kundenavn + '\'' +
                ", kundeTLF='" + kundeTLF + '\'' +
                ", dato=" + dato +
                ", startModul=" + startModul +
                '}';
    }
}
