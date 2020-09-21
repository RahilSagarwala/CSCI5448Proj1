package behaviors;

public class Dig implements RoamBehavior {

   public String roam(String name, String type) {
      String output = name + " the " + type + " digs.";
      return output;
   }
}
