package Programmieren2;

import java.util.HashMap;
import java.util.Optional;

public class TelephoneBook {

  private HashMap<Person, TelephoneNumber> entries = new HashMap<>();

  public void addEntry(Person person, TelephoneNumber telephoneNumber) {
    entries.put(person, telephoneNumber);
  }

  public Optional<TelephoneNumber> getTelephoneNumberByName(String name) {
  /*  for (Entry<Person, TelephoneNumber> entry : entries.entrySet()) {
      if (entry.getKey().name().equals(name)) {
        return entry.getValue();
      }
    }
    return null;*/
    return Optional.of(entries.get(new Person(name)));
  }

  public record Person(String name) {

  }

  ;

  public record TelephoneNumber(String value) {

  }

  ;
}
