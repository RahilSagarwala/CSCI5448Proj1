package behaviors;
import animals.Animal;

public class HeadButt implements Behavior {

   public String takeAction(Animal animal) {
      String output = animal.getName() + " the " + animal.getType() + " headbutts.";
      return output;
   }
}
