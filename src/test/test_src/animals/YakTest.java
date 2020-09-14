package animals;

import org.junit.jupiter.api.Test;
import randomChance.randomChanceStub;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class YakTest {

   randomChanceStub r = new randomChanceStub();
   Animal yak = new Yak();

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

   @Test
   void makeNoise() {
      yak.makeNoise();
      assertEquals("Name the Yak yak." + nL, sOut.toString());
   }
}
