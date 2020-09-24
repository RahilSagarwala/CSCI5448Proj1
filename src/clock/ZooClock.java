package clock;

import observer.ClockSubject;
import observer.iSubject;

public class ZooClock extends Clock {
   public ZooClock(){
      super();
      subject = new ClockSubject();
      // Default to running for one day.
      numDays = 1;
      currentDay = 1;
   }

   @Override
   public void tick() {
      this.printTime();
      subject.notifyObservers();
      currentTime++;
   }

   @Override
   public void setClockStart(int s) {
      startTime = s;
   }

   @Override
   public void setClockEnd(int e) {
      endTime = e;
   }

   @Override
   public void setClockDays(int d) {
      numDays = d;
   }

   @Override
   public void setSubject(iSubject s) {
      subject = s;
   }

   @Override
   public int getCurrentTime() {
      return currentTime;
   }

   @Override
   public int getCurrentDay() {
      return currentDay;
   }

   @Override
   public void start() {
      while(currentDay <= numDays) {
         currentTime = startTime;
         printDay();
         while (currentTime <= endTime) {
            this.tick();
         }
         currentDay++;
      }
   }

   @Override
   public iSubject getSubject() {
      return subject;
   }

   private void printTime(){
      String output = "Ding Dong Ding Dong - it is " + currentTime + "00 o'clock!";
      System.out.println(output);
   }

   private void printDay(){
      String output = "~~~~~~~~~~~~~~~~~ Day " + currentDay + " ~~~~~~~~~~~~~~~~~";
      System.out.println(output);
   }

   //Private Attributes
   private iSubject subject;
   private int currentTime;
   private int startTime;
   private int endTime;
   private int numDays;
   private int currentDay;
}
