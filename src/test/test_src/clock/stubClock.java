package clock;

import observer.iSubject;

public class stubClock extends Clock {
   @Override
   public void tick() {

   }

   @Override
   public void setClockStart(int s) {

   }

   @Override
   public void setClockEnd(int e) {

   }

   @Override
   public void setSubject(iSubject s) {

   }

   @Override
   public int getCurrentTime() {
      return currentTime;
   }

   @Override
   public void start() {

   }

   @Override
   public iSubject getSubject() {
      return null;
   }

   public void setCurrTime(int t){
      currentTime = t;
   }

   private int currentTime;
}
