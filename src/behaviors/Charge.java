package behaviors;
import animals.Animal;

public class Charge implements RoamBehavior {

   public String roam(Animal animal) {
      String output = animal.getName() + " the " + animal.getType() + " charges.";
      return output;
   }
}
