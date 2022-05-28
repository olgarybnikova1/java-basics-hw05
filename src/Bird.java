public abstract class Bird {

  public void eat() {
    System.out.println("the bird is eating");
  }

  @Override
  public String toString() {
    return this.getClass().getName();
  }
}
