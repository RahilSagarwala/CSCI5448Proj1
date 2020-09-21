package behaviors;

import java.util.ArrayList;

public class RoamAndDig implements RoamBehavior {

   public String roam(String name, String type){
      randomRoam.roam(name, type);
   }

   private final RandomRoam randomRoam = new RandomRoam();
   // I'm struggling to add roamBehaviors and their probabilities.
   randomRoam.setRandomBehaviors(randomBehaviors, probabilities);
   randomRoam.roamBehaviors.add((roamBehavior) new Roam());
   randomRoam.roamBehaviors.add((roamBehavior) new Dig());
   probabilities = new double[] {0.75, 0.25};
}
