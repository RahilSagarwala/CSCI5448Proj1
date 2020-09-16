package animals;

import nameGenerator.nameGenerator;

import java.util.Random;

//Tiger and Cat classes exhibit polymorphism as they are both subclasses of Feline
public class Cat extends Feline {
   // Constructor
   public Cat() {
      super();
      //TODO: Implement name generation
      myName = "Name";
   }

   public Cat(nameGenerator ng) {
      super();

      // Get unique name is an example of object identity.
      myName = ng.getUniqueName(myType);
   }

   // This overridden method is an example of polymorphism
   @Override
   public void makeNoise() {
      String output = this.getName() + " the " + this.getType() + " purrrrs.";
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

   // Member variables are an example of encapsulation.
   private String myName;
   private static String myType = "Cat";
}
