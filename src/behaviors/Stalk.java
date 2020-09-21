package behaviors;

public class Stalk implements RoamBehavior {

   public String roam(String name, String type) {
      String output = name + " the " + type + " stalks.";
      return output;
   }
}
