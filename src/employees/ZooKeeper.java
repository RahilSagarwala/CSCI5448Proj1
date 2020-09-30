package employees;

import animals.*;
import clock.Clock;
import clock.ZooClock;
import observer.*;
import nameGenerator.nameGenerator;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.ArrayList;
import java.util.List;
import java.beans.PropertyChangeSupport;

public class ZooKeeper extends ZooEmployee implements PropertyChangeListener, iSubject {

   public ZooKeeper() {
      super();
      myName = "Name";

      support = new PropertyChangeSupport(this);
      responsibleAnimals = new ArrayList<Animal>();
      clock = new ZooClock();
   }

   public ZooKeeper(nameGenerator ng, List<Animal> a, Clock c){
      // Get unique name
      myName = ng.getUniqueName(this.getType());
      // Zoo keeper has a collection of animals they are responsible for
      // caring for.
      responsibleAnimals = a;
     
      support = new PropertyChangeSupport(this);

      // Store the clock to observe
      clock = c;
      clock.addObserver(this);
   }

   // Implement the update method of the observer interface allowing
   // the ZooKeeper to be an instance of iObserver interface.
   @Override
   public void propertyChange(PropertyChangeEvent e) {
      if (e.getPropertyName().equals("clock")) {
         performTasks();
      }
   }

   // This overridden method is an example of polymorphism
   @Override
   public String getName() {
      return myName;
   }

   // This overridden method is an example of polymorphism
   @Override
   public String getType() {
      return myType;
   }

   public void clean() {
      String output = this.getName() + " cleans the animal pens.";
      this.publishChanges("clean the animal pens.");
      System.out.println(output);
   }

   // This overridden method is an example of polymorphism
   @Override
   public void takeBreak() {
      String output = this.getName() + " takes break.";
      this.publishChanges("take break.");
      System.out.println(output);
   }

   public void playWithAnimals(){
      String output = this.getName() + " the " + this.getType() + " roll calls the animals they are responsible for.";
      this.publishChanges("roll calls the animals they are responsible for.");
      System.out.println(output);

      for (Animal a:responsibleAnimals) {
         this.playWithAnimal(a);
      }
   }

   public void playWithAnimal(Animal a) {
      // This is an example of how abstract classes are used. A concrete implementation of the Animal
      // abstract class is passed into the method, and the public methods of that concrete
      // implementation get accessed through the Animal abstract class.
      String output = this.getName() + " the " + this.getType() + " roll calls " + a.getName() + " the " + a.getType() + ".";
      this.publishChanges("roll call " + a.getName() + " the " + a.getType() + ".");
      System.out.println(output);
      // This is an example of abstraction since the zoo keeper doesn't know how the animal method is implemented
      // or what it will do - it only knows it follows the implicit contract that it is a void
      // method that takes no arguments.
      // This is also an example of polymorphism in use. The method on the abstract Animal class is being called,
      // but a different concrete implementation may actually be executed.
      a.makeNoise();
   }

   public void chaseAnimals(){
      String output = this.getName() + " the " + this.getType() + " exercises the animals they are responsible for.";
      this.publishChanges("exercise the animals they are responsible for.");
      System.out.println(output);
      for (Animal a:responsibleAnimals) {
         this.chaseAnimal(a);
      }
   }

   public void chaseAnimal(Animal a) {
      // This is an example of how abstract classes are used. A concrete implementation of the Animal
      // abstract class is passed into the method, and the public methods of that concrete
      // implementation get accessed through the Animal abstract class.
      String output = this.getName() + " the " + this.getType() + " exercises " + a.getName() + " the " + a.getType() + ".";
      this.publishChanges("exercise " + a.getName() + " the " + a.getType() + ".");
      System.out.println(output);
      // This is an example of abstraction since the zoo keeper doesn't know how the animal method is implemented
      // or what it will do - it only knows it follows the implicit contract that it is a void
      // method that takes no arguments.
      // This is also an example of polymorphism in use. The method on the abstract Animal class is being called,
      // but a different concrete implementation may actually be executed.
      a.roam();
   }

   public void feedAnimals(){
      String output = this.getName() + " the " + this.getType() + " feeds the animals they are responsible for.";
      this.publishChanges("feed the animals they are responsible for.");
      System.out.println(output);
      for (Animal a:responsibleAnimals) {
         this.feedAnimal(a);
      }
   }

   public void feedAnimal(Animal a) {
      // This is an example of how abstract classes are used. A concrete implementation of the Animal
      // abstract class is passed into the method, and the public methods of that concrete
      // implementation get accessed through the Animal abstract class.
      String output = this.getName() + " the " + this.getType() + " feeds " + a.getName() + " the " + a.getType() + ".";
      this.publishChanges("feed " + a.getName() + " the " + a.getType() + ".");
      System.out.println(output);
      // This is an example of abstraction since the zoo keeper doesn't know how the animal method is implemented
      // or what it will do - it only knows it follows the implicit contract that it is a void
      // method that takes no arguments.
      // This is also an example of polymorphism in use. The method on the abstract Animal class is being called,
      // but a different concrete implementation may actually be executed.
      a.eat();
   }

