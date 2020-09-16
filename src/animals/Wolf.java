package animals;

import nameGenerator.nameGenerator;

//Dog and Wolf classes exhibit polymorphism as they are both subclasses of Canine
public class Wolf extends Canine {

   public Wolf() {
      super();
      //TODO: Implement name generation
      myName = "Name";
   }

   public Wolf(nameGenerator ng) {
      super();

      // Get unique name is an example of object identity since the name
      // generator returns a unique name for each object.
      myName = ng.getUniqueName(myType);
   }

   // This overridden method is an example of polymorphism
   @Override
   public void makeNoise() {
      String output = this.getName() + " the " + this.getType() + " awoo.";
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

   // Private Member variables are an example of encapsulation
   private String myName;
   private static String myType = "Wolf";
}
