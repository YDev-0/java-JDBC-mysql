package ma.maven.readWrite;

import ma.maven.readWrite.entities.Character;
import ma.maven.readWrite.entities.imp.EntitiesImp;


public class Main {
  public static void main(String[] args) {
    EntitiesImp<Character> characterImp = new Character();

    characterImp.getAll().forEach(character -> {
      System.out.println(character);
    });

  }
}
