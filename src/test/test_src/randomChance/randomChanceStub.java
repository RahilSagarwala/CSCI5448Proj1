package randomChance;

public class randomChanceStub extends randomChance {
   private int ret;

   public void setRet(int i){
      ret = i;
   }

   @Override
   public int getChance(int i) {
      return ret;
   }
}
