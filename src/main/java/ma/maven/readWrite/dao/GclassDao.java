package ma.maven.readWrite.dao;

import ma.maven.readWrite.entities.Gclass;

import java.util.List;

public interface GclassDao {
  void insert(Gclass gclass);
  void update(Gclass gclass);
  void deleteById(int id);
  Gclass findById(int id);
  List<Gclass> findAll();
}
