package main;

import java.sql.DriverManager;
import java.sql.SQLException;

public class Example1 {

  public static void main(String[] args) {
    String url = "jdbc:mysql://localhost/java";
    String username = "root";
    String password = "";

    String productName = "chocolate";
    int price = 4;

    String sql = "INSERT INTO product VALUES (NULL, ?, ?)";

    try (
        var con = DriverManager.getConnection(url, username, password);
        var stmt = con.prepareStatement(sql)
    ) {
      stmt.setString(1, productName);
      stmt.setDouble(2, price);

      stmt.executeUpdate();
    } catch (SQLException e) {
      e.printStackTrace();
    }
  }
}
