package animals;

//OO term abstract class since Canine does not implement all the abstract methods
// it inherits from the Animal super class.
//override Animal's methods to provide a concrete implementation that is shared
// by all canines.

public abstract class Canine extends Animal {

   // This overridden method is an example of polymorphism
   @Override
   public void eat() {
      String output = this.getName() + " the " + this.getType() + " scarfs down its food.";
      System.out.println(output);
   }
}
