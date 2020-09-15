package animals;

//OO term abstract class
//override Animal's methods and encapsulate based off of species

public abstract class Bovinae extends Animal {

   // This overridden method is an example of polymorphism.
   @Override
   public void roam() {
      int r = rand.getChance(2);

      if (r <= 0) {
         this.headButt();
      } else {
         String output = this.getName() + " the " + this.getType() + " roams.";
         System.out.println(output);
      }
   }

   public void headButt(){
      String output = this.getName() + " the " + this.getType() + " headbutts.";
      System.out.println(output);
   }
}
