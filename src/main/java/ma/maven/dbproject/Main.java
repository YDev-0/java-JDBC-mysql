package ma.maven.dbproject;

import ma.maven.dbproject.dao.GcharacterDao;
import ma.maven.dbproject.dao.GclassDao;
import ma.maven.dbproject.dao.imp.GcharacterDaoImp;
import ma.maven.dbproject.dao.imp.GclassDaoImp;
import ma.maven.dbproject.entities.Gclass;

public class Main {

  public static void printAllClasses(GclassDao gclassDao) {
    System.out.println("---------------------------------------------------------------");
    System.out.println("Liste des Classes : ");

    gclassDao.findAll().forEach(gclass -> {
      System.out.println(gclass);
    });
  }
  public static void main(String[] args) {

    GcharacterDao gcharacterDao = new GcharacterDaoImp();

    GclassDao gclassDao = new GclassDaoImp();

//    System.out.println("---------------------------------------------------------------");
//    System.out.println("Liste des Personnage : ");
//
//    gcharacterDao.findAll().forEach(gclass -> {
//      System.out.println(gclass);
//    });

//    System.out.println("---------------------------------------------------------------");
//    int id = 11;
//    System.out.println("Personnage avec id : " + id);
//    System.out.println(gcharacterDao.findById(id));

//    gclassDao.insert(new Gclass(null, "test", "description test"));

//    printAllClasses(gclassDao);

//    gclassDao.update(new Gclass(16, "test update", "description test also updated"));
//
//    printAllClasses(gclassDao);

//    gclassDao.deleteById(16);
//
//    printAllClasses(gclassDao);

  }
}
