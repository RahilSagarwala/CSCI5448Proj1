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
      ArrayList<RoamBehavior> roamBehaviors = new ArrayList<RoamBehavior>();
      roamBehaviors.add(new Roam());
      roamBehaviors.add(new HeadButt());
      double[] probabilities = new double[] {0.5, 0.5};
      boolean success = roamBehavior.setRoamBehaviors(roamBehaviors, probabilities);
   }
}
