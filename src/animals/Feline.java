package animals;

public abstract class Feline extends Animal{

   @Override
   public void sleep() {
      int r = rand.getChance(10);

      if ( r <= 2 ){
         this.roam();
      }
      else if ( r > 2 && r <= 5 ) {
         this.makeNoise();
      }
      else {
         String output = this.getName() + " the " + this.getType() + " sleeps.";
         System.out.println(output);
      }
   }
}
