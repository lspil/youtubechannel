package main;

import java.sql.DriverManager;
import java.sql.SQLException;

public class Example2 {

  public static void main(String[] args) {
    String url = "jdbc:mysql://localhost/java";
    String username = "root";
    String password = "";

    String sql = "DELETE FROM product WHERE name = ?";

    try (
      var con = DriverManager.getConnection(url, username, password);
      var stmt = con.prepareStatement(sql);
    ) {
      stmt.setString(1, "Candy");

      /**
       * true -> a select has been executed
       * false -> it's not a select
       */
      boolean res = stmt.execute();  // false

      System.out.println(res); // false
    } catch (SQLException e) {
      e.printStackTrace();
    }
  }
}

