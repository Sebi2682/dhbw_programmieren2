package Programmieren2.Bibliothek;

public enum Status {
  AVAILABLE("verfügbar"), LENT("verliehen");


  private final String description;
  Status(String description){
    this.description = description;
  }

  public String getDescription(){
    return description;
  }
}

