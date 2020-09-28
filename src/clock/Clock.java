package clock;

import observer.iSubject;

public abstract class Clock implements iSubject {

   public abstract void setClockStart(int s);

   public abstract void setClockEnd(int e);

   public abstract void setClockDays(int d);

   public abstract int getCurrentTime();

   public abstract int getCurrentDay();

   public abstract void startClock();
}
