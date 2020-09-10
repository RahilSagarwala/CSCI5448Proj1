package animals;

public class FelineStub extends Feline {
   @Override
   public void makeNoise() {
      System.out.println("Feline make noise.");
      return;
   }

   @Override
   public String getName() {
      return "Name";
   }

   @Override
   public String getType() {
      return "Feline";
   }
}
