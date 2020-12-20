package db.managers;

import exceptions.DBConnectionFailedException;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnectionManager {

  private DBConnectionManager() {}

  private static final class SingletonHolder {
    private static final DBConnectionManager SINGLETON = new DBConnectionManager();
  }

  public static DBConnectionManager getInstance() {
    return SingletonHolder.SINGLETON;
  }

  public Connection getConnection() {
    String url = "jdbc:mysql://localhost/java";
    String username = "root";
    String password = "";

    try {
      var con =  DriverManager.getConnection(url, username, password);
      con.setAutoCommit(false);
      return con;
    } catch (SQLException e) {
      throw new DBConnectionFailedException();
    }
  }
}
