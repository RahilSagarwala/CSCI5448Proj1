package clock;

import observer.ClockSubject;
import observer.iObserver;
import observer.iSubject;

public class ZooClock extends Clock {
   public ZooClock(){
      super();
      subject = new ClockSubject();
      // Default to running for one day.
      numDays = 1;
      currentDay = 1;
      startTime = 0;
      endTime = 24;
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
   public int getCurrentTime() {
      return currentTime;
   }

   @Override
   public int getCurrentDay() {
      return currentDay;
   }

   @Override
   public void startClock() {
      while(currentDay <= numDays) {
         currentTime = startTime;
         printDay();
         while (currentTime <= endTime) {
            this.tick();
         }
         currentDay++;
      }
   }

   // Methods to make the clock object observable
   // The functionality is delegated to the clock subject object.
   @Override
   public void addObserver(iObserver o) {
      subject.addObserver(o);
   }

   @Override
   public void removeObserver(iObserver o) {
      subject.removeObserver(o);
   }

   @Override
   public void notifyObservers(iSubject s) {
      subject.notifyObservers(this);
   }

   private void tick() {
      this.printTime();
      this.notifyObservers(null);
      currentTime++;
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
