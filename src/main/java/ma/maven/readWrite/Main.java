package ma.maven.readWrite;

import ma.maven.readWrite.dao.imp.GclassDaoImp;

public class Main {
  public static void main(String[] args) {

    System.out.println("---------------------------------------------------------------");
    System.out.println("Liste des Classes : ");

    GclassDaoImp gclassDaoImp = new GclassDaoImp();

    gclassDaoImp.findAll().forEach(gclass -> {
      System.out.println(gclass);
    });


  }
}
