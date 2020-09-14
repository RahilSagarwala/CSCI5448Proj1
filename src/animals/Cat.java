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

      // Get unique name
      myName = ng.getUniqueName(myType);
   }

   @Override
   public void makeNoise() {
      String output = this.getName() + " the " + this.getType() + " purrrrs.";
      System.out.println(output);
   }

   @Override
   public String getName() {
      return myName;
   }

   @Override
   public String getType() {
      return myType;
   }

   // Member variables
   private String myName;
   private static String myType = "Cat";
}
