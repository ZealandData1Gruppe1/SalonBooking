import java.sql.*;
import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;

public class DBSQL {
    private Connection connection;
    private Statement stmt;

    DBSQL() {
        connection = null;
        stmt = null;
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/salon", "root", "Password1234");
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
    public void insertTidBestilling(int beID, int medID, LocalDate dato, int startModul, String kundeNavn, String kundeTLF)
    {
        try {
        String sql = "INSERT INTO tidbestilling(behandlingID, medarbejderID, dato,startModul, kundeNavn, kundeTLF, aflyst) VALUES("+beID+","+medID+", '"+
                dato+"',"+startModul+",'"+kundeNavn+"','"+kundeTLF+"',0)";
                Statement stmt = connection.createStatement();
        stmt.execute(sql);
        stmt.close();
    } catch (SQLException e) {
        throw new RuntimeException(e);
    }
    }


    public void aflysTidbestilling(int ordreID) {
        try {
            String sql = "UPDATE tidbestilling SET aflyst = 1 where ordreID = " + ordreID;
            Statement stmt = connection.createStatement();
            stmt.execute(sql);
            stmt.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }


    public void fortrydAflys(int ordreID) {
        try {
            String sql = "UPDATE tidbestilling SET aflyst = 0 where ordreID = " + ordreID;
            Statement stmt = connection.createStatement();
            stmt.execute(sql);
            stmt.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }


    public String hentBehandlingNavn(int beID) {
        String resultat = "";
        try {
            String sql = "SELECT navn from behandling where ID =" + beID;
            Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery(sql);

            while (rs.next()) {
                resultat = rs.getString("navn");
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return resultat;

    }

    public ArrayList<Tidbestilling> hentTidbestillingdagForMed(LocalDate dato, int medID) {
        ArrayList<Tidbestilling> bestillingListe = new ArrayList<>();

        try {
            String sql = "select * from tidbestilling where medarbejderID = " + medID + " and aflyst = 0" +
                    " and dato = '" + dato+"'";
            Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery(sql);

            while (rs.next()) {
                Tidbestilling t1 = new Tidbestilling();
                t1.setBehandlingsID(rs.getInt("behandlingID"));
                t1.setID(rs.getInt("ordreID"));
                t1.setMedarbejderID(rs.getInt("medarbejderID"));
                t1.setKundenavn(rs.getString("kundeNavn"));
                t1.setKundeTLF(rs.getString("kundeTLF"));
                t1.setDato(dato);
                t1.setStartModul(rs.getInt("startModul"));
                bestillingListe.add(t1);

            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return bestillingListe;
    }

    public int  hentAntalModul(int behandlingID) {
        int behandlingTid = 0;

        try {
            String sql = "select antalModuler from behandling where ID = " + behandlingID;
            Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery(sql);

            while (rs.next()) {
                behandlingTid = rs.getInt("antalModuler");
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return behandlingTid;
    }
    public ArrayList<Tidbestilling> hentKundeAftaler(String tlfNr)
    {
        ArrayList<Tidbestilling> bestillingListe = new ArrayList<>();

        try {
            String sql = "select * from tidbestilling where kundeTLF = '" + tlfNr + "'" + " and aflyst = 0";
            Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                Tidbestilling t1 = new Tidbestilling();
                t1.setBehandlingsID(rs.getInt("behandlingID"));
                t1.setID(rs.getInt("ordreID"));
                t1.setMedarbejderID(rs.getInt("medarbejderID"));
                t1.setKundenavn(rs.getString("kundeNavn"));
                t1.setKundeTLF(rs.getString("kundeTLF"));
                t1.setStartModul(rs.getInt("startModul"));

                Date date =rs.getDate("dato");
                t1.setDato(date.toLocalDate());
                bestillingListe.add(t1);

            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return bestillingListe;
    }
    public String hentMedarbejderNavn(int meID) {
        String resultat = "";
        try {
            String sql = "SELECT navn from medarbejder where ID =" + meID;
            Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery(sql);

            while (rs.next()) {
                resultat = rs.getString("navn");
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return resultat;

    }

    public void sletGamleAftaler(LocalDate dato)
    {
        try {
            String sql = "delete from tidbestilling where dato < '"+dato+"'";
            Statement stmt = connection.createStatement();
            stmt.execute(sql);
            stmt.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
    public LocalDate hentSidsteSletning() {
        LocalDate returdato = LocalDate.now();
        try {
        String sql = "Select dato from sletning where id =1";
        Statement stmt = connection.createStatement();
        ResultSet rs = stmt.executeQuery(sql);

        while (rs.next()) {
            Date dato = rs.getDate("dato");
            returdato =dato.toLocalDate();
        }
        }catch (SQLException e) {
                throw new RuntimeException(e);}

        return returdato;
    }
    public void setSidsteSletning(LocalDate dato)
    {
        try {
            String sql = "update sletning set dato ='"+dato+"'";
            Statement stmt = connection.createStatement();
            stmt.execute(sql);
            stmt.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    public void insertMedarbejder(String navn, String kode) {
        try {
            String sql = "INSERT INTO medarbejder(navn,kode,aktiv) VALUES('"+ navn +"','"+ kode +"',1 )";
            Statement stmt = connection.createStatement();
            stmt.execute(sql);
            stmt.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public Medarbejder hentMedarbejder(int meID) {
        Medarbejder resultat = new Medarbejder();
        try {
            String sql = "SELECT * from medarbejder where ID =" + meID;
            Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery(sql);

            while (rs.next()) {
                resultat.setID(rs.getInt("ID"));
                resultat.setNavn(rs.getString("navn"));
                resultat.setKode(rs.getString("kode"));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return resultat;

    }






}
