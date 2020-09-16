package animals;

import nameGenerator.nameGenerator;

// Buffalo and Yak classes exhibit polymorphism as they are both subclasses of Bovinae
// and they override methods from the super classes
public class Yak extends Bovinae {
   public Yak() {
      super();
      //TODO: Implement name generation
      myName = "Name";
   }

   public Yak(nameGenerator ng) {
      super();
      // Having the name generator get a unique name for the
      // instance is an example of object identity
      myName = ng.getUniqueName(myType);
   }

   // This overridden method is an example of polymorphism
   @Override
   public void makeNoise() {
      String output = this.getName() + " the " + this.getType() + " yak.";
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
   private static String myType = "Yak";
}
