import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ArrayListImpl {
  public static void main(String[] args) {
    List<String> coffeeList = new ArrayList<>();
    coffeeList.add("espresso");
    coffeeList.add("americano");
    coffeeList.add("filter");
    coffeeList.add("bru");

    Iterator<String> itr = coffeeList.iterator();

    // Iterating way - 1
    System.out.println("Using Iterator");
    while (itr.hasNext()) {
      System.out.println(itr.next());
    }

    // Iterating way - 2
    System.out.println("Using enhanced for loop");
    for (String coffee: coffeeList) {
      System.out.println(coffee);
    }

    // Iterating way - 3
    System.out.println("Using for loop");
    for (int i = 0; i < coffeeList.size(); i++) {
      System.out.println(coffeeList.get(i));
    }
  }
}
