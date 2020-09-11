package animals;

public class CanineStub extends Canine {
   @Override
   public void makeNoise() {
      System.out.println("Canine make noise.");
      return;
   }

   @Override
   public String getName() {
      return "Name";
   }

   @Override
   public String getType() {
      return "Canine";
   }
}
