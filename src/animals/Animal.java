package animals;

import randomChance.randomChance;

//OO term abstract class
public abstract class Animal {

   // Default constructor
   public Animal(){
      super();

      rand = new randomChance();
   }

   public void sleep(){
      String output = this.getName() + " the " + this.getType() + " sleeps.";
      System.out.println(output);
   }

   public void wake(){
      String output = this.getName() + " the " + this.getType() + " wakes up.";
      System.out.println(output);
   }

   public abstract void makeNoise();

   public void eat(){
      String output = this.getName() + " the " + this.getType() + " eats.";
      System.out.println(output);
   }

   public void roam(){
      String output = this.getName() + " the " + this.getType() + " roams.";
      System.out.println(output);
   }

   public abstract String getName();

   public abstract String getType();
   
   
   //encapsulated variable and methods can only be accessed by subclasses of Animal
   protected randomChance rand;

   protected void setRandomChance(randomChance r){
      rand = r;
   }
}
