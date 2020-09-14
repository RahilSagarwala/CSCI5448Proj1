package animals;

import nameGenerator.nameGenerator;

//Dog and Wolf classes exhibit polymorphism as they are both subclasses of Canine
public class Dog extends Canine {

   public Dog() {
      super();
      //TODO: Implement name generation
      myName = "Name";
   }

   public Dog(nameGenerator ng) {
      super();

      // Get unique name
      myName = ng.getUniqueName(myType);
   }

   @Override
   public void makeNoise() {
      String output = this.getName() + " the " + this.getType() + " woof.";
      System.out.println(output);
   }

   /*When a Dog is given the exercise command by the Zookeeper,
    *there is a 25% chance the dog will dig instead of roaming.
    */
   @Override
   public void roam() {
      int r = rand.getChance(4);

      if (r <= 0) {
         this.dig();
      } else {
         String output = this.getName() + " the " + this.getType() + " roams.";
         System.out.println(output);
      }
   }

   public void dig() {
      String output = this.getName() + " the " + this.getType() + " digs.";
      System.out.println(output);
   }

   @Override
   public String getName() {
      return myName;
   }

   @Override
   public String getType() {
      return myType;
   }

   // Member variables
   private String myName;
   private static String myType = "Dog";
}
