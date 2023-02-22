import java.sql.Date;
import java.time.LocalDate;
import java.util.ArrayList;

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
    public ArrayList<Tidbestilling> hentTidbestillinger(int tlfnr)
    {
        //Bruges til at slå en TB op for en kunde. Indtast tlfnr retunere deres ikke aflyste aftaler
        return new ArrayList<Tidbestilling>();
    }
    public ArrayList<Tidbestilling> seLedigeTider(int medID, int beID)
    {
        //Bruges når der er indtastet behandling og frisør til at finde de ledige tider
        return new ArrayList<Tidbestilling>();
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
    public ArrayList<Tidbestilling> hentTidbestillingerForAktivBruger(int medID)
    {
        //bruges når kalender loades til at vise aftaler for den relevante uge for den medarbejder der er logget ind
        return new ArrayList<Tidbestilling>()  ;
    }
}
