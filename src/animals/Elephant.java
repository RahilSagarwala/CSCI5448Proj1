package animals;

import nameGenerator.nameGenerator;

//Rhino, Hippo, and Elephant classes exhibit polymorphism as they are both subclasses of Pachyderm
public class Elephant extends Pachyderm {

   public Elephant() {
      super();
      //TODO: Implement name generation
      myName = "Name";
   }

   public Elephant(nameGenerator ng) {
      super();

      // Get unique name
      myName = ng.getUniqueName(myType);
   }

   // This overridden method is an example of polymorphism
   @Override
   public void makeNoise() {
      String output = this.getName() + " the " + this.getType() + " Elllll.";
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

   // Member variables
   // These private variables are an example of encapsulation.
   private String myName;
   private static String myType = "Elephant";
}
