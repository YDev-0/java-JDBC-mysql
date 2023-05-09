package ma.maven.readWrite.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Dao implements DaoImp {


  @Override
  public Connection getMysqlConnection(String host, String database, String username, String password) {
    String url = "jdbc:mysql://" + host + '/' + database;
    Connection connection = null;
    try {
      Class.forName("com.mysql.cj.jdbc.Driver");
      connection = DriverManager.getConnection(url, username, password);
    } catch (ClassNotFoundException e) {
      System.err.println(e.getMessage());
    } catch (SQLException e) {
      System.err.println(e.getMessage());
    }
    return connection;
  }
}
