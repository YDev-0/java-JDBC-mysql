package ma.maven.readWrite.dao;

import ma.maven.readWrite.entities.Gcharacter;
import ma.maven.readWrite.entities.Gclass;

import java.util.List;

public interface GcharacterDao {
  void insert(Gcharacter gcharacter);
  void update(Gcharacter gcharacter);
  void deleteById(int id);
  Gcharacter findById(int id);
  List<Gcharacter> findAll();
}
