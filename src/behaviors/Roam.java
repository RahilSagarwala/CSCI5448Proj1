package behaviors;
import animals.Animal;

public class Roam implements RoamBehavior {

   public String roam(Animal animal) {
      String output = animal.getName() + " the " + animal.getType() + " roams.";
      return output;
   }

}
