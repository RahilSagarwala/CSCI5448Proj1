package clock;

import observer.iSubject;

public abstract class Clock {
   public abstract void tick();

   public abstract void setClockStart(int s);

   public abstract void setClockEnd(int e);

   public abstract void setSubject(iSubject s);

   public abstract int getCurrentTime();

   public abstract void start();

   public abstract iSubject getSubject();
}
