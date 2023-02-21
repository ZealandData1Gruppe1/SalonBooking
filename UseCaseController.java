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
        // Lav en midlertidig TB til at holde den der rettes
        //Sæt TV aflyst
        //Hvis ny TB godkendes opret TB slet midlertidig TB
        // Hvis der trykkes annuller sæt midlertidig TB som ikke aflyst
    }
    public void sletTidbestilling(int tbID)
    {
        //sæt TB som aflyst
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
    public void blokerTidbestilling(int medID, LocalDate Dato)
    {
        //indsæt ferie pause og sygdom på kalender
    }
    public void blokerTidbestilling(int medID, LocalDate Dato,int modul)
    {
        //indsæt pause på kalenderen
    }
    public ArrayList<Tidbestilling> hentTidbestillingerForAktivBruger(int medID)
    {
        //bruges når kalender loades til at vise aftaler for den relevante uge for den medarbejder der er logget ind
        return new ArrayList<Tidbestilling>()  ;
    }
}
