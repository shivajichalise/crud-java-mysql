import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;

public class CrudOps {
  PreparedStatement stmt = null;

  public void insert() {
    String query = "INSERT INTO users (`name`, `age`) VALUES (?,?)";
    try {
      stmt = DB.getConnection().prepareStatement(query);
      stmt.setString(1, "Rick Astley");
      stmt.setInt(2, 45);
      stmt.executeUpdate();
    } catch (ClassNotFoundException | SQLException e) {
      e.printStackTrace();
    }
  }

  public void read() {
    String query = "SELECT * FROM users";

    try {
      stmt = DB.getConnection().prepareStatement(query);
      ResultSet res = stmt.executeQuery();

      while (res.next()) {
        System.out.println("#################");
        System.out.println("ID: " + res.getInt(1));
        System.out.println("NAME: " + res.getString(2));
        System.out.println("AGE: " + res.getInt(3));
        System.out.println("#################");
      }
    } catch (ClassNotFoundException | SQLException e) {
      e.printStackTrace();
    }
  }

  public void update() {
    String query = "UPDATE `users` SET `name` = ?, `age` = ? WHERE `users`.`id` = ?";
    try {
      stmt = DB.getConnection().prepareStatement(query);
      stmt.setString(1, "Never Gonna Give You Up");
      stmt.setInt(2, 40);
      stmt.setInt(3, 1);
      stmt.executeUpdate();
    } catch (ClassNotFoundException | SQLException e) {
      e.printStackTrace();
    }
  }

  public void delete() {
    String query = "DELETE FROM `users` WHERE `users`.`id` = ?";
    try {
      stmt = DB.getConnection().prepareStatement(query);
      stmt.setInt(1, 1);
      stmt.executeUpdate();
    } catch (ClassNotFoundException | SQLException e) {
      e.printStackTrace();
    }
  }
}
