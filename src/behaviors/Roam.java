package behaviors;

public class Roam implements RoamBehavior {

   public String roam(String name, String type) {
      String output = name + " the " + type + " roams.";
      return output;
   }

}
