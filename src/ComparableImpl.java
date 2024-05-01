import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class ComparablePerson extends Person implements Comparable<Person> {
  public ComparablePerson(String name, int age) {
    super(name, age);
  }

  @Override
  public int compareTo(Person p) {
    return this.getName().compareToIgnoreCase(p.getName());
  }
}

public class ComparableImpl {
  public static void main(String[] args) {
    List<ComparablePerson> cPersonList = new ArrayList<>();
    cPersonList.add(new ComparablePerson("Almo", 28));
    cPersonList.add(new ComparablePerson("Neha", 22));
    cPersonList.add(new ComparablePerson("John", 19));

    Collections.sort(cPersonList);
    System.out.println(cPersonList);
  }
}
