package animals;

import java.util.ArrayList;

import behaviors.Dig;
import behaviors.RandomRoam;
import behaviors.Roam;
import behaviors.RoamBehavior;
import nameGenerator.nameGenerator;


//Dog and Wolf classes exhibit polymorphism as they are both subclasses of Canine
public class Dog extends Canine {

   public Dog() {
      super();
      //TODO: Implement name generation
      myName = "Name";
      roamBehavior = new RandomRoam();

      ArrayList<RoamBehavior> roamBehaviors = new ArrayList<RoamBehavior>();
      roamBehaviors.add(new Dig());
      roamBehaviors.add(new Roam());
      double[] probabilities = new double[] {0.75, 0.25};
      boolean success = roamBehavior.setRoamBehaviors(roamBehaviors, probabilities);
   }

   public Dog(nameGenerator ng) {
      super();

      // Get unique name is an example of object identity.
      myName = ng.getUniqueName(myType);
   }

   // This overridden method is an example of polymorphism
   @Override
   public void makeNoise() {
      String output = this.getName() + " the " + this.getType() + " woof.";
      System.out.println(output);
   }

   /*When a Dog is given the exercise command by the Zookeeper,
    *there is a 25% chance the dog will dig instead of roaming.
    */
   // This overridden method is an example of polymorphism
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

   // Member variables are an example of encapsulation.
   private String myName;
   private static String myType = "Dog";
}
