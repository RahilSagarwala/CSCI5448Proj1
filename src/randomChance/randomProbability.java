package randomChance;

import java.util.Random;

public class randomProbability {
   public double getProbability() {
      Random rand = new Random();
      return rand.nextDouble();
   }
}