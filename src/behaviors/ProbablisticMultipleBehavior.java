package behaviors;
import animals.Animal;
import randomChance.randomProbability;
import java.util.ArrayList;

public class ProbablisticMultipleBehavior extends MultipleBehavior {

   public ProbablisticMultipleBehavior() {
      super();
      rand = new randomProbability();
      behaviors = null;
      probabilities = null;
   }

   // Default constructor
   public ProbablisticMultipleBehavior(ArrayList<Behavior> behaviors, double[] probabilities) {
      super();
      rand = new randomProbability();
      boolean success = this.setBehaviors(behaviors, probabilities);
   }

   public String takeAction(Animal animal) {
      if (probabilities == null) { return ""; }

      // First need to check
      double min = 0.0;
      double max = 0.0;
      double randomNumber = rand.getProbability();

      String output = "";
      for (int i=0; i<probabilities.length; i++){
         max = min + probabilities[i];
         if ((min < randomNumber) && (randomNumber < max)) {
            output = behaviors.get(i).takeAction(animal);
         }

         min = max;
      }

      return output;
   }

   public boolean setBehaviors(ArrayList<Behavior> behaviors, double[] probabilities) {
      if (behaviors.size() != probabilities.length) {
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
      this.behaviors = behaviors;
      this.probabilities = probabilities;

      return true;
   };

   protected randomProbability rand;
   public void setRandomProbability(randomProbability r) { rand = r; }
   private double[] probabilities;
}
