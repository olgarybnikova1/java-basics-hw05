import java.util.ArrayList;
import java.util.List;

import static org.testng.Assert.assertEquals;

public class Zoo {
  public static void feed(List list) {
    System.out.println("Feeding birds");
    List<Bird> birdList = (List<Bird>) list;
    for (Bird bird: birdList) {
      bird.eat();
    }
  }

  public static void acceptBird(List<? super FlyingBird> list, FlyingBird bird) {
    System.out.println("Accepting a bird to a section");
    bird.checkWings();
    list.add(bird);
  }

  public static void registerBird(List<Bird> list, Bird newBird) {
    System.out.println("Adding a bird to the birds list");
    list.add(newBird);
    for (Bird bird: list) {
      bird.toString();
    }
  }

  private static final String TO_STRING_INCORRECT = "toString() method is incorrect";

  public static void main(String[] args) {

    List<Bird> birds = new ArrayList<>();
    Zoo.registerBird(birds, new Eagle());
    Zoo.registerBird(birds, new Swallow());
    Zoo.registerBird(birds, new Penguin());
    Zoo.registerBird(birds, new Kiwi());

    assertEquals(birds.get(0).toString(), "Eagle", TO_STRING_INCORRECT);

    assertEquals(birds.get(1).toString(), "Swallow", TO_STRING_INCORRECT);

    assertEquals(birds.get(2).toString(), "Penguin", TO_STRING_INCORRECT);

    assertEquals(birds.get(3).toString(), "Kiwi", TO_STRING_INCORRECT);
  }
}