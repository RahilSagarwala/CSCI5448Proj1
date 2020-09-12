package animals;

import nameGenerator.nameGenerator;

public class Lion extends Feline {

   public Lion(){
      super();
      //TODO: Implement Name generator
      myName = "Name";
   }

   public Lion(nameGenerator ng){
      super();

      // Get unique name
      myName = ng.getUniqueName(myType);
   }

   // Implement the abstract method from the Animal class
   @Override
   public void makeNoise() {
      String output = this.getName() + " the " + this.getType() + " roars.";
      System.out.println(output);
   }

   // Implement the abstract method from the Animal class
   @Override
   public String getName() {
      return myName;
   }

   // Implement the abstract method from the Animal class
   @Override
   public String getType() {
      return myType;
   }

   // Member variables that are private representing
   // data encapsulation
   private String myName;
   private static String myType = "Lion";
}
