public class Mom implements Observer {
  private Subject baby;

  // constructor, registers mom as an observer
  Mom(Subject baby) {
    this.baby = baby;
    baby.registerObserver(this);
  }

  // prints a message depending on the current cry
  public void update(Cry cry) {
    if (cry.equals(Cry.Angry)) {
      System.out.println("Angry Cry: Mom hugs and rocks baby, maybe spoiling");
    } else if (cry.equals(Cry.Hungry)) {
      System.out.println("Hungry Cry: Mom cuddles and feeds baby");
    } else if (cry.equals(Cry.Wet)) {
      System.out.println("Wet Cry: Mom changes baby");
    }
  }
}
