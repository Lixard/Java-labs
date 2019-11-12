package lab7_8;

import org.flywaydb.core.Flyway;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public final class App {

    private static final String URL = "jdbc:mysql://127.0.0.1:3306/lab78?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "12345";
    private static final Flyway flyway = Flyway.configure().dataSource(URL, USERNAME, PASSWORD).load();

    public static void main(String[] args) {
        try (Connection connection = DriverManager.getConnection(URL, USERNAME, PASSWORD)) {
            flyway.migrate();
            Statement statement = connection.createStatement();
            statement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
