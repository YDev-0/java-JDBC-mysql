package ma.maven.readWrite;

import ma.maven.readWrite.service.ServiceGcharacter;
import ma.maven.readWrite.service.ServiceGclass;


public class Main {
  public static void main(String[] args) {

    ServiceGcharacter.getAll().forEach(gcharacter -> {
      System.out.println(gcharacter);
    });

    System.out.println("---------------------------------------------------------------");
    System.out.println("Liste des Classes : ");

    ServiceGclass.getAll().forEach(gclass -> {
      System.out.println(gclass);
    });


  }
}
