package randomChance;

import java.util.Random;

public class randomChance {
   public int getChance(int i){
      Random rand = new Random();
      return rand.nextInt(i);
   }
}
