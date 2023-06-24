package Programmieren2;

import java.util.HashMap;
import java.util.Optional;

public class TelephoneBook {

  private HashMap<Person, TelephoneNumber> entries = new HashMap<>();

  public void addEntry(Person person, TelephoneNumber telephoneNumber) {
    entries.put(person, telephoneNumber);
  }

  public Optional<TelephoneNumber> getTelephoneNumberByName(String name) {
    if (entries.containsKey(new Person(name))) {
      return Optional.of(entries.get(new Person(name)));
    }
    return Optional.empty();

  /*  for (Entry<Person, TelephoneNumber> entry : entries.entrySet()) {
      if (entry.getKey().name().equals(name)) {
        return Optional.of(entry.getValue());
      }
    }
    return Optional.empty();*/
  }

  public record Person(String name) {

  }

  ;

  public record TelephoneNumber(String value) {

  }

  ;
}