   public void wakeUpAnimals(){
      String output = this.getName() + " the " + this.getType() + " wakes up the animals they are responsible for.";
      this.publishChanges("wake up the animals they are responsible for.");
      System.out.println(output);
      for (Animal a:responsibleAnimals) {
         this.wakeUpAnimal(a);
      }
   }

   public void wakeUpAnimal(Animal a ) {
      // This is an example of how abstract classes are used. A concrete implementation of the Animal
      // abstract class is passed into the method, and the public methods of that concrete
      // implementation get accessed through the Animal abstract class.
      String output = this.getName() + " the " + this.getType() + " wakes up " + a.getName() + " the " + a.getType() + ".";
      this.publishChanges("wake up " + a.getName() + " the " + a.getType() + ".");
      System.out.println(output);
      // This is an example of abstraction since the zoo keeper doesn't know how the animal method is implemented
      // or what it will do - it only knows it follows the implicit contract that it is a void
      // method that takes no arguments.
      // This is also an example of polymorphism in use. The method on the abstract Animal class is being called,
      // but a different concrete implementation may actually be executed.
      a.wake();
   }

   public void putAnimalsToSleep(){
      String output = this.getName() + " the " + this.getType() + " puts the animals they are responsible for to sleep.";
      this.publishChanges("put the animals they are responsible for to sleep.");
      System.out.println(output);
      for (Animal a:responsibleAnimals) {
         this.putAnimalToSleep(a);
      }
   }

   public void putAnimalToSleep(Animal a) {
      // This is an example of how abstract classes are used. A concrete implementation of the Animal
      // abstract class is passed into the method, and the public methods of that concrete
      // implementation get accessed through the Animal abstract class.
      String output = this.getName() + " the " + this.getType() + " puts " + a.getName() + " the " + a.getType() + " to sleep.";
      this.publishChanges("put " + a.getName() + " the " + a.getType() + " to sleep.");
      System.out.println(output);
      // This is an example of abstraction since the zoo keeper doesn't know how the animal method is implemented
      // or what it will do - it only knows it follows the implicit contract that it is a void
      // method that takes no arguments.
      // This is also an example of polymorphism in use. The method on the abstract Animal class is being called,
      // but a different concrete implementation may actually be executed.
      a.sleep();
   }

   /*
    * Observer Pattern.
    * This function publishes changes (messages) to the registered listeners.
    * It is called when ZooKeeper take an action.
    */
   private void publishChanges(String action) {
      ZooEmployeeActivity activity = new ZooEmployeeActivity(myName, myType, action);
      notifyObservers(currentProperty, activity);
      currentProperty = activity;
   }

   @Override
   public void notifyObservers(Object oldObj, Object newObj) {
      support.firePropertyChange("zookeeper", oldObj, newObj);
   }

   // Register a listener
   public void addObserver(PropertyChangeListener listener) {
      support.addPropertyChangeListener(listener);
   }

   // Remove a listener
   public void removeObserver(PropertyChangeListener listener) {
      support.removePropertyChangeListener(listener);
   }

   // public method to set the clock object
   public void setClock(Clock c){
      clock = c;
   }

   // public method to set the animals the zookeeper is responsible for
   public void setResponsibleAnimals(List<Animal> a){
      responsibleAnimals = a;
   }

   // Protected method to handle performing zoo keeper tasks based on the time of day
   // This is an example of the Pull implementation of Observer. When the zookeeper
   // gets notified that the clock has been updated, it reaches out to the clock object
   // to get the updated attributes it cares about.
   protected void performTasks() {
      int currTime = clock.getCurrentTime();
      int currDay = clock.getCurrentDay();
      if (currTime == 7) {
         arrivesAtZoo(currDay);
      }
      else if (currTime == 9) {
         wakeUpAnimals();
      }
      else if (currTime == 10) {
         playWithAnimals();
      }
      else if (currTime == 11) {
         feedAnimals();
      }
      else if (currTime == 15) {
         chaseAnimals();
      }
      else if (currTime == 19) {
         putAnimalsToSleep();
      }
      else if (currTime == 21) {
         leaveZoo(currDay);
      }
   }

   // Private member variables
   // Private member variables are an example of encapsulation that hide implementation
   // details from the end user.
   private String myName;
   private static String myType = "Zoo Keeper";
   private List<Animal> responsibleAnimals;
   private PropertyChangeSupport support;
   private ZooEmployeeActivity currentProperty;
   private Clock clock;

}
