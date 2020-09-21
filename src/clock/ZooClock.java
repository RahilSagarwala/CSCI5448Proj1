package clock;

import observer.ClockSubject;
import observer.iSubject;

public class ZooClock extends Clock {
   ZooClock(){
      super();
      subject = new ClockSubject();
   }

   @Override
   public void tick() {
      currentTime++;
      this.printTime();
      subject.notifyObservers();
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
   public void setSubject(iSubject s) {
      subject = s;
   }

   @Override
   public int getCurrentTime() {
      return 0;
   }

   @Override
   public void start() {
      currentTime = startTime;
      this.printTime();
   }

   @Override
   public iSubject getSubject() {
      return subject;
   }

   private void printTime(){
      String output = "Ding Dong Ding Dong - it is " + currentTime + " o'clock!";
      System.out.println(output);
   }

   //Private Methods
   iSubject subject;
   int currentTime;
   int startTime;
   int endTime;
}
