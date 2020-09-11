package animals;

import org.junit.jupiter.api.Test;
import randomChance.randomChanceStub;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DogTest {

   randomChanceStub r = new randomChanceStub();
   Animal dog = new Dog();

   // Using line separator as found in
   // https://stackoverflow.com/questions/4008223/print-in-new-line-java/42626516
   String nL = System.getProperty("line.separator");

   // Capture standard out code used from:
   // https://stackoverflow.com/questions/1119385/junit-test-for-system-out-println
   private final ByteArrayOutputStream sOut = new ByteArrayOutputStream();
   private final PrintStream oOut = System.out;

   @org.junit.jupiter.api.BeforeEach
   public void configStream(){ System.setOut(new PrintStream(sOut)); }

   @org.junit.jupiter.api.AfterEach
   public void restoreStream(){
      System.setOut(new PrintStream(oOut));
   }

   @Test
   void makeNoise() {
      dog.makeNoise();
      assertEquals("Name the Dog woof." + nL, sOut.toString());
   }

   @org.junit.jupiter.api.Test
   void dog_roam_rand_0() {
      r.setRet(0);
      dog.setRandomChance(r);
      dog.roam();
      assertEquals("Name the Dog digs." + nL, sOut.toString());
   }

   @org.junit.jupiter.api.Test
   void dog_roam_rand_1() {
      r.setRet(1);
      dog.setRandomChance(r);
      dog.roam();
      assertEquals("Name the Dog roams." + nL, sOut.toString());
   }
}