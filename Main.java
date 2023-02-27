import java.sql.Array;
import java.sql.Date;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        UseCaseController ucc = new UseCaseController();

        ArrayList<Tidbestilling> u1 = ucc.hentTidbestillingerForUgeMedID(1);

        for (int i=0; i<u1.size();i++)
        {
            if(u1.get(i).getDato().equals(ucc.getDag()))
            {
                // Mandag
            }
            if(u1.get(i).getDato().equals(ucc.getDag().plusDays(1)))
            {
                //tirsdag
            }
            if(u1.get(i).getDato().equals(ucc.getDag().plusDays(2)))
            {
                //onsdag
            }
            if(u1.get(i).getDato().equals(ucc.getDag().plusDays(3)))
            {
               //torsdaf
            }
            if(u1.get(i).getDato().equals(ucc.getDag().plusDays(4)))
            {
                //fredag
            }

            }






        }


    }

}
