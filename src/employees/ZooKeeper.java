package employees;

import animals.*;
import clock.Clock;
import observer.*;
import nameGenerator.nameGenerator;

import java.util.List;

public class ZooKeeper extends ZooEmployee implements iObserver {

   public ZooKeeper() {
      super();
      myName = "Name";
   }

   public ZooKeeper(nameGenerator ng, List<Animal> a, Clock c){
      // Get unique name
      myName = ng.getUniqueName(this.getType());
      // Zoo keeper has a collection of animals they are responsible for
      // caring for.
      responsibleAnimals = a;

      // Store the clock subject to register with
      clockSubject = c.getSubject();
      clockSubject.addObserver(this);

      // Store the clock object
      clock = c;
   }

   // Implement the update method of the observer interface allowing
   // the ZooKeeper to be an instance of iObserver interface.
   @Override
   public void update(iSubject s) {
      if (s instanceof ClockSubject){
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

   // This overridden method is an example of polymorphism
   @Override
   public void clean() {
      String output = this.getName() + " cleans the animal pens.";
      System.out.println(output);
   }

   // This overridden method is an example of polymorphism
   @Override
   public void takeBreak() {
      String output = this.getName() + " takes break.";
      System.out.println(output);
   }

   public void playWithAnimals(){
      String output = this.getName() + " the " + this.getType() + " roll calls the animals they are responsible for.";
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
      System.out.println(output);
      // This is an example of abstraction since the zoo keeper doesn't know how the animal method is implemented
      // or what it will do - it only knows it follows the implicit contract that it is a void
      // method that takes no arguments.
      // This is also an example of polymorphism in use. The method on the abstract Animal class is being called,
      // but a different concrete implementation may actually be executed.
      a.sleep();
   }

   // Protected method to handle performing zoo keeper tasks based on the time of day
   protected void performTasks() {
      int currTime = clock.getCurrentTime();
      int currDay = clock.getCurrentDay();
      if (currTime == 7) {
         arrivesAtZoo(currDay);
      }
      else if (currTime == 8) {
         wakeUpAnimals();
      }
      else if (currTime == 9) {
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

   // Protected method to set the clock object for testing
   protected void setClock(Clock c){
      clock = c;
   }

   // Private member variables
   // Private member variables are an example of encapsulation that hide implementation
   // details from the end user.
   private String myName;
   private static String myType = "Zoo Keeper";
   private List<Animal> responsibleAnimals;
   private iSubject clockSubject;
   private Clock clock;
}
