package animals;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class AnimalTest {

   Animal an = new AnimalStub();

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
   void sleep() {
      an.sleep();
      assertEquals("Name the Animal sleeps.\n", sOut.toString());
   }

   @org.junit.jupiter.api.Test
   void wake() {
      an.wake();
      assertEquals("Name the Animal wakes up.\n", sOut.toString());
   }

   @org.junit.jupiter.api.Test
   void eat() {
      an.eat();
      assertEquals("Name the Animal eats.\n", sOut.toString());
   }

   @org.junit.jupiter.api.Test
   void roam() {
      an.roam();
      assertEquals("Name the Animal roams.\n", sOut.toString());
   }
}