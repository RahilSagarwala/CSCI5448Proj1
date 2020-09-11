package animals;

import org.junit.jupiter.api.Test;
import randomChance.randomChanceStub;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class WolfTest {

   randomChanceStub r = new randomChanceStub();
   Animal wolf = new Wolf();

   // Capture standard out code used from:
   // https://stackoverflow.com/questions/1119385/junit-test-for-system-out-println
   private final ByteArrayOutputStream sOut = new ByteArrayOutputStream();
   private final PrintStream oOut = System.out;

   @org.junit.jupiter.api.BeforeEach
   public void configStream(){
      System.setOut(new PrintStream(sOut));
   }

   @org.junit.jupiter.api.AfterEach
   public void restoreStream(){
      System.setOut(new PrintStream(oOut));
   }

   @Test
   void makeNoise() {
      wolf.makeNoise();
      assertEquals("Name the Wolf awoo.\n", sOut.toString());
   }

   @org.junit.jupiter.api.Test
   void wolf_roam_rand_0() {
      r.setRet(0);
      wolf.setRandomChance(r);
      wolf.roam();
      assertEquals("Name the Wolf digs.\n", sOut.toString());
   }

   @org.junit.jupiter.api.Test
   void wolf_roam_rand_1() {
      r.setRet(1);
      wolf.setRandomChance(r);
      wolf.roam();
      assertEquals("Name the Wolf roams.\n", sOut.toString());
   }
}