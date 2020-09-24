package animals;

import behaviors.RoamBehavior;
import behaviors.Roam;
import randomChance.randomChance;

//OO term abstract class since not all of the public methods have a concrete implementation.
public abstract class Animal {

   // Default constructor
   public Animal() {
      super();
      rand = new randomChance();
      roamBehavior = new Roam();
   }

   public void sleep() {
      String output = this.getName() + " the " + this.getType() + " sleeps.";
      System.out.println(output);
   }

   public void wake() {
      String output = this.getName() + " the " + this.getType() + " wakes up.";
      System.out.println(output);
   }

   public abstract void makeNoise();

   public void eat() {
      String output = this.getName() + " the " + this.getType() + " eats.";
      System.out.println(output);
   }

   public void roam() {
      String output = roamBehavior.roam(this);
      System.out.println(output);
   }

   public abstract String getName();

   public abstract String getType();


   //encapsulated variable and methods can only be accessed by subclasses of Animal
   protected randomChance rand;
   protected void setRandomChance(randomChance r) { rand = r; }

   /* Strategy Pattern is used here
    * Animal throws all the implementation to RoamBehavior interface.
    * All animals roam as default.
    */
   protected RoamBehavior roamBehavior;
   protected void setRoamBehavior(RoamBehavior roamBehavior) { this.roamBehavior = roamBehavior; }
}
