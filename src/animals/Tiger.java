package animals;

import nameGenerator.nameGenerator;
import behaviors.Stalk;

//Tiger and Cat classes exhibit polymorphism as they are both subclasses of Feline
public class Tiger extends Feline {
   // Constructor
   public Tiger() {
      super();
      //name generation
      myName = "Name";
      roamBehavior = new Stalk();
   }

   public Tiger(nameGenerator ng) {
      super();

      // Get unique name is an example of object identity since the name
      // generator gets a unique name for each instance of an object.
      myName = ng.getUniqueName(myType);
   }

   // This overridden method is an example of polymorphism
   @Override
   public void makeNoise() {
      String output = this.getName() + " the " + this.getType() + " chuffs.";
      System.out.println(output);
   }

   // This overridden method is an example of polymorphism
   @Override
   public String getName() {
      return myName;
   }

   // This overridden method is an example of polymorphism
   @Override
   public String getType() {
      return myType;
   }

   // Private member variables are an example of encapsulation
   private String myName;
   private static String myType = "Tiger";
}
