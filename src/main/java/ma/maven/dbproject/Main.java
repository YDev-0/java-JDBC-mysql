package ma.maven.dbproject;

import ma.maven.dbproject.dao.GcharacterDao;
import ma.maven.dbproject.dao.GclassDao;
import ma.maven.dbproject.dao.imp.GcharacterDaoImp;
import ma.maven.dbproject.dao.imp.GclassDaoImp;
import ma.maven.dbproject.entities.Gclass;
import ma.maven.dbproject.service.ServiceGcharacter;
import ma.maven.dbproject.service.ServiceGclass;

public class Main {

  public static void printAllClasses(ServiceGclass serviceGclass) {
    System.out.println("---------------------------------------------------------------");
    System.out.println("Liste des Classes : ");

    serviceGclass.findAll().forEach(gclass -> {
      System.out.println(gclass);
    });
  }
  public static void main(String[] args) {

    ServiceGcharacter serviceGcharacter = new ServiceGcharacter();

    ServiceGclass serviceGclass = new ServiceGclass();

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

//    serviceGclass.save(new Gclass(null, "test", "description test"));
//
//    printAllClasses(serviceGclass);

//    serviceGclass.update(new Gclass(17, "test updated", "description test also updated"));
//
//    printAllClasses(serviceGclass);

    serviceGcharacter.exportAsExcel(serviceGcharacter.findAll(), "testGcharactersFioImport");
    serviceGclass.exportAsExcel(serviceGclass.findAll(), "testGclassesFioImport");

  }
}
