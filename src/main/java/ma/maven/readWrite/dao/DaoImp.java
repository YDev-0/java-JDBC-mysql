package ma.maven.readWrite.dao;

import java.sql.Connection;

public interface DaoImp {
  Connection getMysqlConnection(String host, String database, String username, String password);

}
