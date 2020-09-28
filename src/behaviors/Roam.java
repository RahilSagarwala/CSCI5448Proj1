package behaviors;
import animals.Animal;

public class Roam implements Behavior {

   public String takeAction(Animal animal) {
      String output = animal.getName() + " the " + animal.getType() + " roams.";
      return output;
   }

}
