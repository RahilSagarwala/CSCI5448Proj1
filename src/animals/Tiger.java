package animals;

import java.util.Random;

public class Tiger extends Feline {
   // Constructor
   public Tiger(){
      super();
      //name generation
      String[] names = {"Tina", "Timmy", "T", "Tom", "Tony", "Tim", "T-Dawg",
    		  "Tiny", "Tommy", "TT"};
      Random random = new Random();
      int randomInt = random.nextInt(10);
      myName = names[randomInt];
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
