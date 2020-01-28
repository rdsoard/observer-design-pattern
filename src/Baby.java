import java.util.ArrayList;

enum Cry {
  Hungry, Angry, Wet
};


public class Baby implements Subject {
  private ArrayList<Observer> observers;
  private Cry cry;

  // constructor, creates the ArrayList and prints a message
  Baby() {
    observers = new ArrayList<Observer>();
    System.out.println("A baby is born.");
  }

  // adds an observer to the ArrayList
  public void registerObserver(Observer observer) {
    observers.add(observer);
  }

  // removes an observer from the ArrayList
  public void removeObserver(Observer observer) {
    observers.remove(observer);
  }

  // updates the observers on the current cry
  public void notifyObservers() {
    for (Observer observer : observers) {
      observer.update(this.cry);
    }
  }

  // prints a message and sets the current cry to Angry
  public void angryCry() {
    System.out.println("This baby is hungry");
    this.cry = Cry.Angry;
    notifyObservers();
  }

  // print a message and sets the current cry to Hungry
  public void hungryCry() {
    System.out.println("This baby is angry!");
    this.cry = Cry.Hungry;
    notifyObservers();
  }

  // prints a message and sets the current cry to Wet
  public void wetCry() {
    System.out.println("This baby is wet");
    this.cry = Cry.Wet;
    notifyObservers();
  }
}
