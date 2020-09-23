package clock;

import observer.ClockSubject;
import observer.iSubject;

public class ZooClock extends Clock {
   public ZooClock(){
      super();
      subject = new ClockSubject();
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
      while(currentTime <= endTime){
         this.tick();
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

   //Private Methods
   iSubject subject;
   int currentTime;
   int startTime;
   int endTime;
}
