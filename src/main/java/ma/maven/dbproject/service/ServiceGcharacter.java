package ma.maven.dbproject.service;

import ma.maven.dbproject.dao.GcharacterDao;
import ma.maven.dbproject.dao.imp.GcharacterDaoImp;
import ma.maven.dbproject.entities.Gcharacter;

import java.util.List;

public class ServiceGcharacter {
  private GcharacterDao gcharacterDao = new GcharacterDaoImp();

  public List<Gcharacter> findAll() {
    return gcharacterDao.findAll();
  }

  public void save(Gcharacter gcharacter) {
    gcharacterDao.insert(gcharacter);
  }
  public void update(Gcharacter gcharacter) {
    gcharacterDao.update(gcharacter);
  }
  public void remove(Gcharacter gcharacter) {
    gcharacterDao.deleteById(gcharacter.getId());
  }
}
