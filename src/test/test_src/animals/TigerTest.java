package animals;

import org.junit.jupiter.api.Test;
import randomChance.randomChanceStub;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class TigerTest {

   randomChanceStub r = new randomChanceStub();
   Animal tiger = new Tiger();

   // Using line separator as found in
   // https://stackoverflow.com/questions/4008223/print-in-new-line-java/42626516
   String nL = System.getProperty("line.separator");

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
   void tiger_makeNoise() {
      tiger.makeNoise();
      assertEquals("Name the Tiger chuffs." + nL, sOut.toString());
   }

   @Test
   void tiger_roam() {
      tiger.roam();
      assertEquals("Name the Tiger stalks." + nL, sOut.toString());
   }

   @org.junit.jupiter.api.Test
   void tiger_sleep_rand_4() {
      r.setRet(4);
      tiger.setRandomChance(r);
      tiger.sleep();
      assertEquals("Name the Tiger chuffs." + nL, sOut.toString());
   }

   @org.junit.jupiter.api.Test
   void tiger_sleep_rand_8() {
      r.setRet(8);
      tiger.setRandomChance(r);
      tiger.sleep();
      assertEquals("Name the Tiger sleeps." + nL, sOut.toString());
   }

   @org.junit.jupiter.api.Test
   void tiger_sleep_rand_1() {
      r.setRet(1);
      tiger.setRandomChance(r);
      tiger.sleep();
      assertEquals("Name the Tiger stalks." + nL, sOut.toString());
   }
}