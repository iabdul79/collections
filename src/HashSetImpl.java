import java.util.HashSet;
import java.util.Set;

public class HashSetImpl {
  public static void main(String[] args) {
    Person person1 = new Person("Adam", 29);
    Person person2 = new Person("Allan", 33);
    Person person3 = new Person("Rick", 23);
    Set<Person> personSet = new HashSet<>();
    personSet.add(person1);
    personSet.add(person2);
    personSet.add(person3);

    for (Person person:personSet) System.out.println(person.sayHello());
  }
}
