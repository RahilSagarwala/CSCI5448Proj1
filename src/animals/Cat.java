package animals;

import java.util.Random;

public class Cat extends Feline {
   // Constructor
   public Cat(){
      super();
      //TODO: Implement name generation
      String[] names = {"Chloe", "Cutie", "Casey", "Coco", "Chelsie", "Charles",
    		  "Charlie", "CeCe", "CiCi", "C-Dawg"};
      Random random = new Random();
      int randomInt = random.nextInt(10);
      myName = names[randomInt];
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
