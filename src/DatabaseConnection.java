import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {

    private static final String URL = "jdbc:postgresql://localhost:5432/oop";
    private static final String USER = "postgres";
    private static final String PASSWORD = "Danibegr111!";

    public static Connection connect() {
        try {
            Class.forName("org.postgresql.Driver");

            return DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Ошибка подключения: " + e.getMessage());
            return null;
        }
    }
}
