package ma.maven.readWrite.entities;

import ma.maven.readWrite.dao.Dao;
import ma.maven.readWrite.dao.DaoImp;
import ma.maven.readWrite.entities.imp.EntitiesImp;

import javax.xml.transform.Result;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Character implements EntitiesImp<Character> {
  private int id;
  private String name;
  private int health;
  private float damage;
  private Gclass gClass;

  public Character() {

  }

  public Character(int id, String name, int health, float damage, Gclass gClass) {
    this.id = id;
    this.name = name;
    this.health = health;
    this.damage = damage;
    this.gClass = gClass;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getHealth() {
    return health;
  }

  public void setHealth(int health) {
    this.health = health;
  }

  public float getDamage() {
    return damage;
  }

  public void setDamage(float damage) {
    this.damage = damage;
  }

  public Gclass getgClass() {
    return gClass;
  }

  public void setgClass(Gclass gClass) {
    this.gClass = gClass;
  }

  @Override
  public String toString() {
    return "Character{" +
        "id = " + id +
        ", name = '" + name + '\'' +
        ", health = " + health +
        ", damage = " + damage +
        ", Class = " + gClass.getLabel() +
        '}';
  }

  @Override
  public List<Character> getAll() {
    DaoImp daoImp = new Dao();
    Connection con = daoImp.getMysqlConnection("localhost:3306", "gamedata", "root", "");
    List<Character> characters = new ArrayList<>();
    try {
      Statement statement = con.createStatement();

      ResultSet charactersResultSet = statement.executeQuery("select * from gcharacter");

      while(charactersResultSet.next()) {
        PreparedStatement preparedStatement = con.prepareStatement("select * from gclass where id = ?");
        preparedStatement.setInt(1, charactersResultSet.getInt(5));
        ResultSet gclassResult = preparedStatement.executeQuery();
        gclassResult.next();
        Gclass gclass = new Gclass(gclassResult.getInt(1), gclassResult.getString(2), gclassResult.getString(3));

        characters.add(new Character(charactersResultSet.getInt(1), charactersResultSet.getString(2), charactersResultSet.getInt(3), charactersResultSet.getFloat(4), gclass));
      }
      con.close();
    } catch (SQLException e) {
      System.err.println(e.getMessage());
    }
    return characters;
  }
}
