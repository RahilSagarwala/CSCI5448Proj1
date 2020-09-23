package behaviors;
import animals.Animal;

public class Stalk implements RoamBehavior {

   public String roam(Animal animal) {
      String output = animal.getName() + " the " + animal.getType() + " stalks.";
      return output;
   }
}
