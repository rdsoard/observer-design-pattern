public class Dad implements Observer {
  private Subject baby;

  // constructor, registers dad as an observer
  Dad(Subject baby) {
    this.baby = baby;
    baby.registerObserver(this);
  }

  // prints a message depending on the current cry
  public void update(Cry cry) {
    if (cry.equals(Cry.Angry)) {
      System.out.println("Angry Cry: Dad puts in earplugs");
    } else if (cry.equals(Cry.Hungry)) {
      System.out.println("Hungry Cry: Dad feeds baby");
    } else if (cry.equals(Cry.Wet)) {
      System.out.println("Wet Cry: Dad calls mom");
    }
  }
}
