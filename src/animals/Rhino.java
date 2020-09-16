package animals;

import nameGenerator.nameGenerator;

//Rhino, Hippo, and Elephant classes exhibit polymorphism as they are both subclasses of Pachyderm
public class Rhino extends Pachyderm {

   public Rhino() {
      super();
      //TODO: Implement name generation
      myName = "Name";
   }

   public Rhino(nameGenerator ng) {
      super();

      // Get unique name is an example of object identity
      myName = ng.getUniqueName(myType);
   }

   // This overridden method is an example of polymorphism
   @Override
   public void makeNoise() {
      String output = this.getName() + " the " + this.getType() + " Rhiiiii.";
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

   // Private member variables are an example of encapsulation.
   private String myName;
   private static String myType = "Rhino";
}
