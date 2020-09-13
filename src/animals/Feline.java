package animals;

//OO term abstract class
//override Animal's methods and encapsulate based off of species

/*When a Feline is given a sleep command, there is a 30% chance it will roam instead, 
 *a 30% chance it will make noise, and a 40% chance it will sleep.
 */
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
