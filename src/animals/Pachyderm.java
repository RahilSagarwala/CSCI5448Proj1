package animals;

//OO term abstract class
//override Animal's methods which is an example of polymorphism

import behaviors.*;
import behaviors.Behavior;
import behaviors.ProbablisticMultipleBehavior;

import java.util.ArrayList;
import java.util.Arrays;

/*When a Pachyderm is given an exercise command,
 *there is a 25% chance it will charge instead of roam.
 */
public abstract class Pachyderm extends Animal {

   public Pachyderm() {
      super();

      /*When a Pachyderm is given the exercise command by the Zookeeper,
       *there is a 25% chance the Pachyderm will charge instead of roaming.
       */
      /*
       * Strategy Pattern is used here.
       * It assigns the roam behavior to RandomRoam implementation.
       * It accepts an array of RoamBehaviors and their probabilities.
       * RandomRoam's roam function is called in the abstract Animal class.
       */
      ArrayList<Behavior> roamBehaviors = new ArrayList<Behavior>(Arrays.asList(new Roam(), new Charge()));
      double[] probabilities = new double[] {0.75, 0.25};
      roamBehavior = new ProbablisticMultipleBehavior(roamBehaviors, probabilities);
   }
}
