package ma.maven.readWrite.dao.imp;

import ma.maven.readWrite.dao.GcharacterDao;
import ma.maven.readWrite.dao.GclassDao;
import ma.maven.readWrite.entities.Gcharacter;
import ma.maven.readWrite.entities.Gclass;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class GclassDaoImp implements GclassDao {

  private static Connection conn = Dao.getConnection();

  @Override
  public void insert(Gclass gcharacter) {

  }

  @Override
  public void update(Gclass gcharacter) {

  }

  @Override
  public void deleteById(int id) {

  }

  @Override
  public Gclass findById(int id) {
    PreparedStatement ps = null;
    ResultSet rs = null;

    try {
      ps = conn.prepareStatement("SELECT * FROM gclass where id = ?");
      ps.setInt(1, id);
      rs = ps.executeQuery();

      Gclass gclass = new Gclass();

      if (rs.next()) {
        gclass.setId(rs.getInt("id"));
        gclass.setLabel(rs.getString("label"));
        gclass.setDescription(rs.getString("description"));
      }

      return gclass;
    } catch (SQLException e) {
      System.err.println("problème de requête pour sélectionner un département");;
      return null;
    } finally {
      Dao.closeResultSet(rs);
      Dao.closeStatement(ps);
    }
  }

  @Override
  public List<Gclass> findAll() {
    PreparedStatement ps = null;
    ResultSet rs = null;

    try {
      ps = conn.prepareStatement("SELECT * FROM gclass");
      rs = ps.executeQuery();

      List<Gclass> gclasses = new ArrayList<>();

      while (rs.next()) {
        Gclass department = new Gclass();

        department.setId(rs.getInt("id"));
        department.setLabel(rs.getString("label"));
        department.setDescription(rs.getString("description"));

        gclasses.add(department);
      }

      return gclasses;
    } catch (SQLException e) {
      System.err.println("problème de requête pour sélectionner un département");;
      return null;
    } finally {
      Dao.closeResultSet(rs);
      Dao.closeStatement(ps);
    }
  }
}
