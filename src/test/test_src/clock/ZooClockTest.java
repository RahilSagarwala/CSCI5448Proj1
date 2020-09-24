package clock;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class ZooClockTest {

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
   void test_ZooClock_Start_Two_Hours() {
      ZooClock clock = new ZooClock();
      clock.setClockStart(8);
      clock.setClockEnd(9);
      clock.startClock();
      String expected = "~~~~~~~~~~~~~~~~~ Day 1 ~~~~~~~~~~~~~~~~~" + nL +
            "Ding Dong Ding Dong - it is 800 o'clock!" + nL +
            "Ding Dong Ding Dong - it is 900 o'clock!" + nL;
      assertEquals(expected, sOut.toString());
   }
}