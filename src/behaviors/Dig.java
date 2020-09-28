package behaviors;
import animals.Animal;

public class Dig implements Behavior {

   public String takeAction(Animal animal) {
      String output = animal.getName() + " the " + animal.getType() + " digs.";
      return output;
   }
}
