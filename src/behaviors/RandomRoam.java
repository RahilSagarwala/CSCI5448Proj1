package behaviors;

import java.util.ArrayList;
import java.util.Random;

public class RandomRoam implements RoamBehavior {

   public String roam(String name, String type) {
      double min = 0.0;
      double max = 0.0;
      double randomNumber = rand.nextDouble();

      String output = "";
      for (int i=0; i<probabilities.length; i++){
         max = min + probabilities[i];
         if ((min < randomNumber) && (randomNumber < max)) {
            output = roamBehaviors.get(i).roam(name, type);
         }

         min = max;
      }

      return output;
   }

   public boolean setRoamBehaviors(ArrayList<RoamBehavior> _roamBehaviors, double[] _probabilities) {
      // Checks if the sum of the probabilities are equal to 1
      double sum = 0.0;
      for (double probability : _probabilities) {
         sum += probability;
      }

      if (sum != 1.0) {
         return false;
      }
      roamBehaviors = _roamBehaviors;
      probabilities = _probabilities;

      return true;
   };

   protected ArrayList<RoamBehavior> roamBehaviors;
   private double[] probabilities;
   private final Random rand = new Random();
}
