import java.sql.Date;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        UseCaseController ucc = new UseCaseController();

        LocalDate dato = LocalDate.of(2023,02,23) ;
        //ucc.opretTidbestilling();
        //ucc.sletTidbestilling(1);
        //ucc.blokerTidbestilling(1,dato,1,3);
        System.out.println(ucc.hentTidbestillinger("28702142"));

    }

}
