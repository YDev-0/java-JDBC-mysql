package ma.maven.dbproject.service;

import ma.maven.dbproject.dao.GclassDao;
import ma.maven.dbproject.dao.imp.GclassDaoImp;
import ma.maven.dbproject.entities.Gclass;

import java.util.List;

public class ServiceGclass {
  private GclassDao gclassDao = new GclassDaoImp();

  public List<Gclass> findAll() {
    return gclassDao.findAll();
  }

  public void save(Gclass gclass) {
    gclassDao.insert(gclass);
  }
  public void update(Gclass gclass) {
    gclassDao.update(gclass);
  }
  public void remove(Gclass gclass) {
    gclassDao.deleteById(gclass.getId());
  }
}
