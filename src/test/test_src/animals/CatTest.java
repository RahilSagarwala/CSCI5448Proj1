package animals;

import org.junit.jupiter.api.Test;
import randomChance.randomChanceStub;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class CatTest {

   randomChanceStub r = new randomChanceStub();
   Animal cat = new Cat();

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
      cat.makeNoise();
      assertEquals("Name the Cat purrrrs.\n", sOut.toString());
   }

   @org.junit.jupiter.api.Test
   void cat_sleep_rand_4() {
      r.setRet(4);
      cat.setRandomChance(r);
      cat.sleep();
      assertEquals("Name the Cat purrrrs.\n", sOut.toString());
   }

   @org.junit.jupiter.api.Test
   void cat_sleep_rand_8() {
      r.setRet(8);
      cat.setRandomChance(r);
      cat.sleep();
      assertEquals("Name the Cat sleeps.\n", sOut.toString());
   }

   @org.junit.jupiter.api.Test
   void cat_sleep_rand_1() {
      r.setRet(1);
      cat.setRandomChance(r);
      cat.sleep();
      assertEquals("Name the Cat roams.\n", sOut.toString());
   }
}