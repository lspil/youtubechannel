package example;

public class Dog {

  @ObjectAttribute(name = "name") // Hibernate @Table, @Column/ Jackson
  private String dogName;

  public String getDogName() {
    return dogName;
  }

  public void setDogName(String dogName) {
    this.dogName = dogName;
  }
}
