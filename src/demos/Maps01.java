package demos;

import demos.TelephoneBook.Person;
import demos.TelephoneBook.TelephoneNumber;

public class Maps01 {

  public static void main(String[] args) {

    TelephoneBook telephoneBook = new TelephoneBook();
    telephoneBook.addEntry(new Person("hans"), new TelephoneNumber("33584395"));
    telephoneBook.addEntry(new Person("Peter"), new TelephoneNumber("33539295"));
    telephoneBook.addEntry(new Person("Anna"), new TelephoneNumber("29082985"));
    telephoneBook.addEntry(new Person("maira"), new TelephoneNumber("33459395"));

      System.out.println(telephoneBook.getTelephoneNumberByName("hans"));


  }

}
