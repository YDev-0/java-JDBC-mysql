package ma.maven.dbproject.dao;

import ma.maven.dbproject.entities.Gcharacter;

import java.util.List;

public interface GcharacterDao {
  void insert(Gcharacter gcharacter);
  void update(Gcharacter gcharacter);
  void deleteById(int id);
  Gcharacter findById(int id);
  List<Gcharacter> findAll();
}
