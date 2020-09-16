package animals;

import nameGenerator.nameGenerator;


//Buffalo and Yak classes exhibit polymorphism as they are both subclasses of Bovinae
public class Buffalo extends Bovinae {
   public Buffalo() {
      super();
      //TODO: Implement name generation
      myName = "Name";
   }

   public Buffalo(nameGenerator ng) {
      super();
      myName = ng.getUniqueName(myType);
   }

   // This overridden method is an example of polymorphism
   @Override
   public void makeNoise() {
      String output = this.getName() + " the " + this.getType() + " buff.";
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
   private static String myType = "Buffalo";
}
