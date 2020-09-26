/*
package observer;

import java.util.ArrayList;
import java.util.List;

// Code for this class references:
// https://learning.oreilly.com/library/view/head-first-design/0596007124/ch02.html
public class ClockSubject implements iSubject {
   public ClockSubject(){
      super();
      observers = new ArrayList<iObserver>();
   }

   @Override
   public void addObserver(iObserver o) {
      if(!observers.contains(o)) {
         observers.add(o);
      }
   }

   @Override
   public void removeObserver(iObserver o) {
      if(observers.contains(o)){
         observers.remove(observers.indexOf(o));
      }
   }

   @Override
   public void notifyObservers(iSubject s) {
      iSubject sub = this;
      if (s != null) {
         sub = s;
      }
      for ( iObserver o:observers ) {
         o.update(sub);
      }
   }

   private List<iObserver> observers;
}

 */
