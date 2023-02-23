import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;
import java.util.ArrayList;
import java.util.Scanner;

public class TekstMenu {
    public static void printSkema(ArrayList<Tidbestilling> mandagListe, ArrayList<Tidbestilling> tirsdagListe, ArrayList<Tidbestilling> onsdagListe) {

        UseCaseController ucc = new UseCaseController();
        Tidbestilling mandag1 = new Tidbestilling();
        Tidbestilling mandag2 = new Tidbestilling();
        Tidbestilling mandag3 = new Tidbestilling();
        Tidbestilling mandag4 = new Tidbestilling();
        Tidbestilling tirsdag1 = new Tidbestilling();
        Tidbestilling tirsdag2 = new Tidbestilling();
        Tidbestilling tirsdag3 = new Tidbestilling();
        Tidbestilling tirsdag4 = new Tidbestilling();
        Tidbestilling onsdag1 = new Tidbestilling();
        Tidbestilling onsdag2 = new Tidbestilling();
        Tidbestilling onsdag3 = new Tidbestilling();
        Tidbestilling onsdag4 = new Tidbestilling();


        for (int i = 0; i < mandagListe.size(); i++) {
            switch (mandagListe.get(i).getStartModul()) {
                case 1:
                    mandag1 = mandagListe.get(i);
                    break;
                case 2:
                    mandag2 = mandagListe.get(i);
                    break;
                case 3:
                    mandag3 = mandagListe.get(i);
                    break;
                case 4:
                    mandag4 = mandagListe.get(i);
                    break;
            }
        }


        for (int i = 0; i < tirsdagListe.size(); i++) {
            switch (tirsdagListe.get(i).getStartModul()) {
                case 1:
                    tirsdag1 = tirsdagListe.get(i);
                    break;
                case 2:
                    tirsdag2 = tirsdagListe.get(i);
                    break;
                case 3:
                    tirsdag3 = tirsdagListe.get(i);
                    break;
                case 4:
                    tirsdag4 = tirsdagListe.get(i);
                    break;
            }
        }

        for (int i = 0; i < onsdagListe.size(); i++) {
            switch (onsdagListe.get(i).getStartModul()) {
                case 1:
                    onsdag1 = onsdagListe.get(i);
                    break;
                case 2:
                    onsdag2 = onsdagListe.get(i);
                    break;
                case 3:
                    onsdag3 = onsdagListe.get(i);
                    break;
                case 4:
                    onsdag4 = onsdagListe.get(i);
                    break;
            }
        }


        System.out.printf("%8s%8s%8s%8s%8s","        MANDAG","TIRSDAG","ONSDAG","TORSDAG","FREDAG");
        System.out.println();
        System.out.print("8 - 9");
        System.out.printf("%8s%8s%8s", mandag1.getKundenavn(), tirsdag1.getKundenavn(),onsdag1.getKundenavn());
        System.out.println();
        System.out.println("9 - 10");
        System.out.println("10 - 11");
        System.out.println("11 - 12");
    }

    public static void main(String[] args) {

        menu();

    }


    public static void menu() {
        Scanner input = new Scanner(System.in);
        int valg;
        UseCaseController ucc = new UseCaseController();
        System.out.println("1. Se denne uge");
        System.out.println("2. Opret tidbestilling");
        System.out.println("3. Slet tidbestilling");
        System.out.println("4. Se ledige tider");
        System.out.println("5. Bloker en tidbestilling");
        System.out.println("6. Ret en tidbestilling");


        System.out.println("indtast dit valg: ");

        valg = input.nextInt();

        switch (valg) {
            case 1:
                LocalDate mandag = LocalDate.now().with(TemporalAdjusters.previousOrSame(DayOfWeek.MONDAY));
                LocalDate tirsdag = mandag.plusDays(1);
                LocalDate onsdag = mandag.plusDays(2);
                LocalDate torsdag = mandag.plusDays(3);
                LocalDate fredag = mandag.plusDays(4);

                ArrayList<Tidbestilling> mandagListe = ucc.seLedigeTider(1, mandag);
                ArrayList<Tidbestilling> tirsdagListe = ucc.seLedigeTider(1, tirsdag);
                ArrayList<Tidbestilling> onsdagListe = ucc.seLedigeTider(1, onsdag);

                printSkema(mandagListe, tirsdagListe, onsdagListe);
                break;
            case 2:
                System.out.println("Indtast tidbestilling oplysninger: ");
                ucc.opretTidbestilling(input.nextInt(), input.nextInt(), LocalDate.now(), input.nextInt(), input.next(), input.next());

                break;
            case 3:

                break;
            case 4:

                break;
            case 5:


            case 6:


        }


    }
}

