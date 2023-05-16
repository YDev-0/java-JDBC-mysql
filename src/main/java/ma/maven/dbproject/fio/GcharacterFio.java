package ma.maven.dbproject.fio;

import ma.maven.dbproject.entities.Gcharacter;

import java.util.List;

public interface GcharacterFio {

    void exportAsExcel(List<Gcharacter> gcharacters, String fileName);
    void importAsExcel(String path);
}
