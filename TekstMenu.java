import java.time.LocalDate;
import java.util.ArrayList;

public class TekstMenu {
    public static void main(String[] args) {

        UseCaseController ucc = new UseCaseController();
        Tidbestilling mandag1 = new Tidbestilling();
        Tidbestilling mandag2 = new Tidbestilling();
        Tidbestilling mandag3 = new Tidbestilling();
        Tidbestilling mandag4 = new Tidbestilling();
        Tidbestilling tirsdag1 = new Tidbestilling();
        Tidbestilling tirsdag2 = new Tidbestilling();
        Tidbestilling tirsdag3 = new Tidbestilling();
        Tidbestilling tirsdag4 = new Tidbestilling();


        ArrayList<Tidbestilling> tliste = ucc.seLedigeTider(1,1);
        ArrayList<Integer> antalModuler = ucc.hentAntalModuler(tliste);
        LocalDate dato = LocalDate.of(2023,02,22);
        for (int i = 0; i < tliste.size(); i++){
            if( tliste.get(i).getDato().equals(dato)){
                switch (tliste.get(i).getStartModul()) {
                    case 1:
                        mandag1 = tliste.get(i);
                        break;
                    case 2:
                        mandag2 = tliste.get(i);
                        break;
                    case 3:
                        mandag3 = tliste.get(i);
                        break;
                    case 4:
                        mandag4 = tliste.get(i);
                        break;
                }
            }
        }
        //public void printEnDag() {
        System.out.println("MANDAG");
        System.out.println("8 - 9" + mandag1.getKundenavn());
        System.out.println("9 - 10" + mandag2.getKundenavn());
        System.out.println("10 - 11" + mandag3.getKundenavn());
        System.out.println("11 - 12" + mandag4.getKundenavn());
        //}
    }

}

