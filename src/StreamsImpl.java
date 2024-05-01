import java.util.List;
import java.util.function.Predicate;

public class StreamsImpl {
  public static void main(String[] args) {
    List<Person> personList = List.of(
        new Person("Adam", 18),
        new Person("Rick", 23),
        new Person("Danny", 30)
    );

    Predicate<Person> isAdult = p -> p.getAge() >= 21;

    personList
      .stream()
      .filter(isAdult)
      .forEach(person -> System.out.println(person.sayHello()));
  }
}
