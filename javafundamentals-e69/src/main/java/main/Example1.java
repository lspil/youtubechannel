package main;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Example1 {

  public static void main(String[] args) {
    String url = "jdbc:mysql://localhost/java";
    String username = "root";
    String password = "";

    String sql = "SELECT * FROM product WHERE price > ?";
    double priceValue = 3;

    try (
        var con = DriverManager.getConnection(url, username, password);
        var stmt = con.prepareStatement(sql);
    ) {

      stmt.setDouble(1, priceValue);

      var rs = stmt.executeQuery();

      /**
       * 1	Beer	5
       * 2	Beer	5
       * 3	Beer	5
       ->
       */

      while (rs.next()) {
        int id = rs.getInt("id");
        String name = rs.getString("name");
        double price = rs.getDouble("price");

        System.out.println(id + " " + name + " " + price);
      }
    } catch (SQLException e) {
      e.printStackTrace();
    }

  }
}
