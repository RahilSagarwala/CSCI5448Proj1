package randomChance;

import java.util.Random;

//OO term delegation as in put in a separate class to further abstraction
//randomChance produces a random integer from 0 to that number excluding that number
public class randomChance {
   public int getChance(int i) {
      Random rand = new Random();
      return rand.nextInt(i);
   }
}
