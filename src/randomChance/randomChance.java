package randomChance;

import java.util.Random;

//OO term delegation as in put in a separate class to further abstraction
//OO term identity, often times this class is used for random identity
//randomChance produces a random integer from 0 to that number exlcuding that number
public class randomChance {
   public int getChance(int i) {
      Random rand = new Random();
      return rand.nextInt(i);
   }
}
