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


        //Printer Skemaet
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

    public static void BestilEnTid(ArrayList<Tidbestilling> mandagListe, ArrayList<Tidbestilling> tirsdagListe, ArrayList<Tidbestilling> onsdagListe, ArrayList<Tidbestilling> torsdagListe, ArrayList<Tidbestilling>fredagListe,ArrayList<Integer>mandagModul,ArrayList<Integer>tirsdagModul, ArrayList<Integer>onsdagModul, ArrayList<Integer>torsdagModul,ArrayList<Integer>fredagModul)
    {
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

        String [] mandagLedig = {"Ledig","Ledig","Ledig","Ledig","Ledig","Ledig","Ledig","Ledig","Ledig"};
        String [] tirsdagLedig = {"Ledig","Ledig","Ledig","Ledig","Ledig","Ledig","Ledig","Ledig","Ledig"};
        String [] onsdagLedig = {"Ledig","Ledig","Ledig","Ledig","Ledig","Ledig","Ledig","Ledig","Ledig"};
        String [] torsdagLedig = {"Ledig","Ledig","Ledig","Ledig","Ledig","Ledig","Ledig","Ledig","Ledig"};
        String [] fredagLedig = {"Ledig","Ledig","Ledig","Ledig","Ledig","Ledig","Ledig","Ledig","Ledig"};

        for(int i=0; i<mandagListe.size();i++) {
            switch (mandagListe.get(i).getStartModul()) {
                case 1:
                    mandagLedig[0] = "X";
                    if (mandagModul.get(i) == 2) {
                        mandagLedig[1] = "X";
                    }
                    if (mandagModul.get(i) == 3) {
                        mandagLedig[1] = "X";
                        mandagLedig[2] = "X";
                    }
                    break;
                case 2:
                    mandagLedig[1] = "X";
                    if (mandagModul.get(i) == 2) {
                        mandagLedig[2] = "X";
                    }
                    if (mandagModul.get(i) == 3) {
                        mandagLedig[2] = "X";
                        mandagLedig[3] = "X";
                    }
                    break;
                case 3:
                    mandagLedig[2] = "X";
                    if (mandagModul.get(i) == 2) {
                        mandagLedig[3] = "X";
                    }
                    if (mandagModul.get(i) == 3) {
                        mandagLedig[3] = "X";
                        mandagLedig[4] = "X";
                    }
                    break;
                case 4:
                    mandagLedig[3] = "X";
                    if (mandagModul.get(i) == 2) {
                        mandagLedig[4] = "X";
                    }
                    if (mandagModul.get(i) == 3) {
                        mandagLedig[4] = "X";
                        mandagLedig[5] = "X";
                        break;

                    }
            }
        }
        for(int i=0; i<tirsdagListe.size();i++) {
            switch (tirsdagListe.get(i).getStartModul()) {
                case 1:
                    tirsdagLedig[0]="X";
                    if (tirsdagModul.get(i) == 2) {
                        tirsdagLedig[1]="X";
                    }
                    if (tirsdagModul.get(i) == 3) {
                        tirsdagLedig[1]="X";
                        tirsdagLedig[2]="X";
                    }
                    break;
                case 2:
                    tirsdagLedig[1]="X";
                    if (tirsdagModul.get(i) == 2) {
                        tirsdagLedig[2]="X";
                    }
                    if (tirsdagModul.get(i) == 3) {
                        tirsdagLedig[2]="X";
                        tirsdagLedig[3]="X";
                    }
                    break;
                case 3:
                    tirsdagLedig[2]="X";
                    if (tirsdagModul.get(i) == 2) {
                        tirsdagLedig[3]="X";
                    }
                    if (tirsdagModul.get(i) == 3) {
                        tirsdagLedig[3]="X";
                        tirsdagLedig[4]="X";
                    }
                    break;
                case 4:
                    tirsdagLedig[3]="X";
                    if (tirsdagModul.get(i) == 2) {
                        tirsdagLedig[4]="X";
                    }
                    if (tirsdagModul.get(i) == 3) {
                        tirsdagLedig[4]="X";
                        tirsdagLedig[5]="X";
                    }
                    break;
            }
        }
        for(int i=0; i<onsdagListe.size();i++)
        {
            switch(onsdagListe.get(i).getStartModul())
            {
                case 1:
                    onsdagLedig[0]="X";
                    if (onsdagModul.get(i) == 2) {
                        onsdagLedig[1]="X";
                    }
                    if (onsdagModul.get(i) == 3) {
                        onsdagLedig[1]="X";
                        onsdagLedig[2]="X";
                    }
                    break;
                case 2:
                    onsdagLedig[1]="X";
                    if (onsdagModul.get(i) == 2) {
                        onsdagLedig[2]="X";
                    }
                    if (onsdagModul.get(i) == 3) {
                        onsdagLedig[2]="X";
                        onsdagLedig[3]="X";
                    }
                    break;
                case 3:
                    onsdagLedig[2]="X";
                    if (onsdagModul.get(i) == 2) {
                        onsdagLedig[3]="X";
                    }
                    if (onsdagModul.get(i) == 3) {
                        onsdagLedig[3]="X";
                        onsdagLedig[4]="X";
                    }
                    break;
                case 4:
                    onsdagLedig[3]="X";
                    if (onsdagModul.get(i) == 2) {
                        onsdagLedig[4]="X";
                    }
                    if (onsdagModul.get(i) == 3) {
                        onsdagLedig[4]="X";
                        onsdagLedig[5]="X";
                    }
                    break;
            }
        }
        for(int i=0; i<torsdagListe.size();i++)
        {
            switch(torsdagListe.get(i).getStartModul())
            {
                case 1:
                    torsdagLedig[0]="X";
                    if (torsdagModul.get(i) == 2) {
                        torsdagLedig[1]="X";
                    }
                    if (torsdagModul.get(i) == 3) {
                        torsdagLedig[1]="X";
                        torsdagLedig[2]="X";
                    }
                    break;
                case 2:
                    torsdagLedig[1]="X";
                    if (torsdagModul.get(i) == 2) {
                        torsdagLedig[2]="X";
                    }
                    if (torsdagModul.get(i) == 3) {
                        torsdagLedig[2]="X";
                        torsdagLedig[3]="X";
                    }
                    break;
                case 3:
                    torsdagLedig[2]="X";
                    if (torsdagModul.get(i) == 2) {
                        torsdagLedig[3]="X";
                    }
                    if (torsdagModul.get(i) == 3) {
                        torsdagLedig[3]="X";
                        torsdagLedig[4]="X";
                    }
                    break;
                case 4:
                    torsdagLedig[3]="X";
                    if (torsdagModul.get(i) == 2) {
                        torsdagLedig[4]="X";
                    }
                    if (torsdagModul.get(i) == 3) {
                        torsdagLedig[4]="X";
                        torsdagLedig[5]="X";
                    }
                    break;
            }

        }
        for(int i=0; i<fredagListe.size();i++)
        {
            switch(fredagListe.get(i).getStartModul())
            {
                case 1:
                    fredagLedig[0]="X";
                    if (fredagModul.get(i) == 2) {
                        fredagLedig[1]="X";
                    }
                    if (fredagModul.get(i) == 3) {
                        fredagLedig[1]="X";
                        fredagLedig[2]="X";
                    }
                    break;
                case 2:
                    fredagLedig[1]="X";
                    if (fredagModul.get(i) == 2) {
                        fredagLedig[2]="X";
                    }
                    if (fredagModul.get(i) == 3) {
                        fredagLedig[2]="X";
                        fredagLedig[3]="X";
                    }
                    break;
                case 3:
                    fredagLedig[2]="X";
                    if (fredagModul.get(i) == 2) {
                        fredagLedig[3]="X";
                    }
                    if (fredagModul.get(i) == 3) {
                        fredagLedig[3]="X";
                        fredagLedig[4]="X";
                    }
                    break;
                case 4:
                    fredagLedig[3]="X";
                    if (fredagModul.get(i) == 2) {
                        fredagLedig[4]="X";
                    }
                    if (fredagModul.get(i) == 3) {
                        fredagLedig[4]="X";
                        fredagLedig[5]="X";
                    }
                    break;
            }

        }
        //Printer Skemaet
        System.out.printf(" %8s %8s %8s %8s %8s","        MANDAG","  TIRSDAG","  ONSDAG ","  TORSDAG","  FREDAG");
        System.out.println();
        System.out.printf("%-7s", " 8 - 9");
        System.out.printf("  %-8.8s  %-8.8s  %-8.8s  %-8.8s  %-8.8s", mandagLedig[0], tirsdagLedig[0],onsdagLedig[0],torsdagLedig[0],fredagLedig[0]);
        System.out.println();
        System.out.printf("%-7s", " 9 - 10");
        System.out.printf("  %-8.8s  %-8.8s  %-8.8s  %-8.8s  %-8.8s", mandagLedig[1], tirsdagLedig[1],onsdagLedig[1],torsdagLedig[1],fredagLedig[1]);
        System.out.println();
        System.out.printf("%-7s", "10 - 11");
        System.out.printf("  %-8.8s  %-8.8s  %-8.8s  %-8.8s  %-8.8s", mandagLedig[2], tirsdagLedig[2],onsdagLedig[2],torsdagLedig[2],fredagLedig[2]);
        System.out.println();
        System.out.printf("%-7s", "11 - 12");
        System.out.printf("  %-8.8s  %-8.8s  %-8.8s  %-8.8s  %-8.8s", mandagLedig[3], tirsdagLedig[3],onsdagLedig[3],torsdagLedig[3],fredagLedig[3]);

    }


    public static void printKundeTid(ArrayList<Tidbestilling> kundeTider) {
        for(int i = 0; i < kundeTider.size(); i++) {
            Tidbestilling t1 = kundeTider.get(i);
            int ID = t1.getID();
            int beID = t1.getBehandlingsID();
            int meID = t1.getMedarbejderID();
            String kundeNavn = t1.getKundenavn();
            String kundeTLF = t1.getKundeTLF();
            LocalDate dato = t1.getDato();
            int startmodul = t1.getStartModul();
            System.out.println("Ordre ID : " + ID + "   Behandling : " + beID + "   Medarbejder : " + meID + "   Kundenavn : " + kundeNavn + "   Kunde tlf nr : " + kundeTLF + "   Dato : " + dato + "   Startmodul : " + startmodul);
        }
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
        System.out.println("7. Find kundes tider");


        System.out.println("indtast dit valg: ");

        valg = input.nextInt();

        switch (valg) {
            case 1:
                LocalDate mandag = LocalDate.now().with(TemporalAdjusters.previousOrSame(DayOfWeek.MONDAY));
                LocalDate tirsdag = mandag.plusDays(1);
                LocalDate onsdag = mandag.plusDays(2);
                LocalDate torsdag = mandag.plusDays(3);
                LocalDate fredag = mandag.plusDays(4);

                ArrayList<Tidbestilling> mandagListe = ucc.seLedigeTider(2, mandag);
                ArrayList<Tidbestilling> tirsdagListe = ucc.seLedigeTider(2, tirsdag);
                ArrayList<Tidbestilling> onsdagListe = ucc.seLedigeTider(2, onsdag);
                ArrayList<Tidbestilling> torsdagListe = ucc.seLedigeTider(2, torsdag);
                ArrayList<Tidbestilling> fredagListe = ucc.seLedigeTider(2, fredag);

                printSkema(mandagListe, tirsdagListe, onsdagListe, torsdagListe, fredagListe);
                break;
            case 2:
                System.out.println("Vælg en behandling: ");
                int behandlingID= input.nextInt();
                System.out.println("Vælg en Frisør");
                int medarbejderID= input.nextInt();
                LocalDate mandagtid = LocalDate.now().with(TemporalAdjusters.previousOrSame(DayOfWeek.MONDAY));
                LocalDate tirsdagtid = mandagtid.plusDays(1);
                LocalDate onsdagtid = mandagtid.plusDays(2);
                LocalDate torsdagtid = mandagtid.plusDays(3);
                LocalDate fredagtid = mandagtid.plusDays(4);

                ArrayList<Tidbestilling> mandagListetid = ucc.seLedigeTider(medarbejderID, mandagtid);
                ArrayList<Tidbestilling> tirsdagListetid = ucc.seLedigeTider(medarbejderID, tirsdagtid);
                ArrayList<Tidbestilling> onsdagListetid = ucc.seLedigeTider(medarbejderID, onsdagtid);
                ArrayList<Tidbestilling> torsdagListetid = ucc.seLedigeTider(medarbejderID, torsdagtid);
                ArrayList<Tidbestilling> fredagListetid = ucc.seLedigeTider(medarbejderID, fredagtid);

                ArrayList<Integer> mandagModul = ucc.hentAntalModuler(mandagListetid);
                ArrayList<Integer> tirsdagModul = ucc.hentAntalModuler(tirsdagListetid);
                ArrayList<Integer> onsdagModul = ucc.hentAntalModuler(onsdagListetid);
                ArrayList<Integer> torsdagModul = ucc.hentAntalModuler(torsdagListetid);
                ArrayList<Integer> fredagModul = ucc.hentAntalModuler(fredagListetid);

                BestilEnTid(mandagListetid,tirsdagListetid,onsdagListetid,torsdagListetid,fredagListetid,mandagModul,tirsdagModul,onsdagModul,torsdagModul,fredagModul);
                System.out.println("");
                System.out.println("Vælg en dag: 1-5");
                int dag= input.nextInt();
                System.out.println("Vælg et modul: 1-4");
                int modul= input.nextInt();
                LocalDate dato = LocalDate.now();
                System.out.println("Navn:");
                String navn = input.next();
                System.out.println("Telefonnummer:");
                String tlf = input.next();
                switch (dag)
                {
                    case 1:
                        dato = mandagtid;
                        break;
                    case 2:
                        dato = tirsdagtid;
                        break;
                    case 3:
                        dato = onsdagtid;
                        break;
                    case 4:
                        dato =torsdagtid;
                        break;
                    case 5:
                        dato =fredagtid;
                        break;
                }
                ucc.opretTidbestilling(behandlingID,medarbejderID,dato,modul,navn,tlf);
                break;

            case 3:
                //Her skal skema vises

                System.out.println("Indtast nummeret på den bestilling du vil slette");
                int IDslet = input.nextInt();
                ucc.sletTidbestilling(IDslet);
                System.out.println("Du har nu slettet tidsbestillingen!");
                break;
            case 4:
                System.out.println("Indtast en medarbejder og en dato: ");
                int inputMedID = input.nextInt();

                LocalDate m = LocalDate.now().with(TemporalAdjusters.previousOrSame(DayOfWeek.MONDAY));
                LocalDate ti = m.plusDays(1);
                LocalDate o = m.plusDays(2);
                LocalDate to = m.plusDays(3);
                LocalDate f = m.plusDays(4);

                ArrayList<Tidbestilling> tbs = ucc.seLedigeTider(inputMedID,m);
                System.out.println(tbs);
                break;
            case 5:
                System.out.println("Indtast medarbejderID: ");
                int medID = input.nextInt();
                System.out.println("Indtast År , Måned, Dag : ");
                LocalDate feriedato = LocalDate.of(input.nextInt(),input.nextInt(),input.nextInt());
                System.out.println("Indtast behandlingID: ");
                int beID = input.nextInt();

                ucc.blokerTidbestilling(medID,feriedato,beID);
                break;

            case 6:
                break;

            case 7:
                System.out.println("Indtast kundes telefonnummer: ");
                String tlfNR = input.next();
                ArrayList<Tidbestilling> kundetiderListe = ucc.hentTidbestillinger(tlfNR);
                System.out.println("Her er tiderne for kunde med telefon nummer: " + tlfNR);
                printKundeTid(kundetiderListe);
                break;

        }
    }
    public static void main(String[] args) {
        LocalDate mandag = LocalDate.now().with(TemporalAdjusters.previousOrSame(DayOfWeek.MONDAY));
        LocalDate tirsdag = mandag.plusDays(1);
        LocalDate onsdag = mandag.plusDays(2);
        LocalDate torsdag = mandag.plusDays(3);
        LocalDate fredag = mandag.plusDays(4);

        //UseCaseController ucc = new UseCaseController();
       // ucc.opretTidbestilling(2,1, fredag, 2,"emil", "88888888");
        //ucc.opretTidbestilling(2,1, tirsdag, 1,"sercan", "55888888");

        menu();
    }





    }


