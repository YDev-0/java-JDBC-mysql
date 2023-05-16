package ma.maven.dbproject.service;

import ma.maven.dbproject.dao.GclassDao;
import ma.maven.dbproject.dao.imp.GclassDaoImp;
import ma.maven.dbproject.entities.Gcharacter;
import ma.maven.dbproject.entities.Gclass;
import ma.maven.dbproject.fio.GclassFio;
import ma.maven.dbproject.fio.imp.GclassFioImp;

import java.util.List;

public class ServiceGclass {
  private GclassDao gclassDao = new GclassDaoImp();
  private GclassFio gclassFio = new GclassFioImp();

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

  public Gclass findById(int id) {
    return gclassDao.findById(id);
  }

  public void exportAsExcel(List<Gclass> gclasses, String fileName) {
    gclassFio.exportAsExcel(gclasses, fileName);
  }
}
