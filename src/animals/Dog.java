package animals;

import java.util.ArrayList;
import java.util.Arrays;

import behaviors.*;
import behaviors.Behavior;
import behaviors.ProbablisticMultipleBehavior;
import nameGenerator.nameGenerator;


//Dog and Wolf classes exhibit polymorphism as they are both subclasses of Canine
public class Dog extends Canine {

   public Dog() {
      super();
      //TODO: Implement name generation
      myName = "Name";

      /*When a Dog is given the exercise command by the Zookeeper,
       *there is a 25% chance the dog will dig instead of roaming.
       */
      /*
       * Strategy Pattern is used here.
       * It assigns the roam behavior to RandomRoam implementation.
       * It accepts an array of RoamBehaviors and their probabilities.
       * RandomRoam's roam function is called in the abstract Animal class.
       */
      ArrayList<Behavior> roamBehaviors = new ArrayList<Behavior>(Arrays.asList(new Roam(), new Dig()));
      double[] probabilities = new double[] {0.75, 0.25};
      roamBehavior = new ProbablisticMultipleBehavior(roamBehaviors, probabilities);
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
