package main;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Example2 {

  public static void main(String[] args) {
    String url = "jdbc:mysql://localhost/java";
    String username = "root";
    String password = "";

    String sql = "SELECT * FROM product";

    try (
      var con = DriverManager.getConnection(url, username, password);
      var stmt = con.prepareStatement(sql);
    ) {
      /**
       * execute()
       *    -> Can be used for ANY SQL query  (INSERT, UPDATE, SELECT, ALTER, CREATE, DROP, TRUNCATE)
       *    -> boolean -> true if it was a SELECT and false otherwise
       * executeUpdate()
       *    -> INSERT, UPDATE, DELETE
       *    -> returns an int
       * executeQuery()
       *    -> SELECT
       *    -> ResultSet
       */

      ResultSet rs = stmt.executeQuery();

      while(rs.next()) { // returns true if a row was selected and false if no row was selected
        int id = rs.getInt("id");
        String name = rs.getString("name");
        double price = rs.getDouble("price");

        System.out.println(id + " " + name + " " + price);
      }
      /**
       *
       * 1	Beer	5
       * 2	Beer	5
       * 3	Beer	5
       * 4	chocolate	4
       * 5	chocolate	4
       * 6	Candy	3
       * 7	Candy	3
       ->
       */
    } catch (SQLException e) {
      e.printStackTrace();
    }
  }
}
