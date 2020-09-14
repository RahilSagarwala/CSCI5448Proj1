package animals;

import randomChance.randomChanceStub;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CanineTest {
   randomChanceStub r = new randomChanceStub();
   Animal animal = new CanineStub();

   // Using line separator as found in
   // https://stackoverflow.com/questions/4008223/print-in-new-line-java/42626516
   String nL = System.getProperty("line.separator");

   // Capture standard out code used from:
   // https://stackoverflow.com/questions/1119385/junit-test-for-system-out-println
   private final ByteArrayOutputStream sOut = new ByteArrayOutputStream();
   private final PrintStream oOut = System.out;

   @org.junit.jupiter.api.BeforeEach
   public void configStream() {
      System.setOut(new PrintStream(sOut));
   }

   @org.junit.jupiter.api.AfterEach
   public void restoreStream() {
      System.setOut(new PrintStream(oOut));
   }

   @org.junit.jupiter.api.Test
   void roam_rand_0() {
      r.setRet(0);
      animal.setRandomChance(r);
      animal.roam();
      assertEquals("Name the Canine digs." + nL, sOut.toString());
   }

   @org.junit.jupiter.api.Test
   void roam_rand_1() {
      r.setRet(1);
      animal.setRandomChance(r);
      animal.roam();
      assertEquals("Name the Canine roams." + nL, sOut.toString());
   }

   @org.junit.jupiter.api.Test
   void roam_rand_2() {
      r.setRet(2);
      animal.setRandomChance(r);
      animal.roam();
      assertEquals("Name the Canine roams." + nL, sOut.toString());
   }

   @org.junit.jupiter.api.Test
   void roam_rand_3() {
      r.setRet(3);
      animal.setRandomChance(r);
      animal.roam();
      assertEquals("Name the Canine roams." + nL, sOut.toString());
   }
}