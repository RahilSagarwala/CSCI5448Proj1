package animals;

//OO term abstract class
//override Animal's methods and encapsulate based off of species

import behaviors.Roam;
import behaviors.HeadButt;
import behaviors.ProbablisticMultipleBehavior;
import behaviors.Behavior;

import java.util.ArrayList;
import java.util.Arrays;

public abstract class Bovinae extends Animal {

   public Bovinae() {
      super();

      /*When a Bovinae is given the exercise command by the Zookeeper,
       *there is a 50% chance the bovinae will headButt instead of roaming.
       */
      /*
       * Strategy Pattern is used here.
       * It assigns the roam behavior to RandomRoam implementation.
       * It accepts an array of RoamBehaviors and their probabilities.
       * RandomRoam's roam function is called in the abstract Animal class.
       */
      ArrayList<Behavior> roamBehaviors = new ArrayList<Behavior>(Arrays.asList(new Roam(), new HeadButt()));
      double[] probabilities = new double[] {0.5, 0.5};
      roamBehavior = new ProbablisticMultipleBehavior(roamBehaviors, probabilities);
   }
}
