package employees;

import animals.*;
import nameGenerator.nameGenerator;

import java.util.List;

public class ZooKeeper extends ZooEmployee {

   public ZooKeeper() {
      super();
      myName = "Name";
   }

   public ZooKeeper(nameGenerator ng, List<Animal> a){
      // Get unique name
      myName = ng.getUniqueName(this.getType());
      // Zoo keeper has a collection of animals they are responsible for
      // caring for.
      responsibleAnimals = a;
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

   // Private member variables
   // Private member variables are an example of encapsulation that hide implementation
   // details from the end user.
   private String myName;
   private static String myType = "Zoo Keeper";
   private List<Animal> responsibleAnimals;
}