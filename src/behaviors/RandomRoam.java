package behaviors;
import animals.Animal;
import randomChance.randomProbability;
import java.util.ArrayList;

public class RandomRoam implements RoamBehavior {

   public String roam(Animal animal) {
      if (probabilities == null) { return ""; }

      // First need to check
      double min = 0.0;
      double max = 0.0;
      double randomNumber = rand.getProbability();

      String output = "";
      for (int i=0; i<probabilities.length; i++){
         max = min + probabilities[i];
         if ((min < randomNumber) && (randomNumber < max)) {
            output = roamBehaviors.get(i).roam(animal);
         }

         min = max;
      }

      return output;
   }

   public boolean setRoamBehaviors(ArrayList<RoamBehavior> roamBehaviors, double[] probabilities) {
      if (roamBehaviors.size() != probabilities.length) {
         return false;
      }

      // Checks if the sum of the probabilities are equal to 1
      double sum = 0.0;
      for (double probability : probabilities) {
         sum += probability;
      }

      if (sum != 1.0) {
         return false;
      }
      this.roamBehaviors = roamBehaviors;
      this.probabilities = probabilities;

      return true;
   };

   protected randomProbability rand = new randomProbability();
   protected void setRandomProbability(randomProbability r) { rand = r; }

   protected ArrayList<RoamBehavior> roamBehaviors;
   private double[] probabilities;
}
