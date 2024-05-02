import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class PersonCompare extends Person {

  public PersonCompare(String name, int age) {
    super(name, age);
  }

  public static final Comparator<PersonCompare> BY_AGE = new Comparator<PersonCompare>() {
    @Override
    public int compare(PersonCompare p1, PersonCompare p2) {
      return Integer.compare(p1.getAge(), p2.getAge());
    }
  };

  public static final Comparator<PersonCompare> BY_NAME = new Comparator<PersonCompare>() {
    @Override
    public int compare(PersonCompare p1, PersonCompare p2) {
      return p1.getName().compareToIgnoreCase(p2.getName());
    }
  };
}

public class AnonymousClassCmprImpl {
  public static void main(String[] args) {
    callingWithAnonymousClassInstance();
    System.out.println("------------------");
    callingWithComparatorFun();
  }

  private static void callingWithAnonymousClassInstance() {
    List<PersonCompare> personList = new java.util.ArrayList<>(List.of(
        new PersonCompare("Ali", 34),
        new PersonCompare("Rao", 22),
        new PersonCompare("Jane", 21)
    ));
    personList.sort(PersonCompare.BY_AGE);
    System.out.println(personList);

    personList.sort(PersonCompare.BY_NAME);
    System.out.println(personList);
  }

  private static void callingWithComparatorFun() {
    List<Person> personList = new ArrayList<>();
    personList.add(new Person("Alita", 35));
    personList.add(new Person("Mark", 19));
    personList.add(new Person("Steve", 43));

    personList.sort((Person p1, Person p2) -> {
      return Integer.compare(p1.getAge(), p2.getAge());
    });

    System.out.println(personList);
  }
}
