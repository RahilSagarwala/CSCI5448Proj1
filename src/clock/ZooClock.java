package clock;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

public class ZooClock extends Clock {
   public ZooClock(){
      super();
      subject = new PropertyChangeSupport(this);
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
   public void addObserver(PropertyChangeListener o) {
      subject.addPropertyChangeListener("clock",o);
   }

   @Override
   public void removeObserver(PropertyChangeListener o) {
      subject.removePropertyChangeListener("clock",o);
   }

   @Override
   public void notifyObservers(Object oldObj, Object newObj) {
      subject.firePropertyChange("clock", oldObj, newObj);
   }

   private void tick() {
      this.printTime();
      this.notifyObservers(currentTime-1, currentTime);
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
   private PropertyChangeSupport subject;
   private int currentTime;
   private int startTime;
   private int endTime;
   private int numDays;
   private int currentDay;
}
