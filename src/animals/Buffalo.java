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

   @Override
   public void makeNoise() {
      String output = this.getName() + " the " + this.getType() + " buff.";
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


   private String myName;
   private static String myType = "Buffalo";
}
