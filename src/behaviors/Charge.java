package behaviors;
import animals.Animal;

public class Charge implements Behavior {

   public String takeAction(Animal animal) {
      String output = animal.getName() + " the " + animal.getType() + " charges.";
      return output;
   }
}
