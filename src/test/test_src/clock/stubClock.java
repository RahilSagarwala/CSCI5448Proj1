package clock;

import java.beans.PropertyChangeListener;
import observer.iSubject;

public class stubClock extends Clock {

   @Override
   public void setClockStart(int s) {

   }

   @Override
   public void setClockEnd(int e) {

   }

   @Override
   public void setClockDays(int d) {

   }


   @Override
   public int getCurrentTime() {
      return currentTime;
   }

   @Override
   public int getCurrentDay() {
      return 0;
   }

   @Override
   public void startClock() {

   }

   @Override
   public void addObserver(PropertyChangeListener o) {

   }

   @Override
   public void removeObserver(PropertyChangeListener o) {

   }

   @Override
   public void notifyObservers(Object o, Object n) {

   }


   public void setCurrTime(int t){
      currentTime = t;
   }

   private int currentTime;

}
