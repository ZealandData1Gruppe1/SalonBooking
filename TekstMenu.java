import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;
import java.util.ArrayList;
import java.util.Scanner;

public class TekstMenu {
    public static void printSkema(ArrayList<Tidbestilling> mandagListe, ArrayList<Tidbestilling> tirsdagListe, ArrayList<Tidbestilling> onsdagListe, ArrayList<Tidbestilling> torsdagListe, ArrayList<Tidbestilling>fredagListe){

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
        Tidbestilling torsdag1 = new Tidbestilling();
        Tidbestilling torsdag2 = new Tidbestilling();
        Tidbestilling torsdag3 = new Tidbestilling();
        Tidbestilling torsdag4 = new Tidbestilling();
        Tidbestilling fredag1 = new Tidbestilling();
        Tidbestilling fredag2 = new Tidbestilling();
        Tidbestilling fredag3 = new Tidbestilling();
        Tidbestilling fredag4 = new Tidbestilling();


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

        for (int i = 0; i < torsdagListe.size(); i++) {
            switch (torsdagListe.get(i).getStartModul()) {
                case 1:
                    torsdag1 = torsdagListe.get(i);
                    break;
                case 2:
                    torsdag2 = torsdagListe.get(i);
                    break;
                case 3:
                    torsdag3 = torsdagListe.get(i);
                    break;
                case 4:
                    torsdag4 = torsdagListe.get(i);
                    break;
            }
        }

        for (int i = 0; i < fredagListe.size(); i++) {
            switch (fredagListe.get(i).getStartModul()) {
                case 1:
                    fredag1 = fredagListe.get(i);
                    break;
                case 2:
                    fredag2 = fredagListe.get(i);
                    break;
                case 3:
                    fredag3 = fredagListe.get(i);
                    break;
                case 4:
                    fredag4 = fredagListe.get(i);
                    break;
            }
        }



        System.out.printf(" %8s %8s %8s %8s %8s","        MANDAG","  TIRSDAG","  ONSDAG ","  TORSDAG","  FREDAG");
        System.out.println();
        System.out.printf("%-7s", " 8 - 9");
        System.out.printf("  %-8.8s  %-8.8s  %-8.8s  %-8.8s  %-8.8s", mandag1.getKundenavn(), tirsdag1.getKundenavn(),onsdag1.getKundenavn(),torsdag1.getKundenavn(),fredag1.getKundenavn());
        System.out.println();
        System.out.printf("%-7s", " 9 - 10");
        System.out.printf("  %-8.8s  %-8.8s  %-8.8s  %-8.8s  %-8.8s", mandag2.getKundenavn(), tirsdag2.getKundenavn(),onsdag2.getKundenavn(),torsdag2.getKundenavn(),fredag2.getKundenavn());
        System.out.println();
        System.out.printf("%-7s", "10 - 11");
        System.out.printf("  %-8.8s  %-8.8s  %-8.8s  %-8.8s  %-8.8s", mandag3.getKundenavn(), tirsdag3.getKundenavn(),onsdag3.getKundenavn(),torsdag3.getKundenavn(),fredag3.getKundenavn());
        System.out.println();
        System.out.printf("%-7s", "11 - 12");
        System.out.printf("  %-8.8s  %-8.8s  %-8.8s  %-8.8s  %-8.8s", mandag4.getKundenavn(), tirsdag4.getKundenavn(),onsdag4.getKundenavn(),torsdag4.getKundenavn(),fredag4.getKundenavn());
    }

    public static void main(String[] args) {
        LocalDate mandag = LocalDate.now().with(TemporalAdjusters.previousOrSame(DayOfWeek.MONDAY));
        LocalDate tirsdag = mandag.plusDays(1);
        LocalDate onsdag = mandag.plusDays(2);
        LocalDate torsdag = mandag.plusDays(3);
        LocalDate fredag = mandag.plusDays(4);

        UseCaseController ucc = new UseCaseController();
        ucc.opretTidbestilling(1,1, mandag, 1,"emil", "88888888");
        ucc.opretTidbestilling(1,1, tirsdag, 4,"sercan", "55888888");
        ucc.opretTidbestilling(1,1, onsdag, 4,"emil", "88888888");
        ucc.opretTidbestilling(1,1, torsdag, 4,"peterjensen", "88888888");
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
                ArrayList<Tidbestilling> torsdagListe = ucc.seLedigeTider(1, torsdag);
                ArrayList<Tidbestilling> fredagListe = ucc.seLedigeTider(1, fredag);

                printSkema(mandagListe, tirsdagListe, onsdagListe, torsdagListe, fredagListe);
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

