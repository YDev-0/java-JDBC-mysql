package ma.maven.dbproject.fio;

import ma.maven.dbproject.entities.Gcharacter;
import ma.maven.dbproject.entities.Gclass;
import org.apache.poi.xssf.usermodel.XSSFRow;

import java.util.List;

public interface GclassFio {
    void exportAsExcel(List<Gclass> gclasses, String fileName);
    void importAsExcel(String path);
}
