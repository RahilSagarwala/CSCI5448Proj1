package animals;

//OO term abstract class
//override Animal's methods which is an example of polymorphism

import behaviors.Roam;
import behaviors.Charge;
import behaviors.RandomRoam;
import behaviors.RoamBehavior;

import java.util.ArrayList;

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
      roamBehavior = new RandomRoam();
      ArrayList<RoamBehavior> roamBehaviors = new ArrayList<RoamBehavior>();
      roamBehaviors.add(new Roam());
      roamBehaviors.add(new Charge());
      double[] probabilities = new double[] {0.75, 0.25};
      boolean success = roamBehavior.setRoamBehaviors(roamBehaviors, probabilities);
   }
}
