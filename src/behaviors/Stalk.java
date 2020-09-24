package behaviors;
import animals.Animal;

public class Stalk implements Behavior {

   public String takeAction(Animal animal) {
      String output = animal.getName() + " the " + animal.getType() + " stalks.";
      return output;
   }
}
