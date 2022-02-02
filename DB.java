import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DB {
  private static final String DRIVER_NAME = "com.mysql.cj.jdbc.Driver";
  private static final String DATABASE_NAME = "****"; // database name
  private static final String URL = "jdbc:mysql://localhost:3306/";
  private static final String USERNAME = "****"; // mysql db username
  private static final String PASSWORD = "****"; // mysql db password

  public static Connection getConnection() throws ClassNotFoundException, SQLException {
    Class.forName(DRIVER_NAME);
    return DriverManager.getConnection(URL + DATABASE_NAME, USERNAME, PASSWORD);
  }
}
