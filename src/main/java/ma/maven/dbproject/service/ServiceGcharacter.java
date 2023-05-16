package ma.maven.dbproject.service;

import ma.maven.dbproject.dao.GcharacterDao;
import ma.maven.dbproject.dao.imp.GcharacterDaoImp;
import ma.maven.dbproject.entities.Gcharacter;
import ma.maven.dbproject.fio.GcharacterFio;
import ma.maven.dbproject.fio.imp.GcharacterFioImp;

import java.util.List;

public class ServiceGcharacter {
  private GcharacterDao gcharacterDao = new GcharacterDaoImp();
  private GcharacterFio gcharacterFio = new GcharacterFioImp();

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

  public void exportAsExcel(List<Gcharacter> gcharacters, String fileName) {
    gcharacterFio.exportAsExcel(gcharacters, fileName);
  }
}
