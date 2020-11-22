package example1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Example1 {

  public static void main(String[] args) {
    String url = "jdbc:mysql://localhost/java";
    String username = "root";
    String password = "";

    // SQLException
    try (
        Connection con = DriverManager.getConnection(url, username, password);
        Statement stmt = con.createStatement();
    ) {
      // execute() executeUpdate() executeQuery()
      // executeUpdate() --> INSERT, UPDATE, DELETE
      stmt.executeUpdate("INSERT INTO product VALUES (NULL, 'Beer', 5)"); // send a SQL query to the DBMS
    } catch (SQLException e) {
      e.printStackTrace();
    }
  }
}
