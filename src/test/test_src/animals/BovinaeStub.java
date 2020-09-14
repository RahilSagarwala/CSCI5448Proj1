package animals;

public class BovinaeStub extends Bovinae {
   @Override
   public void makeNoise() {
      System.out.println("Bovinae make noise.");
      return;
   }

   @Override
   public String getName() {
      return "Name";
   }

   @Override
   public String getType() { return "Bovinae"; }
}
