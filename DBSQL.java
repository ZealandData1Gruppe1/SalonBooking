import java.sql.*;
import java.time.LocalDate;

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



}
