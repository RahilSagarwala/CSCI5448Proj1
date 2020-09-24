package clock;

import observer.iSubject;

public abstract class Clock {
   public abstract void tick();

   public abstract void setClockStart(int s);

   public abstract void setClockEnd(int e);

   public abstract void setClockDays(int d);

   public abstract void setSubject(iSubject s);

   public abstract int getCurrentTime();

   public abstract int getCurrentDay();

   public abstract void start();

   public abstract iSubject getSubject();
}
