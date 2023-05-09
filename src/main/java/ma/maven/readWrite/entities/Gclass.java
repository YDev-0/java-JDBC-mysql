package ma.maven.readWrite.entities;

public class Gclass {
  private int id;
  private String label;
  private String description;

  public Gclass() {

  }

  public Gclass(int id, String label, String description) {
    this.id = id;
    this.label = label;
    this.description = description;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getLabel() {
    return label;
  }

  public void setLabel(String label) {
    this.label = label;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  @Override
  public String toString() {
    return "Class{" +
        "id = " + id +
        ", label = '" + label + '\'' +
        ", description = '" + description + '\'' +
        '}';
  }
}