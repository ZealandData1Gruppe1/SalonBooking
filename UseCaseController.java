import java.sql.Date;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;

public class UseCaseController {
    DBSQL dbsql;

    public UseCaseController() {
        dbsql = new DBSQL();
    }
    public void opretTidbestilling()
    {
    dbsql.insertTidBestilling(1,1, LocalDate.now(), 1, "Kevin test","28702142");
    }
    public void retTidbestilling (int tbID)
    {

        dbsql.aflysTidbestilling(tbID);
        // Lav en midlertidig TB til at holde den der rettes
        //Sæt TV aflyst
        //Hvis ny TB godkendes opret TB slet midlertidig TB
        // Hvis der trykkes annuller sæt midlertidig TB som ikke aflyst

        // skal laves som en del af GUI / menu
    }
    public void sletTidbestilling(int tbID)
    {
        dbsql.aflysTidbestilling(tbID);
    }
    public ArrayList<Tidbestilling> hentTidbestillinger(String tlfnr)
    {
        ArrayList<Tidbestilling> t1 = dbsql.hentKundeAftaler(tlfnr);
        Collections.reverse(t1);
        return t1;
    }
    public ArrayList<Tidbestilling> seLedigeTider(int medID, int beID)
    {
        LocalDate dato = LocalDate.of(2023,02,22) ;//VI skal finde en måde at definere datoerne på.
        ArrayList<Tidbestilling> ledigeTider = dbsql.hentTidbestillingdagForMed(dato,1);
        //Bruges når der er indtastet behandling og frisør til at finde de ledige tider
        return  ledigeTider;
    }

    public ArrayList<Integer> hentAntalModuler(ArrayList<Tidbestilling> tListe)
            {
        ArrayList<Integer> tidsbestilling = new ArrayList<>();
        for (int i = 0; i < tListe.size(); i++)
        {
            tidsbestilling.add(dbsql.hentAntalModul(tListe.get(i).getBehandlingsID()));
        }
        return tidsbestilling;
            }


    public void blokerTidbestilling(int medID, LocalDate dato, int beID)
    {

        String beNavn = dbsql.hentBehandlingNavn(beID);

        //indsæt ferie pause og sygdom på kalender
        for (int i = 1; i <= 8; i++) {
            dbsql.insertTidBestilling(beID,medID,dato,i,beNavn,beNavn);
        }

    }
    public void blokerTidbestilling(int medID, LocalDate dato,int modul, int beID)
    {
        //indsæt pause på kalenderen

        String beNavn = dbsql.hentBehandlingNavn(beID);

        dbsql.insertTidBestilling(beID,medID,dato,modul,beNavn,beNavn);


    }

}
