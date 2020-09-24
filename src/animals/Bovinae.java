package animals;

//OO term abstract class
//override Animal's methods and encapsulate based off of species

import behaviors.Roam;
import behaviors.HeadButt;
import behaviors.RandomRoam;
import behaviors.RoamBehavior;
import randomChance.randomChance;

import java.util.ArrayList;

public abstract class Bovinae extends Animal {

   public Bovinae() {
      super();
      roamBehavior = new RandomRoam();

      /*When a Bovinae is given the exercise command by the Zookeeper,
       *there is a 50% chance the bovinae will headButt instead of roaming.
       */
      /*
       * Strategy Pattern is used here.
       * It assigns the roam behavior to RandomRoam implementation.
       * It accepts an array of RoamBehaviors and their probabilities.
       * RandomRoam's roam function is called in the abstract Animal class.
       */
      ArrayList<RoamBehavior> roamBehaviors = new ArrayList<RoamBehavior>();
      roamBehaviors.add(new Roam());
      roamBehaviors.add(new HeadButt());
      double[] probabilities = new double[] {0.5, 0.5};
      boolean success = roamBehavior.setRoamBehaviors(roamBehaviors, probabilities);
   }
}
