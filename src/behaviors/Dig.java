package behaviors;
import animals.Animal;

public class Dig implements RoamBehavior {

   public String roam(Animal animal) {
      String output = animal.getName() + " the " + animal.getType() + " digs.";
      return output;
   }
}
