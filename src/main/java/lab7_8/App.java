package lab7_8;


import javax.swing.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public final class App {

    /**
     * В этом методе происходит изначальная инициализация интерфейса и его стайлинг
     */
    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException | IllegalAccessException | UnsupportedLookAndFeelException | InstantiationException e) {
            e.printStackTrace();
        }
        new Gui();
    }

    /**
     * Метод позволяет получить connection для работы с бд
     *
     * @return Возвращает connection
     */
    public static Connection getConnection() {
        final String URL = "jdbc:postgresql://127.0.0.1:5432/vus";
        final String USERNAME = "postgres";
        final String PASSWORD = "123";
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return connection;
    }
}
