package behaviors;
import animals.Animal;

public class HeadButt implements RoamBehavior {

   public String roam(Animal animal) {
      String output = animal.getName() + " the " + animal.getType() + " headbutts.";
      return output;
   }
}
