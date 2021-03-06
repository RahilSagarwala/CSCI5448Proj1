package animals;

import randomChance.randomChance;
import randomChance.randomChanceStub;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class FelineTest {
   randomChanceStub r = new randomChanceStub();
   Animal fel = new FelineStub();

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
   void sleep_rand_0() {
      r.setRet(0);
      fel.setRandomChance(r);
      fel.sleep();
      assertEquals("Name the Feline roams." + nL, sOut.toString());
   }

   @org.junit.jupiter.api.Test
   void sleep_rand_1() {
      r.setRet(1);
      fel.setRandomChance(r);
      fel.sleep();
      assertEquals("Name the Feline roams." + nL, sOut.toString());
   }

   @org.junit.jupiter.api.Test
   void sleep_rand_2() {
      r.setRet(2);
      fel.setRandomChance(r);
      fel.sleep();
      assertEquals("Name the Feline roams." + nL, sOut.toString());
   }

   @org.junit.jupiter.api.Test
   void sleep_rand_3() {
      r.setRet(3);
      fel.setRandomChance(r);
      fel.sleep();
      assertEquals("Feline make noise." + nL, sOut.toString());
   }

   @org.junit.jupiter.api.Test
   void sleep_rand_4() {
      r.setRet(4);
      fel.setRandomChance(r);
      fel.sleep();
      assertEquals("Feline make noise." + nL, sOut.toString());
   }

   @org.junit.jupiter.api.Test
   void sleep_rand_5() {
      r.setRet(5);
      fel.setRandomChance(r);
      fel.sleep();
      assertEquals("Feline make noise." + nL, sOut.toString());
   }

   @org.junit.jupiter.api.Test
   void sleep_rand_6() {
      r.setRet(6);
      fel.setRandomChance(r);
      fel.sleep();
      assertEquals("Name the Feline sleeps." + nL, sOut.toString());
   }

   @org.junit.jupiter.api.Test
   void sleep_rand_7() {
      r.setRet(7);
      fel.setRandomChance(r);
      fel.sleep();
      assertEquals("Name the Feline sleeps." + nL, sOut.toString());
   }

   @org.junit.jupiter.api.Test
   void sleep_rand_8() {
      r.setRet(8);
      fel.setRandomChance(r);
      fel.sleep();
      assertEquals("Name the Feline sleeps." + nL, sOut.toString());
   }

   @org.junit.jupiter.api.Test
   void sleep_rand_9() {
      r.setRet(9);
      fel.setRandomChance(r);
      fel.sleep();
      assertEquals("Name the Feline sleeps." + nL, sOut.toString());
   }
}