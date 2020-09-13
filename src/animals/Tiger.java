package animals;

import nameGenerator.nameGenerator;

//Tiger and Cat classes exhibit polymorphism as they are both subclasses of Feline
public class Tiger extends Feline {
   // Constructor
   public Tiger(){
      super();
      //name generation
      myName = "Name";
   }

   public Tiger(nameGenerator ng){
      super();

      // Get unique name
      myName = ng.getUniqueName(myType);
   }

   @Override
   public void makeNoise() {
      String output = this.getName() + " the " + this.getType() + " chuffs.";
      System.out.println(output);
   }

   @Override
   public void roam() {
      String output = this.getName() + " the " + this.getType() + " stalks.";
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
   private static String myType = "Tiger";
}
