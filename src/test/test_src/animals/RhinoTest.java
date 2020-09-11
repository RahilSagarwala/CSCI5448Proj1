package animals;

import randomChance.randomChance;
import randomChance.randomChanceStub;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class RhinoTest {
   randomChanceStub r = new randomChanceStub();
   Animal rhino = new Rhino();
   
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

   @org.junit.jupiter.api.Test
   void sleep_rand_0() {
      r.setRet(0);
      rhino.setRandomChance(r);
      rhino.sleep();
      assertEquals("Name the Rhino roams." + nL, sOut.toString());
   }

   @org.junit.jupiter.api.Test
   void sleep_rand_1() {
      r.setRet(1);
      rhino.setRandomChance(r);
      rhino.sleep();
      assertEquals("Name the Rhino roams." + nL, sOut.toString());
   }

   @org.junit.jupiter.api.Test
   void sleep_rand_2() {
      r.setRet(2);
      rhino.setRandomChance(r);
      rhino.sleep();
      assertEquals("Name the Rhino roams." + nL, sOut.toString());
   }

   @org.junit.jupiter.api.Test
   void sleep_rand_3() {
      r.setRet(3);
      rhino.setRandomChance(r);
      rhino.sleep();
      assertEquals("Rhino make noise." + nL, sOut.toString());
   }

   @org.junit.jupiter.api.Test
   void sleep_rand_4() {
      r.setRet(4);
      rhino.setRandomChance(r);
      rhino.sleep();
      assertEquals("Rhino make noise." + nL, sOut.toString());
   }

   @org.junit.jupiter.api.Test
   void sleep_rand_5() {
      r.setRet(5);
      rhino.setRandomChance(r);
      rhino.sleep();
      assertEquals("Rhino make noise." + nL, sOut.toString());
   }

   @org.junit.jupiter.api.Test
   void sleep_rand_6() {
      r.setRet(6);
      rhino.setRandomChance(r);
      rhino.sleep();
      assertEquals("Name the Rhino sleeps." + nL, sOut.toString());
   }

   @org.junit.jupiter.api.Test
   void sleep_rand_7() {
      r.setRet(7);
      rhino.setRandomChance(r);
      rhino.sleep();
      assertEquals("Name the Rhino sleeps." + nL, sOut.toString());
   }

   @org.junit.jupiter.api.Test
   void sleep_rand_8() {
      r.setRet(8);
      rhino.setRandomChance(r);
      rhino.sleep();
      assertEquals("Name the Rhino sleeps." + nL, sOut.toString());
   }

   @org.junit.jupiter.api.Test
   void sleep_rand_9() {
      r.setRet(9);
      rhino.setRandomChance(r);
      rhino.sleep();
      assertEquals("Name the Rhino sleeps." + nL, sOut.toString());
   }
}