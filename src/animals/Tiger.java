package animals;

public class Tiger extends Feline {
   // Constructor
   public Tiger(){
      super();
      //TODO: Implement name generation
      myName = "Name";
   }

   @Override
   public void makeNoise() {

   }

   @Override
   public String getName() {
      return null;
   }

   @Override
   public String getType() {
      return null;
   }

   // Member variables
   private String myName;
   private static String myType = "Tiger";
}
