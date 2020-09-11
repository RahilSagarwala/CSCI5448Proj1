package animals;

public class PachydermStub extends Pachyderm {
   @Override
   public void makeNoise() {
      System.out.println("Pachyderm make noise.");
      return;
   }

   @Override
   public String getName() {
      return "Name";
   }

   @Override
   public String getType() {
      return "Pachyderm";
   }
}
