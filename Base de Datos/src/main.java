import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Random;

public class main {

    private static Connection conn = null;
    private static Statement stmt = null;
    private static ResultSet result = null;



    public static void main(String[] args) {
        for (int i = 0; i < 1000; i++){
            Person Datos = new Person();
            Datos.generate();
            Datos.sql();
            try {
                conn = DriverManager.getConnection(
                        "jdbc:mysql://localhost/transportation" +
                                "?user=root&password=Loco2011");
                stmt = conn.createStatement();

                String sql = Datos.getSql();
                stmt.executeUpdate(sql);

            } catch (SQLException ex) {
                System.out.println("SQL Exception: " + ex.getMessage());
                System.out.println();
            }
            finally {
                if (result != null) {
                    try {
                        result.close();
                    } catch (SQLException sqlEx) {}
                    result = null;
                }
                if (stmt != null) {
                    try {
                        stmt.close();
                    } catch (SQLException sqlEx) {}
                    stmt = null;
                }
                if (conn != null) {
                    try {
                        conn.close();
                    } catch (SQLException sqlEx) {}
                    conn = null;
                }
            }
        }

    }
}
